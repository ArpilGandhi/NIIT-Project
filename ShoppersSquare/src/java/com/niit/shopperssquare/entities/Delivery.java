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
public class Delivery {
    public int delivery_id;
    public String delivery_status;
    public Date delivery_status_date;
    public String delivery_current_location;
    public int manager_id;
    public int order_id;

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getDelivery_status() {
        return delivery_status;
    }

    public void setDelivery_status(String delivery_status) {
        this.delivery_status = delivery_status;
    }

    public Date getDelivery_status_date() {
        return delivery_status_date;
    }

    public void setDelivery_status_date(Date delivery_status_date) {
        this.delivery_status_date = delivery_status_date;
    }

    public String getDelivery_current_location() {
        return delivery_current_location;
    }

    public void setDelivery_current_location(String delivery_current_location) {
        this.delivery_current_location = delivery_current_location;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Delivery(int delivery_id, String delivery_status, Date delivery_status_date, String delivery_current_location, int manager_id, int order_id) {
        this.delivery_id = delivery_id;
        this.delivery_status = delivery_status;
        this.delivery_status_date = delivery_status_date;
        this.delivery_current_location = delivery_current_location;
        this.manager_id = manager_id;
        this.order_id = order_id;
    }
    
}
