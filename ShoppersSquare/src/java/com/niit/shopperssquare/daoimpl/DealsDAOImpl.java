/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.shopperssquare.daoimpl;

import com.niit.shopperssquare.dao.DealsDAO;
import com.niit.shopperssquare.entities.Deals;
import java.util.List;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/**
 *
 * @author DELL
 */
public class DealsDAOImpl implements DealsDAO{
     
    

    
   public int Deals(Deals deals) {
        Connection connection = DBConnection.getConnection();
      public int adddeals(Deals deals)
        int count=0;
        try{
             
           
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Deals (deal_id,deal_start_date,deal_end_date,deal_discount,item_id,manager_id) values(?,?,?,?,?)");
            preparedStatement.setString(1,Deals(getDealsByID(count)));
            preparedStatement.setString(2,Deals.geteals_start_date());
            preparedStatement.setString(3,deal.getDeal_end_date());
            preparedStatement.setString(4,DEAL.getDeal_discount());
            preparedStatement.setString(5,deal.getDeal_item_id());
            preparedStatement.setString(3,deal.getDeal_manager_id());
            java.util.Date cust = new java.util.Date();
            count = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
           Logger.getLogger(DealsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
       }
       return 0;
         
     }

    @Override
    public int deletedeals(int deals_id) {
        int count=0;
        try {
            
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from Deals where deal_id=?");
            preparedStatement.setInt(1,deals_id);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DealsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Deals> getDeals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Deals getDealsByID(int deals_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateDeals(int deals_id, Deals deals) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
 
    }

    @Override
    public List<Deals> getDeals() {
    {
        List<Deals> DealsList = null;
        try {
            Connection connection = DBConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from deals");
            ResultSet resultSet = preparedStatement.executeQuery();
            DealsList = new ArrayList<Deals>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int deal_id = resultSet.getInt(1);
                    String deal_id = resultSet.getString(2);
                    String deal_start_date = resultSet.getString(3);
                    String deal_end_date = resultSet.getString(4);
                    String deal_discount = resultSet.getString(5);
                    String item_id = resultSet.getString(6);
                    String manager_id = resultSet.getString(7);
                    Deal deal = new Deal(deal_id, deal_start_date, deal_end_date, deal_discount,item_id,manager_id);
                    DealsList.add(deal);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DealsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return DealList;
     }



       
    }

    @Override
    public Deals getDealsByID(int deals_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateDeals(int deals_id, Deals deals) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}