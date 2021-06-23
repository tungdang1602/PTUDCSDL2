<%-- 
    Document   : addKhachHang
    Created on : Jun 21, 2021, 3:14:33 PM
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
        <h1>Them khach hang</h1>
        <form action="./save.html" method="POST">
            Ho ten: <input type="text" name="hoten"/> <br/>
            Dia chi: <input type="text" name="diachi" /> <br/>
            Dien thoai: <input type="text" name="dienthoai" /> <br/>
            Tai khoan: <input type="text" name="taikhoan" /> <br/>
            <input type="submit" value="Luu"/>
        </form>
    </body>
</html>
