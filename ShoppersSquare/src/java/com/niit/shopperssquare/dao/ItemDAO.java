/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.dao;

import com.niit.shopperssquare.entities.Item;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ItemDAO {
    int Item (Item item);
    int deleteItem(int item_id);
    List<Item> getItem();
    Item getItemByID(int item_id);
    int updateItem(int item_id, Item item);
    
   
}
