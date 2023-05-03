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

public class AlterCompany implements Action {

    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String companyName = req.getParameter("name");
        Integer companyId = Integer.valueOf(req.getParameter("id"));

        Date companyDate = null;

        try {
            companyDate = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("date"));
        } catch (ParseException e) {
            throw new IOException(e);
        }

        DataBaseCompanies dataBaseCompanies = new DataBaseCompanies();
        Company company = dataBaseCompanies.showCompanyForId(companyId);

        company.setName(companyName);
        company.setDateOpened(companyDate);

        return "redirect:gateway?action=ListCompanies";
    }
}
