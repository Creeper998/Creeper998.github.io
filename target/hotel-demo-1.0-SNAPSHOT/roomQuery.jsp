<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>酒店管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/roomOper.css" />
    <link rel="stylesheet" type="text/css" href="css/hotelLogin.css" />
</head>
<body>
<div class="login-box">
    <h2>查询客房</h2>
    <form action="/hotel-demo/roomSelectServlet" id="form" method="post">
        <div class="login-field">
            <input type="text" name="roomN"/>
            <label>房间号</label>
        </div>
        <div class="login-field">
            <input type="text" name="roomClass"/>
            <label>客房等级</label>
        </div>
        <div class="login-field">
            <input type="text" name="roomStatus"/>
            <label>房间状态</label>
        </div>
        <div class="login-field">
            <input type="text" name="bedN"/>
            <label>床位数</label>
        </div>
        <div class="login-field">
            <input type="text" name="money" />
            <label>标准客房/天</label>
        </div>
        <div class="login-field">
            <input type="text" name="username"/>
            <label>客户</label>
        </div>
        &emsp;&emsp;&emsp;
        <button type="submit">查&emsp;询</button>
        &emsp;&emsp;&emsp;
        <button type="button" onclick="window.location.href='/hotel-demo/selectAllServlet'">返&emsp;回</button>
    </form>


</div>
</body>
</html>
