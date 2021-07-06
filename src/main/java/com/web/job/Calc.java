/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.job;

/**
 *
 * @author dennesshen
 */
public class Calc {

    private int x;
    private int y;
    private int result;

    public Calc() {
    }
   

    public Calc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int getResult(){
        return x+y;
    }
    

}
