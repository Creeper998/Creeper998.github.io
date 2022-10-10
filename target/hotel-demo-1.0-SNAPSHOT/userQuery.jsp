<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>酒店管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/userOper.css" />
    <link rel="stylesheet" type="text/css" href="css/hotelLogin.css" />
</head>
<body>
<div class="login-box">
    <h2>查询用户</h2>
    <form action="/hotel-demo/userSelectServlet" id="form" method="post">
        <div class="login-field">
            <input type="text" name="id" />
            <label>身份证号</label>
        </div>
        <div class="login-field">
            <input type="text" name="username" />
            <label>客户名</label>
        </div>
        <div class="login-field">
            <input type="text" name="tel"  />
            <label>电话号码</label>
        </div>
        <div class="login-field">
            <input type="text" name="roomN" />
            <label>客房号</label>
        </div>
        &emsp;&emsp;&emsp;
        <button type="submit" >查&emsp;询</button>
        &emsp;&emsp;&emsp;
        <button type="button" onclick="window.location.href='/hotel-demo/userSelectAllServlet';">返&emsp;回</button>
    </form>

</div>
</body>
</html>
