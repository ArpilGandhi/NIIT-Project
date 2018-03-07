/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.entities;
import java.util.Date;


/**
 *
 * @author DELL
 */
public class Customer {
    
    public int customer_id;
    public String customer_name;
    public String customer_email;
    public String customer_adress;
    public String customer_dob;
    public String customer_mobile;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_adress() {
        return customer_adress;
    }

    public void setCustomer_adress(String customer_adress) {
        this.customer_adress = customer_adress;
    }

    public String getCustomer_dob() {
        return customer_dob;
    }

    public void setCustomer_dob(String customer_dob) {
        this.customer_dob = customer_dob;
    }

    public String getCustomer_mobile() {
        return customer_mobile;
    }

    public void setCustomer_mobile(String customer_mobile) {
        this.customer_mobile = customer_mobile;
    }

    public Customer(String customer_name, String customer_email, String customer_adress, String customer_dob, String customer_mobile) {
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_adress = customer_adress;
        this.customer_dob = customer_dob;
        this.customer_mobile = customer_mobile;
    }

}