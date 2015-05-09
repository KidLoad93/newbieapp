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
            student.setId(rs.getString(1));
            student.setName(rs.getString(2));
            student.setAge(rs.getInt(3));
            student.setSex(rs.getByte(4));
            student.setHometown(rs.getString(5));
            
            students.add(student);
        }
        }catch(Exception ex){ ex.printStackTrace();}
        
        return students;
    }
    public static boolean checkExist(String id){
        int count =0;
        String sql = "select * from Students where id = '" +id + "'";
        Connection conn = DBUtilities.getConnection();
        try {
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while(rs.next()){
                count ++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
    public static void addStudent(Student s){
        String sql = "insert into Students values (?,?,?,?,?)";
        Connection conn = DBUtilities.getConnection();
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, s.getId());
            pre.setString(2, s.getName());
            pre.setInt(3, s.getAge());
            pre.setByte(4, s.getSex());
            pre.setString(5, s.getHometown());
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    public int deleteStudent(String id) {
        int n = 0;
        Connection conn = DBUtilities.getConnection();
        Statement state = null;
        String sql = "delete from Students where id='" + id+"'";
        try {
            state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;

    }
}
