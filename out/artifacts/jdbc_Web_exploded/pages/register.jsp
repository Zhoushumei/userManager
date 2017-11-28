<%--
  Created by IntelliJ IDEA.
  User: Sumey
  Date: 2017/11/25
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <link href="../css/register.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="regForm">
<form  action="doRegister.jsp" name="regForm" method="post">
    <table>
        <tr class="line">
            <td>用户名：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr class="line">
            <td>性别:</td>
            <td>
                <input name="gender" type="radio" value="male" />男
                <input name="gender" type="radio" value="female" />女
            </td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td>手机号:</td>
            <td><input type="text" name="phoneNum"></td>
        </tr>
        <tr>
            <td>邮箱:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>生日(格式:1111-11-11):</td>
            <td><input type="text" name="birthday"></td>
        </tr>
        <tr>
            <td colspan="3"><input class="sub" type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</div>
</body>
</html>
