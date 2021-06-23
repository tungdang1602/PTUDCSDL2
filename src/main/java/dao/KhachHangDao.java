/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Admin
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.KhachHang;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class KhachHangDao {
    
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void ThemKH(KhachHang kh) {
        String sql = String.format("insert into khachhang (hoten,diachi,dienthoai,taikhoan) values('%s','%s','%s','%s')", kh.getHoten(), kh.getDiachi(), kh.getDienthoai(), kh.getTaikhoan());
        template.update(sql);
    }

    public int CapNhatKH(KhachHang kh) {
        String sql = String.format("update khachhang set hoten='%s',diachi='%s', dienthoai='%s', taikhoan='%s' where makh=%d",kh.getHoten(),kh.getDiachi(),kh.getDienthoai(),kh.getTaikhoan(),kh.getMakh());
        return template.update(sql);
    }

    public int XoaKH(int makh) {
        String sql = "delete from khachhang where makh = " + makh;
        return template.update(sql);
    }

    public KhachHang TimKiemKhachHangTheoMakh(int makh) {
        String sql = "select * from khachhang where makh=?";
        return template.queryForObject(sql, new Object[]{makh}, new BeanPropertyRowMapper<KhachHang>(KhachHang.class));
    }

    public List<KhachHang> LayDanhSachKhachHang() {
        return template.query("select * from khachhang order by makh", new RowMapper<KhachHang>() {
            public KhachHang mapRow(ResultSet rs, int row) throws SQLException {
                KhachHang e = new KhachHang();
                e.setMakh(rs.getInt(1));
                e.setHoten(rs.getString(2));
                e.setDiachi(rs.getString(3));
                e.setDienthoai(rs.getString(4));
                e.setTaikhoan(rs.getBigDecimal(5));
                return e;
            }
        });
    }
    
}
