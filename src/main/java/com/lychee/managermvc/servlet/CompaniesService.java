package com.lychee.managermvc.servlet;

import com.google.gson.Gson;
import com.lychee.managermvc.model.Company;
import com.lychee.managermvc.model.DataBaseCompanies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/companies")
public class CompaniesService extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List< Company> companies = new DataBaseCompanies().showCompanies();

        Gson gson = new Gson();
        String json = gson.toJson(companies);

        resp.setContentType("application/json");
        resp.getWriter().print(json);
    }
}
