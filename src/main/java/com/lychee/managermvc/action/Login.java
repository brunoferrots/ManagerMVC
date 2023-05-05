package com.lychee.managermvc.action;

import com.lychee.managermvc.model.DataBaseCompanies;
import com.lychee.managermvc.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        DataBaseCompanies dbCompanies = new DataBaseCompanies();
        User user = dbCompanies.userValidation(login, password);

        if(user != null) {
            System.out.println("Sign-in..." + login);
            HttpSession session = req.getSession();
            session.setAttribute("userLogged", user);
            return "redirect:gateway?action=ListCompanies";
        } else {
            return "redirect:gateway?action=FormLogin";
        }

    }
}
