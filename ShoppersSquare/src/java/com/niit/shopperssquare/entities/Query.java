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
public class Query {
    public int query_id;
    public String query;
    public Date post_date;
    public int customer_id;

    public int getQuery_id() {
        return query_id;
    }

    public void setQuery_id(int query_id) {
        this.query_id = query_id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Query(int query_id, String query, Date post_date, int customer_id) {
        this.query_id = query_id;
        this.query = query;
        this.post_date = post_date;
        this.customer_id = customer_id;
    }
    
}
