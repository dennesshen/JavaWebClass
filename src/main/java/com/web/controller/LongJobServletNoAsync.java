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
        System.out.println("Test1");
        resp.getWriter().print("一");
        resp.getWriter().flush();
        t.start();
        System.out.println("Test2");

        resp.getWriter().print("二");
        resp.getWriter().print("三");
        resp.getWriter().flush();
        t.start();
        System.out.println("Test3");

        resp.getWriter().print("四");
        resp.getWriter().print("五");
        resp.getWriter().print("六");
        resp.getWriter().flush();
        t.start();
        System.out.println("Test4");

        resp.getWriter().print("七");
        resp.getWriter().print("八");
        resp.getWriter().print("九");
        resp.getWriter().print("十");
        System.out.println("Test2");
    }

}
