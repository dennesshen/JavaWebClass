/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.tag;

import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

/**
 *
 * @author dennesshen
 */
public class HelloTag implements Tag {
    private PageContext pageContext;
    private Tag parentTag;

    @Override
    public void setPageContext(PageContext pc) {
        pageContext=pc;
    }

    @Override
    public void setParent(Tag tag) {
        parentTag = tag;
    }

    @Override
    public Tag getParent() {
        return parentTag;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.print("晚安 !");
        } catch (Exception e) {
        }
        return Tag.SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        JspWriter out =pageContext.getOut();
        try {
            out.print("現在時間："+new Date());
        } catch (Exception e) {
        }
        return Tag.EVAL_PAGE;
    }

    @Override
    public void release() {
    }
    
    
}
