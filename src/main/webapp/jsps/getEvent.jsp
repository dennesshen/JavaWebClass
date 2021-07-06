
<%@page import="java.util.Random"%>
<%@page errorPage="error_Page.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        int x = new Random().nextInt(100) +1;
        if( x%2 == 0){
            out.print(x);
        }else{
            throw new Exception( x+"不是偶數");
        }
    %>
       
</html>
