/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class KhachHang  implements Serializable{
    private int makh;
    private String hoten;
    private String diachi;
    private String dienthoai;
    private BigDecimal taikhoan;
    
    public KhachHang() {
    }
    public KhachHang(int manv, String hoten, String diachi, String dienthoai, BigDecimal taikhoan) {
        this.makh = makh;
        this.hoten = hoten;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.taikhoan = taikhoan;
    }
    public int getMakh() {
        return makh;
    }
    public void setMakh(int makh) {
        this.makh = makh;
    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }
    public BigDecimal getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(BigDecimal taikhoan) {
        this.taikhoan = taikhoan;
    }
    
}
