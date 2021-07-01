/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dennesshen
 */
public class PerformanceFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        long beginTime;
        long endTime;
        System.out.println("測試開始----------------------------");
        beginTime = System.currentTimeMillis();
        chain.doFilter(req, res);
        endTime = System.currentTimeMillis();
        System.out.println( (endTime - beginTime));
        String showString = String.format("用時：%.10f秒", (double)(endTime - beginTime));
        System.out.println(showString);
        System.out.println("測試結束----------------------------");

    }

}
