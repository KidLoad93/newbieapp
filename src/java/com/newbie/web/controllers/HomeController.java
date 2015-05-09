/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newbie.web.controllers;

import com.newbie.web.dal.StudentDAO;
import com.newbie.web.entities.Student;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trongbui
 */
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Student> students = StudentDAO.getAllStudents();
        request.setAttribute("students", students);
        RequestDispatcher rd = request.getRequestDispatcher("public/views/home.jsp");
        rd.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "NewbieApp";
    }

}
