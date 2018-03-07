/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.daoimpl;

import com.niit.shopperssquare.dao.OrdersDAO;
import java.util.List;

/**
 *
 * @author DELL
 */
public class OrdersDAOImpl implements OrdersDAO{

    @Override
    public int Orders(com.niit.shopperssquare.entities.Orders orders) {
        return 0;
         
    }

    @Override
    public int deleteOrders(int orders_id) {
        return 0;
         
    }

    @Override
    public List<com.niit.shopperssquare.entities.Orders> getOrders() {
        return null;
       
    }

    @Override
    public com.niit.shopperssquare.entities.Orders getOrdersByID(int orders_id) {
        return null;
    
    }

    @Override
    public int updateOrders(int item_id, com.niit.shopperssquare.entities.Orders orders) {
        return 0;
       
    }
    
}
