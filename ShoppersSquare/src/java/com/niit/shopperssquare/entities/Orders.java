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
public class Orders {
    public int order_id;
    public Date order_date ;
    public int order_quantity;      
    public String order_delivery_add;
    public String order_billing_add ;
    public int customer_id;
    public int item_date;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public int getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(int order_quantity) {
        this.order_quantity = order_quantity;
    }

    public String getOrder_delivery_add() {
        return order_delivery_add;
    }

    public void setOrder_delivery_add(String order_delivery_add) {
        this.order_delivery_add = order_delivery_add;
    }

    public String getOrder_billing_add() {
        return order_billing_add;
    }

    public void setOrder_billing_add(String order_billing_add) {
        this.order_billing_add = order_billing_add;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getItem_date() {
        return item_date;
    }

    public void setItem_date(int item_date) {
        this.item_date = item_date;
    }

    public Orders(int order_id, Date order_date, int order_quantity, String order_delivery_add, String order_billing_add, int customer_id, int item_date) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.order_quantity = order_quantity;
        this.order_delivery_add = order_delivery_add;
        this.order_billing_add = order_billing_add;
        this.customer_id = customer_id;
        this.item_date = item_date;
    }
}
