/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller/cookies/read")
public class ReadCookieServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8 ");
        Cookie[] cookies = req.getCookies();
        PrintWriter out = resp.getWriter();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.print(cookie.getName() + ":" + cookie.getValue()+"<br>");
            }

        }else{
            out.print("No Cookie !");
        }
    }

}
