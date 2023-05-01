package com.lychee.managermvc.servlet;

import com.lychee.managermvc.action.*;

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

        switch (param) {
            case "listCompanies" :
                new ListCompanies().execute(req, resp);
                break;
            case "removeCompany" :
                new RemoveCompany().execute(req, resp);
                break;
            case "alterCompany" :
                new AlterCompany().execute(req, resp);
                break;
            case "newCompany" :
                new NewCompany().execute(req, resp);
                break;
            case "showCompany" :
                new ShowCompany().execute(req, resp);
                break;

        }
    }
}
