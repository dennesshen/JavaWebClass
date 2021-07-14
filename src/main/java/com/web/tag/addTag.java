/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.tag;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author denne
 */
public class addTag extends SimpleTagSupport
        implements DynamicAttributes {

    private Map<String, Double> addMap = new LinkedHashMap<>();

    @Override
    public void setDynamicAttribute(String string, String localName, Object values) throws JspException {
        addMap.put(localName, Double.parseDouble(values.toString()));
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        Double sum = addMap.entrySet()
                           .stream()
                           .mapToDouble(Entry::getValue)
                           .sum();
        out.print(sum);
    }

}
