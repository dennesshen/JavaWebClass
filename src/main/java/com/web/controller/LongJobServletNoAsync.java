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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dennesshen
 */
class Delay implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }
}

@WebServlet("/controller/longjobNoAsync")
public class LongJobServletNoAsync extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        Delay delay = new Delay();
        Thread t = new Thread(delay);
        for (int i = 0; i < 10; i++) {
            resp.getWriter().print( (i+1)+"進行第"+(i+1)+"個工作"+"<p/>");
            resp.getWriter().flush();
            t.start();
        }
    }

}
