package com.lychee.managermvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/gateway")
public class GatewayServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String param = req.getParameter("action");
//
//        HttpSession session = req.getSession();
//        boolean userIsNotLogged = session.getAttribute("userLogged") == null;
//        boolean actionIsNotUnlocked = !(param.equals("Login") || param.equals("FormLogin"));
//
//        if (userIsNotLogged && actionIsNotUnlocked) {
//            resp.sendRedirect("gateway?action=FormLogin");
//            return;
//        }
//
//        String nameOfClass = "com.lychee.managermvc.action." + param;
//        String path = null;
//
//        try {
//            Class classForInstance = Class.forName(nameOfClass);
//            Action action = (Action) classForInstance.newInstance();
//            path = action.execute(req, resp);
//        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//            throw new ServletException(e);
//        }
//
//        String[] pathDivided = path.split(":");
//
//        if (pathDivided[0].equals("forward")) {
//            RequestDispatcher reqDispatch = req.getRequestDispatcher("WEB-INF/view/" + pathDivided[1]);
//            reqDispatch.forward(req, resp);
//        } else {
//            resp.sendRedirect(pathDivided[1]);
//        }

    }
}
