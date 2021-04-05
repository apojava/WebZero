package com.example.Google;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * @author shystart
 * @create 2021-04-01 下午 18:11
 */
@WebServlet(name = "LoginServlet",value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取 Session 中的验证码
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        // 删除 Session 中的验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        String code = req.getParameter("code");
        // 获取用户名
        String username = req.getParameter("username");
        if (token != null && token.equalsIgnoreCase(code)) {
            System.out.println("保存到数据库：" + username);
            resp.sendRedirect(req.getContextPath() + "/loginsuccess.jsp");
        } else {
            System.out.println("请不要重复提交表单");
        }
    }
}
