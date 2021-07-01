/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dennesshen
 */
//client 請求URL  http://localhost:8080/JavaWeb20210531/hello?name=John
//上面URL當中/hello 為URL-Pattern, 要到META-INF/context.xml中設定與配置
// 上面URL當中/hello 為URL-Pattern, 要到WEB-INF/web.xml中設定與配置
public class HelloHttpServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        //req表示收到client的請求訊息
        String name = req.getParameter("name");
        
        //res表示要回應給client端的內容
        System.out.println("測試Hell0"+name);//印在Server 的 console當中
        PrintWriter out = resp.getWriter();//透過out 可以將訊息回應給 client
        out.print("Hello"+name+" "+ new Date());//把訊息寫在http回應的訊息中的part4
        //out.close 不用寫
        
    }
    
    
}
