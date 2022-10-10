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
    <link rel="stylesheet" type="text/css" href="css/userInqueryImg.css"/>
    <link rel="stylesheet" type="text/css" href="css/btn.css"/>
</head>
<body>
<br/>
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
                <input type="button" value="删除" class="delBtn"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br/>
<br/>
<div align="center">
    <button onclick="javascript:history.back();">返&emsp;回</button>
</div>

</body>
</html>
