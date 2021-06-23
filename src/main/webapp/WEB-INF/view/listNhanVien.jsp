<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Danh sach nhan vien</h1>
        <input type="search" name="timkiemnv" href="./timkiem.html?manv=${nv.manv}">
        <input type="submit">
        <table border="1" cellspacing="0" cellpadding="0">
            <th>Manv</th>
            <th>Hoten</th>
            <th>Diachi</th>
            <th>DienThoai</th>

            <c:forEach var="nv" items="${list}">
                <tr>
                    <td> ${nv.manv} </td>
                    <td> ${nv.hoten} </td>
                    <td> ${nv.diachi} </td>
                    <td> ${nv.dienthoai} </td>
                    <td><a href="./edit.html?manv=${nv.manv}">Edit</a></td>
                    <td><a href="./delete.html?manv=${nv.manv}" onclick="return confirm('Ban co chac chan muon xoa nhan vien?')">Delete</a> </td>
                    
                </tr>
            </c:forEach>
        </table>
        <a href="./add.html">Them nhan vien</a>
    </body>
</html>
