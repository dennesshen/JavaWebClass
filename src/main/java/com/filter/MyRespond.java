/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filter;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *
 * @author dennesshen
 */
public class MyRespond extends HttpServletResponseWrapper{
    private PrintWriter out;
    private CharArrayWriter bufferedWriter;
    
    public MyRespond(HttpServletResponse response){
        super(response);
        bufferedWriter = new  CharArrayWriter();
        out = new PrintWriter(bufferedWriter);
    }
    

    @Override
    public PrintWriter getWriter() throws IOException {
        return out;
    }
    
    public String getHTMLString(){
        return bufferedWriter.toString();
    }
    
    
    
}
