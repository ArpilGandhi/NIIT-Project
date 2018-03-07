/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.onlineshopping.testing;


import com.niit.shopperssquare.entities.Customer;
import com.niit.shopperssquare.dao.CustomerDAO;
import com.niit.shopperssquare.daoimpl.CustomerDAOImpl;
import java.util.List;
/**
 *
 * @author DELL
 */
public class Application {
    public static void main(String[] args){
        CustomerDAO employeeDAO = new CustomerDAOImpl();
        int count = employeeDAO.Customer(new Customer("Deepak", "deepak@niit", "Borivali", "05/05/2014", "989875412"));
        if(count>0)System.out.println("Record Added Successfully");
        else System.out.println("Record Failed to get added");
    
    
    
    
}
}