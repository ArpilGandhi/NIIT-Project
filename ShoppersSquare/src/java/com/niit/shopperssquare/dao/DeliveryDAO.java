/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.dao;

import com.niit.shopperssquare.entities.Delivery;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface DeliveryDAO {
    int Delivery (Delivery delivery);
    int deleteDelivery(int delivery_id);
    List<Delivery> getDelivery();
    Delivery getDeliveryByID(int delivery_id);
    int updateDelivery(int delivery_id, Delivery delivery);
    
    
}
