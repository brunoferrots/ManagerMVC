package com.lychee.managermvc.servlet;

import com.lychee.managermvc.action.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gateway")
public class GatewayServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param = req.getParameter("action");
        String path = null;

        switch (param) {
            case "listCompanies" :
                path = new ListCompanies().execute(req, resp);
                break;
            case "removeCompany" :
                path = new RemoveCompany().execute(req, resp);
                break;
            case "alterCompany" :
                path = new AlterCompany().execute(req, resp);
                break;
            case "newCompany" :
                path = new NewCompany().execute(req, resp);
                break;
            case "showCompany" :
                path = new ShowCompany().execute(req, resp);
                break;
        }

        assert path != null;
        String[] pathDivided = path.split(":");

        if (pathDivided[0].equals("forward")) {
            RequestDispatcher reqDispatch = req.getRequestDispatcher(pathDivided[1]);
            reqDispatch.forward(req, resp);
        } else {
            resp.sendRedirect(pathDivided[1]);
        }

    }
}
