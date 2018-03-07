/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.entities;

/**
 *
 * @author DELL
 */
public class Item {
    public int item_id;
    public String item_name;
    public int item_piece;
    public String item_category;
    public int item_stock ;
    public String item_description;
    public String item_company;

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_piece() {
        return item_piece;
    }

    public void setItem_piece(int item_piece) {
        this.item_piece = item_piece;
    }

    public String getItem_category() {
        return item_category;
    }

    public void setItem_category(String item_category) {
        this.item_category = item_category;
    }

    public int getItem_stock() {
        return item_stock;
    }

    public void setItem_stock(int item_stock) {
        this.item_stock = item_stock;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public String getItem_company() {
        return item_company;
    }

    public void setItem_company(String item_company) {
        this.item_company = item_company;
    }

    public Item(int item_id, String item_name, int item_piece, String item_category, int item_stock, String item_description, String item_company) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_piece = item_piece;
        this.item_category = item_category;
        this.item_stock = item_stock;
        this.item_description = item_description;
        this.item_company = item_company;
    }

}
