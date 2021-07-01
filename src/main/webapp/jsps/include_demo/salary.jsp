<%-- 
    Document   : salary
    Created on : 2021年6月28日, 下午7:22:26
    Author     : dennesshen
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%= new Random().nextInt(100000)%><p/>
            x = <%=request.getParameter("x")%><p/>
            message1 = <%=request.getParameter("message")%><p/>
            message2 = ${ paramValues.message[1] }<p/>
            message3 = ${ paramValues.message[2] }<p/>
            salary1.1 = ${ param.salary }<p/>
            salary1.2 = ${ param.salary }<p/>
            salary2.1 = ${ paramValues.salary[0]  }<p/>
            salary2.2 = ${ paramValues.salary[1]  }<p/>
            salary2.3 = ${ paramValues.salary[2]  }<p/>
            salary2.4 = ${ paramValues.salary[3]  }<p/>
            sum of salary = ${ paramValues.salary[0]+paramValues.salary[1]+paramValues.salary[2]+paramValues.salary[3]  }<p/>



        </h1>
    </body>
</html>
