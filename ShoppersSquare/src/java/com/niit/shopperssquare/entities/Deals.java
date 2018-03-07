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
public class Deals {
        
    public int deal_id;
    public Date deal_star_date;
    public Date deal_end_date;
    public int deal_discount;
    public int item_id;
    public int manager_id;

    public int getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(int deal_id) {
        this.deal_id = deal_id;
    }

    public Date getDeal_star_date() {
        return deal_star_date;
    }

    public void setDeal_star_date(Date deal_star_date) {
        this.deal_star_date = deal_star_date;
    }

    public Date getDeal_end_date() {
        return deal_end_date;
    }

    public void setDeal_end_date(Date deal_end_date) {
        this.deal_end_date = deal_end_date;
    }

    public int getDeal_discount() {
        return deal_discount;
    }

    public void setDeal_discount(int deal_discount) {
        this.deal_discount = deal_discount;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public Deals(int deal_id, Date deal_star_date, Date deal_end_date, int deal_discount, int item_id, int manager_id) {
        this.deal_id = deal_id;
        this.deal_star_date = deal_star_date;
        this.deal_end_date = deal_end_date;
        this.deal_discount = deal_discount;
        this.item_id = item_id;
        this.manager_id = manager_id;
    }
    
}
