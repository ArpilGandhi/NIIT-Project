/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.daoimpl;

import com.niit.shopperssquare.entities.Customer;

import com.niit.shopperssquare.dao.CustomerDAO;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/**
 *
 * @author DELL
 */
public class CustomerDAOImpl implements  CustomerDAO{

    @Override
    public int Customer(Customer customer) {
        int count=0;
        try {
            //return addEmployee(employee);
            Connection connection = DBConnection.getConnection();
            
            PreparedStatement preparedStatement = connection.prepareStatement("insert into customer(customer_name,customer_email,customer_mobile,customer_address,customer_dob) values(?,?,?,?,?)");
            preparedStatement.setString(1,customer.getCustomer_name());
            preparedStatement.setString(2,customer.getCustomer_email());
            preparedStatement.setString(3,customer.getCustomer_mobile());
            preparedStatement.setString(4,customer.getCustomer_adress());
            java.util.Date cust = new java.util.Date();
            preparedStatement.setDate(5,new Date(cust.getYear(),cust.getMonth(),cust.getDate()));
            count = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteCustomer(int customer_id) {
       int count=0;
        try {
            
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from Customer where customer_id=?");
            preparedStatement.setInt(1,customer_id);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Customer> getCustomer()
             {
        List<Customer> CustomerList = null;
        try {
            Connection connection = DBConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from customer");
            ResultSet resultSet = preparedStatement.executeQuery();
            CustomerList = new ArrayList<Customer>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int customer_id = resultSet.getInt(1);
                    String customer_name = resultSet.getString(2);
                    String customer_address = resultSet.getString(3);
                    String customer_email = resultSet.getString(4);
                    String customer_mobile = resultSet.getString(5);
                    String customer_dob = resultSet.getString(6);
                    Customer customer = new Customer(customer_name, customer_email, customer_address, customer_dob, customer_mobile);
                    CustomerList.add(customer);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return CustomerList;
    }


    
    public Customer getcustomerBYID(int customer_id) {
        List<Customer> CustomerList = null; 
         try {
            Connection connection = DBConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from customer where customer_id=?");
            preparedStatement.setInt(1, customer_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            CustomerList = new ArrayList<Customer>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int Customer_id = resultSet.getInt(1);
                    String customer_name = resultSet.getString(2);
                    String customer_email = resultSet.getString(3);
                    Customer customer = new Customer(customer_name, customer_email, customer_name, customer_name, customer_email);
                    CustomerList.add(customer);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    if(CustomerList.size()>0) return CustomerList.get(0);
     else return null;
    }
        
    @Override
    public int updateCustomer(int customer_id, Customer customer) {

int count=0;
        try {
            Connection connection  = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update customer set customer_name=?, customer_address=?, customer_email=?, customer_mobile=?, customer_dob=?  where customer_id=?");
            preparedStatement.setString(1,customer.getCustomer_name());
            preparedStatement.setString(2,customer.getCustomer_adress());
            preparedStatement.setString(3,customer.getCustomer_email());
            preparedStatement.setString(4,customer.getCustomer_mobile());
            preparedStatement.setString(5,customer.getCustomer_dob());
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
      } 

    @Override
    public Customer getCustomerBYID(int customer_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 

    
    
