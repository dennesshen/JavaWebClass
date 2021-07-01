<%-- 
    Document   : main
    Created on : 2021年6月28日, 下午7:22:17
    Author     : dennesshen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <% String message = "I_Love Java中文";%>
            <%@include file="title.jsp" %> <!--靜態include，不可以帶參數 -->
        </h1>
        <h1>
            <!--動態include，可以帶參數 -->     
            <%request.setCharacterEncoding("UTF-8");%>
            <jsp:include page="salary.jsp?x=10&salary=10&salary=20&message='Hi' " >
                <jsp:param name="message" value="<%=message%>"/>
                <jsp:param name="message" value="I love America !"/>
                <jsp:param name="salary" value="40000"/>
                <jsp:param name="salary" value="50000"/>
            </jsp:include>

        </h1>
    </body>
</html>
