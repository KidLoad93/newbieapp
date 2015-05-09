package com.newbie.web.controllers;

import com.newbie.web.dal.UserDAO;
import com.newbie.web.entities.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        if (request.getParameter("Login") == null) {
            request.setAttribute("error", "");
            RequestDispatcher rd = request.getRequestDispatcher("/public/views/login.jsp");
            rd.forward(request, response);
        } else {
            String username = request.getParameter("txtName");
            String password = request.getParameter("txtPass");
            if (UserDAO.checkUser(username, password)) {
                HttpSession session = request.getSession();
                User user = new User(username, password);
                session.setAttribute("user", user);
                request.setAttribute("error", "");
                response.sendRedirect(request.getServletContext().getContextPath() + "/index");
//                RequestDispatcher rd = request.getRequestDispatcher("/public/views/home.jsp");
//                rd.forward(request, response);
            } else {
                request.setAttribute("error", "Invalid account !");
                RequestDispatcher rd = request.getRequestDispatcher("/public/views/login.jsp");
                rd.forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
