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
    <input type="button" value="用户管理" onclick="window.location.href='/hotel-demo/userSelectAllServlet';" class="changeBtn"/>
</div>
<br/>
<table align="center" border="1" cellpadding="20" cellspacing="0">
    <thead>
    <tr bgcolor="#e6e6fa">
        <th>房间号</th>
        <th>客房等级</th>
        <th>房间状态</th>
        <th>床位数</th>
        <th>标准客房/天</th>
        <th>客户</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${rooms}" var="room" varStatus="status">
        <tr>
            <td bgcolor="#f5f5dc">
                <font color="orange">${room.roomN}</font>
            </td>
            <td>${room.roomClass}</td>
            <td>${room.roomStatus}</td>
            <td>${room.bedN}</td>
            <td>${room.money}</td>
            <td>${room.username}</td>
            <td>
                <input type="button" value="删除" class="delBtn" onclick="window.location.href='/hotel-demo/roomDeleteServlet?roomN=${room.roomN},${room.username}'"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br/>
<br/>

<div align="center">
    <input type="button" value="增加" class="btn" onclick="window.location.href='roomAdd.jsp';"/>
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    <input type="button" value="修改" class="btn" onclick="window.location.href='roomUpdate.jsp';"/>
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    <input type="button" value="查询" class="btn" onclick="window.location.href='roomQuery.jsp';"/>
</div>
</body>
<script>
    var errori ='<%=request.getAttribute("roomDelete_msg")%>';
    if(errori!=='null'){
        alert(errori);
    }
</script>
</html>
