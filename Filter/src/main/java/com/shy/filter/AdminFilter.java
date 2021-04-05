package com.shy.filter; /**
 * @author shystart
 * @create 2021-04-04 下午 16:46
 */

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "AdminFilter",value = "/admin/*")
public class AdminFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        HttpSession session = httpServletRequest.getSession();

        Object username = session.getAttribute("username");

        if(username == null){
            httpServletRequest.getRequestDispatcher("/v.jsp").forward(httpServletRequest,httpServletResponse);
            return;
        }else{

            chain.doFilter(request, response);
        }


    }
}
