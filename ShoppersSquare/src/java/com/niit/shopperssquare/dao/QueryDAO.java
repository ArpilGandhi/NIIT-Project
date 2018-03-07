/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.dao;

import com.niit.shopperssquare.entities.Query;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface QueryDAO {
    int Query (Query query);
    int deletequery(int query_id);
    List<Query> getQuery();
    Query getQueryByID(int query_id);
    int updateQuery(int query_id, Query query);
    
    
    
}
