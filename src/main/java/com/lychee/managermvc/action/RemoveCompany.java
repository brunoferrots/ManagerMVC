package com.lychee.managermvc.action;

import com.lychee.managermvc.model.DataBaseCompanies;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveCompany {

    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Removing companies...");
        Integer companyId = Integer.valueOf(req.getParameter("id"));

        DataBaseCompanies dataBase = new DataBaseCompanies();
        dataBase.remove(companyId);

        resp.sendRedirect("gateway?action=listCompanies");

    }
}
