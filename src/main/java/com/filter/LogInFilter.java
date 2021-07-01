/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filter;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dennesshen
 */
//@WebFilter("/secure/report.jsp")
public class LogInFilter extends HttpFilter {

    private static Map<String, String> users = new LinkedHashMap<>();

    static {
        users.put("John", "1234");
        users.put("Mary", "5678");
        users.put("Jean", "0000");
        users.put("admin", "9999");
    }

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        boolean check = false;
        String errorInformation = "輸入帳密有誤，請重新輸入";
        check = users.entrySet().stream()
                .filter(e -> e.getKey().equals(username)
                && e.getValue().equals(password))
                .findAny()
                .isPresent();
        if( !(username == null && password == null) ){
            req.setAttribute("errorInformation", errorInformation);
        }else{
            req.setAttribute("errorInformation", "");
        }
        
        if (check) {
            chain.doFilter(req, res);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/LogIn.jsp");
            rd.forward(req, res);
        }

    }

}
