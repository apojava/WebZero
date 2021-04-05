package com.shy.web;

import com.shy.bean.User;
import com.shy.service.UserService;
import com.shy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shystart
 * @create 2021-03-16 下午 16:41
 */
@WebServlet(name = "RegistServlet",value = "/registServlet")
public class RegistServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1、获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        //2、检查 验证码是否正确  === 写死,要求验证码为:abcde
        if ("abcde".equalsIgnoreCase(code)) {
            //3、检查 用户名是否可用
            if (userService.existUsername(username)) {
                req.setAttribute("msg","用户名已存在！");
                req.setAttribute("username",username);
                req.setAttribute("email",email);

                //System.out.println("用户名[" + username + "]已存在!");
                //跳回注册页面
                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
            } else {
                //      可用
                //调用Sservice保存到数据库
                userService.registUser(new User(null, username, password, email));

                //跳到注册成功页面 regist_success.jsp
                req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
            }
        } else {
            req.setAttribute("msg","验证码错误！");
            req.setAttribute("username",username);
            req.setAttribute("email",email);
            req.setAttribute("password",password);
            System.out.println("验证码[" + code + "]错误");
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
        }
    }
}

