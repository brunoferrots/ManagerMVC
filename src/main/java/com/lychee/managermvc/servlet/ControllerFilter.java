package com.lychee.managermvc.servlet;

import com.lychee.managermvc.action.Action;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter("/gateway") -> Mapped in the file web.xml
public class ControllerFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        String param = req.getParameter("action");

        String nameOfClass = "com.lychee.managermvc.action." + param;
        String path = null;

        try {
            Class classForInstance = Class.forName(nameOfClass);
            Action action = (Action) classForInstance.newInstance();
            path = action.execute(req, resp);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new ServletException(e);
        }

        String[] pathDivided = path.split(":");

        if (pathDivided[0].equals("forward")) {
            RequestDispatcher reqDispatch = req.getRequestDispatcher("WEB-INF/view/" + pathDivided[1]);
            reqDispatch.forward(req, resp);
        } else {
            resp.sendRedirect(pathDivided[1]);
        }
    }
}
