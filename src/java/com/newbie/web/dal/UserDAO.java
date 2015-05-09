/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newbie.web.dal;

import com.newbie.web.entities.User;
import com.newbie.web.utilities.DBUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public static boolean checkUser(String username, String password) throws SQLException {
        boolean isOk = false;
        try {
            Connection conn = DBUtilities.getConnection();
            System.out.println("connect: "+ conn);
            ResultSet rs = conn.createStatement().executeQuery("select * from users "
                    + " where username = '" + username + "'"
                    + " and password = '" + password + "'");
            if (rs.next()) {
                isOk = true;
            }
        } catch (Exception ex) {
            System.out.println("Login Error Controller");
        }
        return isOk;
    }

    public static boolean updateUser(User user, String newPassword) {
        boolean isOk = false;
        try {
            Connection conn = DBUtilities.getConnection();
            String query = "update users set password = '" + newPassword + "' where username = '" + user.getUsername() + "'";
            conn.createStatement().executeUpdate(query);
            isOk = true;
        } catch (Exception ex) {
            System.out.println("Change Password Error Controller");
        }
        return isOk;
    }
}
