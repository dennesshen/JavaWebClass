/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.job;

import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.AsyncContext;

/**
 *
 * @author dennesshen
 */
public class LongJob implements Runnable {

    private AsyncContext ctx;

    public LongJob(AsyncContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = ctx.getResponse().getWriter();
            for (int i = 1; i < 10; i++) {
                Thread.sleep(1000);
                out.print(i + ". 很長的工作做完了" + new Date() + "</p>");
                out.flush();
            }
            out.print("已完成所有工作了");
            out.print(
                    "</p> <button type=\"button\" onclick=\"window.history.back()\" class=\"pure-button pure-button-primary\">回上一頁</button> ");
            ctx.complete();//關掉ctx
        } catch (Exception e) {
        }
    }
    
    

}
