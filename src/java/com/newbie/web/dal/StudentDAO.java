/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newbie.web.dal;

import java.util.List;
import com.newbie.web.entities.Student;
import com.newbie.web.utilities.DBUtilities;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trongbui
 */
public class StudentDAO {
    
    public static List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        String query = "select * from Students";
        Connection conn = DBUtilities.getConnection();
        try{
        ResultSet rs = conn.createStatement().executeQuery(query);
        while(rs.next()){
            Student student = new Student();
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setAge(rs.getInt(3));
            student.setSex(rs.getByte(4));
            student.setHometown(rs.getString(5));
            
            students.add(student);
        }
        }catch(Exception ex){ ex.printStackTrace();}
        
        return students;
    }
    public void Update(String Name, byte Sex ,int Age, String Hometown){
         Student newStudent=null;
        try {
                 Connection conn = DBUtilities.getConnection();
               PreparedStatement ps=conn.prepareStatement("insert into Students values(?,?,?,?)");
            
                 ps.setString(1, Name);
               ps.setInt(2, Sex);
               ps.setInt(3, Age);
              
               ps.setString(4, Hometown);
              
               
               ps.executeUpdate();
            
                    
                   
                
        } catch(Exception ex){ ex.printStackTrace();}
    }
    
    public int deleteStudent(int id) {
        int n = 0;
        Connection conn = DBUtilities.getConnection();
        Statement state = null;
        String sql = "delete from Students where id=" + id;
        try {
            state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;

    }
}
