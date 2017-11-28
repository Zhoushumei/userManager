<%@ page import="entity.User" %>
<%@ page import="controller.UserControl" %><%--
  Created by IntelliJ IDEA.
  User: Sumey
  Date: 2017/11/25
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>doRegister</title>
    <link href="../css/doRegister.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="welcome">
<%
    UserControl userControl=new UserControl();
    User user=userControl.searchByPhone(request.getParameter("phoneNum"));
    if(null!=user){
        out.println("您已经注册过，请登录！");%><br><%
    }
    else {
    user=new User();
    user.setName(request.getParameter("username"));
    user.setGender(request.getParameter("gender"));
    user.setPassword(request.getParameter("password"));
    user.setPhoneNumber(request.getParameter("phoneNum"));
    user.setEmail(request.getParameter("email"));
    user.setBirthday(request.getParameter("birthday"));
    userControl.add(user);
    out.println("您好，欢迎注册~请登录"+user.getName());
    }
%>
<%
%>
    <br><a href="login.jsp"><i>登录</i></a>
</div>
</body>
</html>
