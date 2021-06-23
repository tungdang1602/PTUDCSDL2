<%-- 
    Document   : editKhachHang
    Created on : Jun 21, 2021, 3:14:42 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cap nhap khach hang</h1>
        <form action="./saveKhachHang.html" method="POST">
            <input type="hidden" name="manv" value="${nv.manv}"/>
            Ho ten: <input type="text" name="hoten" value="${nv.hoten}"/> <br/>
            Dia chi: <input type="text" name="diachi" value="${nv.diachi}" /> <br/>
            Dien thoai: <input type="text" name="dienthoai" value="${nv.dienthoai}"/> <br/>
            taikhoan: <input type="text" name="taikhoan" value="${nv.taikhoan}"/> <br/>
            <input type="submit" value="Cap Nhat"/>
        </form>
    </body>
</html>

