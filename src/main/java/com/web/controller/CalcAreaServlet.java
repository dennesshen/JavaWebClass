/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dennesshen
 */
@WebServlet("/controller/CalcArea") //簡易寫法，直接表示URL-Pattern 
public class CalcAreaServlet extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().print("sorry!");
//    }

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String string_r = req.getParameter("r");
        int r = Integer.parseInt(string_r);
        double result = Math.pow(r, 2) * Math.PI;
        resp.getWriter().print(String.format("r = %d , area = %.2f",r, result) ) ;
    }
    
    
}
