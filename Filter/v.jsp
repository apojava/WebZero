<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2021/4/4
  Time: 下午 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="http://localhost:8080/Filter/loginServlet" method="post">
        用户名<input type="text" name="username" value="shy">
        密  码<input type="password" name="password" value="123456">
        <input type="submit" value="登录">
    </form>
</body>
</html>
