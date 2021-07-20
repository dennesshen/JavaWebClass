/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.rest.bookstore;

import com.google.gson.Gson;
import java.util.Base64;
import java.util.Objects;

/**
 *
 * @author denne
 */
public class Book {

    private Integer id;
    private String name;
    private Integer price;

    public Book() {
    }

    public Book(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.price);
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
        final Book other = (Book) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
       String json = new Gson().toJson(this);
        try {
            return Base64.getEncoder().encodeToString(json.getBytes("UTF-8"));
        } catch (Exception e) {
            return null;
        }
    }

}
