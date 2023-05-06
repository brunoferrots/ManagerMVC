package com.lychee.managermvc.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//@WebFilter("/gateway") -> Mapped in the file web.xml
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        String param = req.getParameter("action");

        HttpSession session = req.getSession();
        boolean userIsNotLogged = session.getAttribute("userLogged") == null;
        boolean actionIsNotUnlocked = !(param.equals("Login") || param.equals("FormLogin"));

        if (userIsNotLogged && actionIsNotUnlocked) {
            resp.sendRedirect("gateway?action=FormLogin");
            return;
        }

        filterChain.doFilter(req, resp);
    }
}
