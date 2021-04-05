<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2021/4/5
  Time: 下午 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>500错误页面</title>
    <%@include file="/pages/common/head.jsp"%>
    <style type="text/css">
        h1 {
            text-align: center;
            margin-top: 200px;
        }
    </style>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif" >
    <span class="wel_word">服务器出错了...</span>

</div>

<div id="main">

    <h1>服务器出错了，程序员小哥正在快马加鞭的赶来...</h1>


</div>

<%--	静态包含页脚--%>
<%@include file="/pages/common/footer.jsp"%>
</body>
</html>