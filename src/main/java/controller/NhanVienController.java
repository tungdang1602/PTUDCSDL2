
package controller;

import dao.NhanVienDao;
import java.util.List;

import model.NhanVien;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NhanVienController {
    
    private static final Logger logger = Logger.getLogger(NhanVienController.class);

    @Autowired
    NhanVienDao daonv;
    @RequestMapping(value = "/nhanvien/list",method = RequestMethod.GET)
    public ModelAndView LayDanhSach(){
        logger.info("Xu ly lay danh sach nhan vien");
        List<NhanVien> lst = daonv.LayDanhSachNhanVien();
        return new ModelAndView("listNhanVien", "list",lst);
        
    }
        
    @RequestMapping(value = "/nhanvien/add")
    public ModelAndView Them_ui(){
        logger.info("Hien thi giao dien them nhan vien moi");
        return new ModelAndView("add");
        
    }
    
    @RequestMapping(value = "/nhanvien/save",method = RequestMethod.POST)
    public String Them(NhanVien nv){
        if(nv.getManv()==0){
            logger.info("Them nhan vien moi");
            daonv.Them(nv);
        }
        else{
            daonv.CapNhat(nv);
            logger.info("Cap nhat nhan vien");
        }
        return "redirect:/nhanvien/list.html";
        
    }
    
    @RequestMapping(value = "/nhanvien/edit")
    public ModelAndView CapNhat_ui(@RequestParam("manv") int manv){
        NhanVien nv = daonv.TimKiemNhanVienTheoManv(manv);
        return new ModelAndView("edit","nv",nv);
        
    }
    
    @RequestMapping(value = "/nhanvien/delete")
    public String Xoa(@RequestParam("manv") int manv){
        daonv.Xoa(manv);
        return "redirect:/nhanvien/list.html";
        
    }
    
    @RequestMapping(value = "/nhanvien/timkiem")
    public String TimKiemNhanVienTheoManv(@RequestParam("manv") int manv){
        daonv.TimKiemNhanVienTheoManv(manv);
        return "redirect:/nhanvien/timkiem.html";
        
    }
    
    
}
