package com.lychee.managermvc.servlet;


import javax.servlet.*;
import java.io.IOException;
//@WebFilter("/gateway") -> Mapped in the file web.xml
public class TrackFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long timeStart = System.currentTimeMillis();

        String action = servletRequest.getParameter("action");
        filterChain.doFilter(servletRequest, servletResponse);

        long timeFinish = System.currentTimeMillis();

        System.out.println("The time executed of action " + action + " is -> " + (timeFinish - timeStart) + " ms");
    }
}
