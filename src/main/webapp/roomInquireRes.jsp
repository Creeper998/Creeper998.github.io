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
    <link rel="stylesheet" type="text/css" href="css/roomInqueryImg.css"/>
    <link rel="stylesheet" type="text/css" href="css/btn.css"/>
</head>
<body>
<br/>
<br/>
<table align="center" border="1" cellpadding="20" cellspacing="0">
    <thead>
    <tr bgcolor="#e6e6fa">
        <th>房间号</th>
        <th>客房等级</th>
        <th>房间状态</th>
        <th>床位数</th>
        <th>标准客房/天</th>
        <th>用户</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${rooms}" var="room" varStatus="status">
        <tr>
            <td bgcolor="#f5f5dc">
                <font color="orange">${room.roomN}</font>
            </td>
            <td bgcolor="#deb887">${room.roomClass}</td>
            <td bgcolor="#deb887">${room.roomStatus}</td>
            <td bgcolor="#deb887">${room.bedN}</td>
            <td bgcolor="#deb887">${room.money}</td>
            <td bgcolor="#deb887">${room.username}</td>
            <td bgcolor="#deb887">
                <input type="button" value="删除" class="delBtn"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br/>
<br/>
<div align="center">
    <button onclick="window.location.href='/hotel-demo/roomQuery.jsp'">返&emsp;回</button>
</div>


</body>
</html>
