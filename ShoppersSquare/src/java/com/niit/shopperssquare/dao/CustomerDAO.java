/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.dao;

import com.niit.shopperssquare.entities.Customer;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface CustomerDAO {

    int Customer (Customer customer);
    int deleteCustomer(int customer_id);
    List<Customer> getCustomer();
    Customer getCustomerBYID(int customer_id);
    int updateCustomer(int customer_id,Customer customer);
    
    
    
    
    
    
}
