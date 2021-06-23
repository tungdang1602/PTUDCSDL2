<%-- 
    Document   : listKhachHang
    Created on : Jun 21, 2021, 3:14:20 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Danh sach khach hang</h1>
        <table border="1" cellspacing="0" cellpadding="0">
            <th>Manv</th>
            <th>Hoten</th>
            <th>Diachi</th>
            <th>DienThoai</th>
            <th>Taikhoan</th>
            <c:forEach var="kh" items="${list}">
                <tr>
                    <td> ${kh.makh} </td>
                    <td> ${kh.hoten} </td>
                    <td> ${kh.diachi} </td>
                    <td> ${kh.dienthoai} </td>
                    <td> ${kh.taikhoan} </td>
                    <td><a href="./editKhachHang.html?makh=${kh.makh}">Edit</a></td>
                    <td><a href="./deleteKhachHang.html?makh=${kh.makh}" onclick="return confirm('Ban co chac chan muon xoa nhan vien?')">Delete</a> </td>
                    
                </tr>
            </c:forEach>
        </table>
        <a href="./addKhachHang.html">Them Khach Hang</a>
    </body>
</html>

