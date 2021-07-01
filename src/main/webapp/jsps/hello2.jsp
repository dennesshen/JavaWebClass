<%-- 
    Document   : hell02
    Created on : 2021年6月25日, 下午8:51:13
    Author     : dennesshen
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--

<% %> scriptlet 配置在 _jspService內 

<%= %> expression 配置在 _jspServlet()內 ex: out.print(1+1);

<%! %> declare 物件變數, 方法 配置在 _jspServlet()外

--%>

        <%!int x=100;%>
        <% int x=200; %>
        <%=x%>
        <%=this.x%>
        <%=lotto() %>
        <%! 
                public int lotto(){
                    return new Random().nextInt(100);
                }
        %>
        
