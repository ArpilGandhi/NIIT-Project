/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DBConnection {
    
public static Connection getConnection(){
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ShoppersSquare", "Arpil", "prince");
            System.out.println("Connection Successful");
        } catch (SQLException ex) {
            System.out.println("Connection Failed");
            ex.printStackTrace();
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }     

    public static void main(String[] args) {
        DBConnection db=new DBConnection();
        db.getConnection();
    }
}

