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
import java.sql.ResultSet;
import java.util.ArrayList;

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
}
