/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newbie.web.controllers.students;

import com.newbie.web.dal.StudentDAO;
import com.newbie.web.entities.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trongbui
 */
public class StudentAddController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //get data
        PrintWriter out = response.getWriter();
        String id = request.getParameter("txtId");
        String name = request.getParameter("txtName");
        int age = 0;
        Byte sex = Byte.parseByte(request.getParameter("sex"));
        String hometown = request.getParameter("txtHome");

        //validate data
        String errID = "";
        String errName = "";
        String errAge = "";
        String errHometown = "";
        boolean errDetected = false;
        if (id.length() > 8) {
            errID += "length of ID must equal or less than 8 characters!";
            errDetected = true;
        }
        if(StudentDAO.checkExist(id)){
            errID += "This ID already have!";
            errDetected = true;
        }
        String prefix =""+ id.charAt(0) + id.charAt(1);
        if(prefix.toUpperCase().equals("SE") ==false && prefix.toUpperCase().equals("BA") ==false){
            errID += "ID must start with SE or BA!";
            errDetected = true;
        }
        int count =0;
        for(int i=2;i<id.length();i++){
            if(id.charAt(i)<'0' || id.charAt(i)>'9'){
                count ++;
            }
        }
        if(count>0){
            errID += "ID must start with SE or Ba then follow by numbers!";
            errDetected = true;
        }
        if (name.length() > 30) {
            errName += "length of Name must equal or less than 30 characters!";
            errDetected = true;
        }
        try {
            age = Integer.parseInt(request.getParameter("txtAge"));
            if (age < 0) {
                errAge += "Age must be positive integer!";
                errDetected = true;
            }
        } catch (Exception e) {
            errAge += "Age must be positive integer!";
            errDetected = true;
        }
        if (errHometown.length() > 50) {
            errHometown += "length of Hometown must equal or less than 50 characters!";
            errDetected = true;
        }
        if (errDetected) {
            request.setAttribute("errID", errID);
            request.setAttribute("errName", errName);
            request.setAttribute("errAge", errAge);
            request.setAttribute("errHometown", errHometown);
            dispatch(request, response, "/public/views/addstudentpage.jsp");
        } else {
            //add
            Student s = new Student(id, name, age, sex, hometown);
            StudentDAO.addStudent(s);
        }

    }

    private void dispatch(HttpServletRequest request, HttpServletResponse response, String page)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
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
