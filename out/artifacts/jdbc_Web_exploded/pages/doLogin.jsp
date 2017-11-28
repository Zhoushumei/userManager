<%@ page import="controller.UserControl" %>
<%@ page import="entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Sumey
  Date: 2017/11/25
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link href="../css/dologin.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="dologin"><%
    UserControl userControl=new UserControl();
    User user=userControl.searchByPhone(request.getParameter("phoneNum"));
    if (null!=user){
        if (request.getParameter("password").equals(user.getPassword())){
            out.println("欢迎"+"~~"+user.getName());
        }
        else {
            out.println("密码输入有误，请重新输入！");%>
    <br>
    <a href="login.jsp"><i style="color: cadetblue">返回</i></a>
    <%

        }

    }
    else {
        out.println("您还没有注册！");%>
    <br>
    <a href="register.jsp"><i style="color: cadetblue">注册</i></a>
    <%
    }
%>
</div>
</body>
</html>
