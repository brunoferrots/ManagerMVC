package com.lychee.managermvc.action;

import com.lychee.managermvc.model.Company;
import com.lychee.managermvc.model.DataBaseCompanies;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewCompany {

    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String companyName = req.getParameter("name");
        Date companyDate = null;

        try {
            companyDate = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("date"));
        } catch (ParseException e) {
            throw new IOException(e);
        }


        Company company = new Company(companyName, companyDate);
        DataBaseCompanies dbCompany = new DataBaseCompanies();
        dbCompany.annex(company);

        req.setAttribute("companyName", company.getName());
        req.setAttribute("companyId", Integer.toString(company.getId()));
        req.setAttribute("companyDate", company.getDateOpened());

        resp.sendRedirect("gateway?action=listCompanies");
    }
}
