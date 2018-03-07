/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.dao;

import com.niit.shopperssquare.entities.Manager;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ManagerDAO {
    

    int Manager (Manager manager);
    int deleteManager(int manager_id);
    List<Manager> getManager();
    Manager getManagerByID(int manager_id);
    int updateManager(int manager_id, Manager manager);
    
    
}
