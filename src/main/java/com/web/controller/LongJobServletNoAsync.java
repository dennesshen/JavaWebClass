/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller/longjobNoAsync")
public class LongJobServletNoAsync extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
            for (int i = 0; i < 10; i++) {

                try {
                    resp.getWriter().print((i + 1) + "進行第" + (i + 1) + "個工作" + "<p/>");
                    resp.getWriter().flush();
                    Thread.sleep(1000);

                } catch (IOException ex) {
                    Logger.getLogger(LongJobServletNoAsync.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                Logger.getLogger(LongJobServletNoAsync.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        

    }
}
