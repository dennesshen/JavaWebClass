/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/controller/bmi_session")
public class BMISession_authorCodeFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpSession session = req.getSession();
        String EnterCode = req.getParameter("EnterCode");
        String RandomNumber = session.getAttribute("RandomNumber").toString();

        if (EnterCode.equals(RandomNumber)) {
            chain.doFilter(req, res);
        } else {
            res.setContentType("text/html;charset=UTF-8");
            res.getWriter().println("驗證碼錯誤，請重新輸入");
            res.getWriter().println("</p> <button type=\"button\" onclick=\"window.history.back()\" class=\"pure-button pure-button-primary\">回上一頁</button>  ");

        }

    }

}
