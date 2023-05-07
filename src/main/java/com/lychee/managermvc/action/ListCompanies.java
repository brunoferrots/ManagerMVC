package com.lychee.managermvc.action;

import com.lychee.managermvc.model.Company;
import com.lychee.managermvc.model.DataBaseCompanies;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCompanies implements Action {

    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Listing companies...");

        List<Company> listCompanies = new DataBaseCompanies().showCompanies();

        req.setAttribute("listCompanies", listCompanies);

        return "forward:listCompanies.jsp";
    }
}
