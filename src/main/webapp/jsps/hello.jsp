<%-- 
    Document   : hello
    Created on : 2021年6月25日, 下午7:31:52
    Author     : dennesshen
--%>

<%@page import="java.util.List"%>
<%@page import="com.web.job.Lotto"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
    </head>

    <body style="padding: 20px">
        <h1>JspShow !</h1>

        <%
            Lotto lotto = new Lotto();
            List resultList = lotto.get539();
            out.print(resultList + "</p>");
        %>

        <table class="pure-table pure-table-bordered">
            <thead>
                <tr>
                    <th>1</th><th>2</th><th>3</th><th>4</th><th>5</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=resultList.get(0)%></td>
                    <td><%=resultList.get(1)%></td>
                    <td><%=resultList.get(2)%></td>
                    <td><%=resultList.get(3)%></td>
                    <td><%=resultList.get(4)%></td>
                </tr>
            </tbody>
        </table></p>
                

        <%
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            out.print(sdf.format(now));
        %>

        <%@include file="hello2.jsp" %>
        
    </body>
</html>
