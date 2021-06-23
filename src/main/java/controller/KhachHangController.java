/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.KhachHangDao;
import java.util.List;
import model.KhachHang;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
public class KhachHangController {
    
    private static final Logger logger = Logger.getLogger(KhachHangController.class);

    @Autowired
    KhachHangDao daokh;
    @RequestMapping(value = "/khachhang/list",method = RequestMethod.GET)
    public ModelAndView LayDanhSachKH(){
        logger.info("Xu ly lay danh sach khach hang");
        List<KhachHang> lst = daokh.LayDanhSachKhachHang();
        return new ModelAndView("listKhachHang", "list",lst);
        
    }
        
    @RequestMapping(value = "/khachhang/addKhachHang")
    public ModelAndView ThemKH_ui(){
        logger.info("Hien thi giao dien them khach hang moi");
        return new ModelAndView("addKhachHang");
        
    }
    
    @RequestMapping(value = "/khachhang/saveKhachHang",method = RequestMethod.POST)
    public String ThemKH(KhachHang kh){
        if(kh.getMakh()==0){
            logger.info("Them khach hang moi");
            daokh.ThemKH(kh);
        }
        else{
            daokh.CapNhatKH(kh);
            logger.info("Cap nhat khach hang");
        }
        return "redirect:/khachhang/list.html";
        
    }
    
    @RequestMapping(value = "/khachhang/editKhachHang")
    public ModelAndView CapNhatKH_ui(@RequestParam("makh") int makh){
        KhachHang kh = daokh.TimKiemKhachHangTheoMakh(makh);
        return new ModelAndView("editKhachHang","kh",kh);
        
    }
    
    @RequestMapping(value = "/khachhang/deleteKhachHang")
    public String XoaKH(@RequestParam("makh") int makh){
        daokh.XoaKH(makh);
        return "redirect:/khachhang/list.html";
        
    }
    
    
}
