/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.tag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author denne
 */
public class circleAreaTag extends SimpleTagSupport {

    private double r;
    private int mode = 1;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        double result = 0.0;
        switch (mode) {
            case 1:
                result = Math.pow(r, 2) * Math.PI;
                break;
            case 2:
                result = Math.pow(r, 3) * Math.PI* 4 / 3;
                break;
        }

        out.print(String.format("r= %.1f, model=%d, area=%.2f", r, mode, result));

    }
    
}

