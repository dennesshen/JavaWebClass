/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/controller/bmi_session")
public class BMIsessionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String cname = req.getParameter("cname");
        Double height = Double.parseDouble(req.getParameter("height"));
        Double weight = Double.parseDouble(req.getParameter("weight"));
        Double BMI = weight / Math.pow(height / 100.0, 2);
        // 將資料存入 session
        session.setAttribute("cname", cname);
        session.setAttribute("height", height);
        session.setAttribute("weight", weight);
        session.setAttribute("BMI", BMI);

        resp.getWriter().println("post ok");
        resp.getWriter().println("session id :" + session.getId());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        resp.getWriter().println("get ok");
        resp.getWriter().println("session id"+session.getId());
        resp.getWriter().println("cname :"+session.getAttribute("cname"));
        resp.getWriter().println("weight :"+session.getAttribute("weight"));
        resp.getWriter().println("height :"+session.getAttribute("height"));
        resp.getWriter().println("BMI :"+session.getAttribute("BMI"));

    }

}
