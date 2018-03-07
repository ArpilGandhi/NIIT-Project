/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.dao;

import com.niit.shopperssquare.entities.Orders;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface OrdersDAO {
    
    int Orders (Orders orders);
    int deleteOrders(int orders_id);
    List<Orders> getOrders();
    Orders getOrdersByID(int orders_id);
    int updateOrders(int orders_id, Orders orders);
    
    
    
}
