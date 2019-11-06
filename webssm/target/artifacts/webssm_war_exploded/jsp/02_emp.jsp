<%--
  Created by IntelliJ IDEA.
  User: liubaoyang
  Date: 2019/8/5
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="${pageContext.request.contextPath}/add.action" >增加用户</a>

    <hr/>

    <a href="${pageContext.request.contextPath}/update.action">修改用户</a>
    <a href="${pageContext.request.contextPath}/delete.action">删除用户</a>
    <a href="${pageContext.request.contextPath}/find.action">查询用户</a>
</body>
</html>
