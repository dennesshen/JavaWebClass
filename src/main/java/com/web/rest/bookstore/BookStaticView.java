/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.rest.bookstore;

import com.google.gson.Gson;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author denne
 */
public class BookStaticView {

    private String name;
    private Integer amount;
    private Integer subtotal;
    private Integer AveragePrice;

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getAveragePrice() {
        return AveragePrice;
    }

    public void setAveragePrice(Integer AveragePrice) {
        this.AveragePrice = AveragePrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.amount);
        hash = 41 * hash + Objects.hashCode(this.subtotal);
        hash = 41 * hash + Objects.hashCode(this.AveragePrice);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BookStaticView other = (BookStaticView) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        if (!Objects.equals(this.subtotal, other.subtotal)) {
            return false;
        }
        if (!Objects.equals(this.AveragePrice, other.AveragePrice)) {
            return false;
        }
        return true;
    }

    
    
//    @Override
//    public String toString() {
//       String json = new Gson().toJson(this);
//        try {
//            return Base64.getEncoder().encodeToString(json.getBytes("UTF-8"));
//        } catch (Exception e) {
//            return null;
//        }
//    }
}
