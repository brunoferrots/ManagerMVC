package com.lychee.managermvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormNewCompany implements Action {

    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return "forward:formNewCompany.jsp";
    }
}
