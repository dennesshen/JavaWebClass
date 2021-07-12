/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 *
 * @author dennesshen
 */
public class ExchangeRateTag implements Tag {

    private PageContext pageContext;
    private Tag parentTag;
    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void setPageContext(PageContext pc) {
        pageContext = pc;
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
            if (symbol != null && symbol.length() == 8) {
                Stock stock = YahooFinance.get(symbol);
                if (stock != null) {
                    double Price = stock.getQuote().getPrice().doubleValue();
                    out.println("1");
                    out.println(symbol.substring(0, 3) + " = ");
                    out.println(Price + " ");
                    out.println(symbol.substring(3, 6) + "<p/>");
                } else {
                    out.println("查無此匯率商品");
                }

            } else {
                out.println("symbol 格式錯誤：" + symbol);
            }
        } catch (Exception e) {
        }

        return Tag.SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        return Tag.EVAL_PAGE;
    }

    @Override
    public void release() {
    }

}
