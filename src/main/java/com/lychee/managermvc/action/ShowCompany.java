package com.lychee.managermvc.action;

import com.lychee.managermvc.model.Company;
import com.lychee.managermvc.model.DataBaseCompanies;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowCompany {

    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer companyId = Integer.valueOf(req.getParameter("id"));

        DataBaseCompanies dataBase = new DataBaseCompanies();
        Company company = dataBase.showCompanyForId(companyId);

        req.setAttribute("company", company);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("formAlterCompany.jsp");
        requestDispatcher.forward(req, resp);
    }
}
