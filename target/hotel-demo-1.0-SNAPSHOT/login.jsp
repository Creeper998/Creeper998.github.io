<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>酒店管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/loginImg.css" />
    <link rel="stylesheet" type="text/css" href="css/hotelLogin.css" />
</head>
<body>
<div class="login-box">
    <h2>酒店管理系统登录界面</h2>
    <form action="/hotel-demo//loginServlet" id="form" method="post">
        <div class="login-field">
            <input type="text" name="admName" required="" />
            <label>用户名</label>
        </div>
        <div class="login-field">
            <input type="password" name="password" required="" />
            <label>密码</label>
        </div>
        <div class="login-field">
            <input type="text" name="checkCode" id="checkCode" class="login-field" required=""/>
            <label>验证码</label>
        </div>
        <img id="checkCodeImg" src="/hotel-demo/checkCodeServlet">
        <br/>
        <a href="#" id="changeImg" color="yellow">看不清？</a>
        <br/>
        <span id="checkCode_err" class="err_msg">${register1_msg}</span>
        <br/>
        <button type="submit">登&emsp;&emsp;录</button>
        &emsp;&emsp;&emsp;&emsp;;&emsp;&emsp;&emsp;&emsp;
        <button type="reset">重&nbsp;置</button>
        &emsp;&emsp;

    </form>

</div>
</body>
<script>
    var errori ='<%=request.getAttribute("login_msg")%>';
    if(errori!=='null'){
        alert(errori);
    }
</script>
<script>
    var errori ='<%=request.getAttribute("register1_msg")%>';
    if(errori!=='null'){
        alert(errori);
    }
</script>
<script>
    document.getElementById("changeImg").onclick = function () {
        document.getElementById("checkCodeImg").src = "/hotel-demo/checkCodeServlet?t=" + new Date().getTime();
    }
</script>
<script>
    document.getElementById("checkCodeImg").onclick = function () {
        document.getElementById("checkCodeImg").src = "/hotel-demo/checkCodeServlet?t=" + new Date().getTime();
    }
</script>
</html>
