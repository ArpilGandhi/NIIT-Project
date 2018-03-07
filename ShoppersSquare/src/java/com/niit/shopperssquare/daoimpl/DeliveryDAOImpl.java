/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.daoimpl;

import com.niit.shopperssquare.dao.DeliveryDAO;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DeliveryDAOImpl implements DeliveryDAO
{

    @Override
    public int Delivery(com.niit.shopperssquare.entities.Delivery delivery) {
        return 0;
        
    }

    @Override
    public int deleteDelivery(int delivery_id) {
        return 0;
         
    }

    @Override
    public List<com.niit.shopperssquare.entities.Delivery> getDelivery() {
        return null;
         
    }

    @Override
    public com.niit.shopperssquare.entities.Delivery getDeliveryByID(int delivery_id) {
        return null;
       
    }

    @Override
    public int updateDelivery(int item_id, com.niit.shopperssquare.entities.Delivery delivery){
        return 0;
    }
    
}
