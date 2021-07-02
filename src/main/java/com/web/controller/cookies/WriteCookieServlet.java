/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller/cookies/write")
public class WriteCookieServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String salary = req.getParameter("salary");
        String age = req.getParameter("age");
        //建立Cookies
        Cookie cookieSalary = new Cookie("salary", salary+"");
        Cookie cookieAge = new Cookie("age", age+"");
        //設定續存時間
        cookieSalary.setMaxAge(10);
        cookieAge.setMaxAge(10);
        //將cookies寫入Client 端
        resp.addCookie(cookieAge);
        resp.addCookie(cookieSalary);
        
        resp.getWriter().print("Write Cookies ok");
        
    }
    
}
