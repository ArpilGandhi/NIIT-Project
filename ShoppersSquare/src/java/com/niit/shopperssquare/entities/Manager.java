/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.entities;

/**
 *
 * @author DELL
 */
public class Manager {
    public int manager_id;
    public String manager_email;
    public String manager_password;
    public String manager_contact; 

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_email() {
        return manager_email;
    }

    public void setManager_email(String manager_email) {
        this.manager_email = manager_email;
    }

    public String getManager_password() {
        return manager_password;
    }

    public void setManager_password(String manager_password) {
        this.manager_password = manager_password;
    }

    public String getManager_contact() {
        return manager_contact;
    }

    public void setManager_contact(String manager_contact) {
        this.manager_contact = manager_contact;
    }

    public Manager(int manager_id, String manager_email, String manager_password, String manager_contact) {
        this.manager_id = manager_id;
        this.manager_email = manager_email;
        this.manager_password = manager_password;
        this.manager_contact = manager_contact;
    }
    
}
