/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.dao;

import com.niit.shopperssquare.entities.Deals;
import java.util.List;
/**
 *
 * @author DELL
 */
public interface DealsDAO {
    
    int Deals (Deals deals);
    int deletedeals(int deals_id);
    List<Deals> getDeals();
    Deals getDealsByID(int deals_id);
    int updateDeals(int deals_id, Deals deals);
    
    
}
