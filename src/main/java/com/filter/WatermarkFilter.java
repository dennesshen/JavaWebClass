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

public class WatermarkFilter extends  HttpFilter{

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        
        MyRespond myRespond = new MyRespond(res);
        
        chain.doFilter(req, myRespond);
        
        String html = myRespond.getHTMLString();
        String watermellon = "<body background='/JavaWeb20210531/images/do_not_copy.png' ";
        html = html.replaceAll("<body", watermellon);
        //System.out.println(html);
        res.getWriter().print(html);
        
        
    }
    
    
}
