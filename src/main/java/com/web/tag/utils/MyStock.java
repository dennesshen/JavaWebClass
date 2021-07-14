/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.tag.utils;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 *
 * @author denne
 */
public class MyStock {
    private static String red = "#FF0000";
    private static String green = "#00c928";
    private static String black = "#000000";

    private String symbol;
    private String name;
    private double price;
    private double change;
    private String color;

    public MyStock(String symbol) {
        setSymbol(symbol);
    }

    public MyStock() {
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
        try {
            Stock stock = YahooFinance.get(symbol);
            this.name = stock.getName();
            this.price = stock.getQuote().getPrice().doubleValue();
            this.change = stock.getQuote().getChangeInPercent().doubleValue();
            setColor(this.change >0 ? red : this.change <0 ? green : black );
        } catch (Exception e) {
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
