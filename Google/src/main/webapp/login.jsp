<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2021/4/1
  Time: 上午 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录测试验证码测试</title>
    <script>
        // 给验证码的图片，绑定单击事件
        $("#code_img").click(function () {
        // 在事件响应的 function 函数中有一个 this 对象。这个 this 对象，是当前正在响应事件的 dom 对象
        // src 属性表示验证码 img 标签的 图片路径。它可读，可写
        // alert(this.src);
            this.src = "${basePath}kaptcha.jpg?d=" + new Date();
        });
    </script>
</head>
<body>
    <form action="http://localhost:8080/Google/loginServlet" method="post">
        用户名<input type="text" name="username"><br/>
        密码<input type="password">
        <input type="text" name="code">
        <img src="http://localhost:8080/Google/kaptcha.jpg" id="code_img">
        <input type="submit">
    </form>
</body>
</html>
