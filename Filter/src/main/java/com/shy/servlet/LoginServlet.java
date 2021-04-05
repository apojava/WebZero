package com.shy.servlet; /**
 * @author shystart
 * @create 2021-04-04 下午 17:27
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if( "shy".equals(username) && "123456".equals(password)){
            request.getSession().setAttribute("username", username);
            System.out.println(username);
            response.getWriter().write("登录成功！！");
        }else{
            request.getRequestDispatcher("/loginsuccess.jsp");
        }
    }
}
