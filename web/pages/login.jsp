<%--
  Created by IntelliJ IDEA.
  User: Sumey
  Date: 2017/11/25
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link href="../css/register.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="regForm">
<form action="doLogin.jsp" name="loginForm" method="post">
    <table>
        <tr>
            <td>手机号:</td>
            <td><input type="text" name="phoneNum"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</div>
</body>
</html>
