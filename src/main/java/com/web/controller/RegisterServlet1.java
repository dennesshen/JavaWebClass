/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import com.web.service.RegisterService;
import java.io.IOException;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dennesshen
 */
@WebServlet("/controller/RegisterServlet1")
public class RegisterServlet1 extends HttpServlet {
    
    private RegisterService service = new RegisterService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String studentNumber = req.getParameter("studentNumber");
        String testChoose = req.getParameter("testChoose");
        String memoText = req.getParameter("memoText");
        //System.out.println(memoText);
        Boolean pay = Boolean.parseBoolean(req.getParameter("pay"));
        List<Integer> times = Stream.of(req.getParameterValues("times"))
                .map(t -> Integer.parseInt(t))
                .collect(toList());//？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？

        //建立分派器
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/registerResultJSP1.jsp");

        //設置參數
        req.setAttribute("studentNumber", studentNumber);
        req.setAttribute("testChoose", testChoose);
        req.setAttribute("memoText", memoText);
        req.setAttribute("pay", service.payOrNot(pay));
        req.setAttribute("times", service.getTimesName(times));

        //傳送
        rd.forward(req, resp);

    }

}
