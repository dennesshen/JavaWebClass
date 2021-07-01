/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import com.web.service.CalcAreaService;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 *
 * @author dennesshen
 */

    @WebServlet("/controller/CalcAreaByJSP") //簡易寫法，直接表示URL-Pattern 
public class CalcAreaServletByJSP extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().print("sorry!");
//    }
        private CalcAreaService service = new CalcAreaService();

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1接受參數
        String[] stringsOfRadios = req.getParameterValues("r");
        String[] typesOfYouWantCalc = req.getParameterValues("type");

        //System.out.println(type);
        //2邏輯運算
        List<Map> resultList = service.getFinalResult(typesOfYouWantCalc, stringsOfRadios);
        //3.1新增分派器並設定ＪＳＰ位址
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/calcAreaResult.jsp");
        //3.2設定request 屬性
        //req.setAttribute("r", r);
        //req.setAttribute("result", String.format("%.2f", result));
        //req.setAttribute("TypeName", service.getTypeName(type));
        req.setAttribute("ResultList", resultList);
        //3.3傳送
        rd.forward(req, resp);
        
        
    }
    
    
}
    

