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
    <h2>添加新客房</h2>
    <form action="/hotel-demo/selectByRoomNServlet" id="form" method="post">
        <div class="login-field">
            <input type="text" name="roomN" required="" />
            <label>房间号</label>
        </div>
        <div class="login-field">
            <input type="text" name="roomClass" required="" />
            <label>客房等级</label>
        </div>
        <div class="login-field">
            <input type="text" name="bedN" required="" />
            <label>床位数</label>
        </div>
        <div class="login-field">
            <input type="text" name="money" required="" />
            <label>标准客房/天</label>
        </div>
        &emsp;&emsp;
        <button type="submit">添&emsp;加</button>
        &emsp;&emsp;&emsp;
        <button onclick="window.location.href='/hotel-demo/selectAllServlet'">返&emsp;回</button>
    </form>

</div>
</body>
<script>
    var errori ='<%=request.getAttribute("selectByRoomNServlet_msg")%>';
    if(errori!=='null'){
        alert(errori);
    }
</script>
</html>
