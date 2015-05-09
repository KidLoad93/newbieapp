package com.newbie.web.controllers.users;

import com.newbie.web.dal.UserDAO;
import com.newbie.web.entities.User;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserChangePassController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request.getParameter("btnSave"));
        if (request.getParameter("btnSave") == null) {
            request.setAttribute("message", "");
            RequestDispatcher rd = request.getRequestDispatcher("/public/views/changepass.jsp");
            rd.forward(request, response);
        } else {
            String oldPassword = request.getParameter("oldPassword");
            String newPassword = request.getParameter("newPassword");
            String confirmPassword = request.getParameter("confirmPassword");
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            String message = "";
            if (!confirmPassword.equals(newPassword)) {
                message = "Invalid Confirmpassword!";
            } else if (user.getPassword().equals(oldPassword)) {
                message = "Invalid password !";
            } else {
                if (UserDAO.updateUser(user, newPassword)) {
                    message = "Update successfully !";
                } else {
                    message = "Not Successfully !";
                }
            }
            request.setAttribute("message", message);
            RequestDispatcher rd = request.getRequestDispatcher("/public/views/changepass.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
