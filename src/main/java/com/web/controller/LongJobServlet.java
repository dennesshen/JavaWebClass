/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import com.web.job.LongJob;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dennesshen
 */
@WebServlet(urlPatterns = {"/controller/longjob"}, asyncSupported = true)
public class LongJobServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");////??????????????????????????????????????????????
        PrintWriter out = resp.getWriter();
        out.print("進入Servlet的時間" + new Date() + "<p/>");
        out.flush();

        AsyncContext ctx = req.startAsync();
        LongJob longjob = new LongJob(ctx);
        Thread t = new Thread(longjob);
        t.start();
        

        out.print("離開 Servlet 的時間: " + new Date() + "<p/>");

    }

}
