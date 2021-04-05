package com.shy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebFilter(filterName = "ManagerFilter",value = "/page/manager/*")
//@WebFilter(filterName = "ManagerFilter",value = "/manager/bookServlet")
//@WebFilter(filterName = "ManagerFilter",value = {"/page/manager/*","/manager/phoneServlet"})
//@WebFilter(urlPatterns = {"/page/manager/*","/manager/phoneServlet"})
public class ManagerFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        Object user = httpServletRequest.getSession().getAttribute("user");

        if (user == null) {
            httpServletRequest.getRequestDispatcher("/pages/user/login.jsp").forward(servletRequest,servletResponse);
        } else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
