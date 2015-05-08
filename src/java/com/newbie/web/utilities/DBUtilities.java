/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newbie.web.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

/**
 *
 * @author trongbui
 */
public class DBUtilities {

    private DBUtilities() {
    }

    public static Connection getConnection() {
        try {
            Class.forName(Constraints.SUN_DRIVER);
            Connection conn = DriverManager.getConnection(Constraints.DB_CONNECTION_STRING);
            return conn;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return null;
    }

}
