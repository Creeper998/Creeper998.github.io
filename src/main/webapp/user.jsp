<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>酒店管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/menu.css"/>
    <link rel="stylesheet" type="text/css" href="css/btn.css"/>
</head>
<body>
<br/>
<div align="center">
    <input type="button" value="客房管理" onclick="window.location.href='http://localhost:8080/hotel-demo/selectAllServlet';" class="changeBtn"/>
</div>
<br/>
<table align="center" border="1" cellpadding="20" cellspacing="0">
    <thead>
    <tr bgcolor="#e6e6fa">
        <th>身份证</th>
        <th>客户名</th>
        <th>手机号码</th>
        <th>客房号</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user" varStatus="status">
        <tr>
            <td bgcolor="#f5f5dc">
                <font color="orange">${user.id}</font>
            </td>
            <td>${user.username}</td>
            <td>${user.tel}</td>
            <td>${user.roomN}</td>
            <td>
                <input type="button" value="删除" class="delBtn" onclick="window.location.href='/hotel-demo/userDeleteServlet?id=${user.id},roomN=${user.roomN}';"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br/>
<br/>

<div align="center">
    <input type="button" value="增加" class="btn" onclick="window.location.href='userAdd.jsp';"/>
    &emsp;&emsp;&emsp;
    <input type="button" value="修改" class="btn" onclick="window.location.href='userUpdate.jsp';"/>
    &emsp;&emsp;&emsp;
    <input type="button" value="查询" class="btn" onclick="window.location.href='userQuery.jsp';"/>
</div>
</body>
</html>
