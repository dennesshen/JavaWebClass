

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    static int x = 10;

    public static int getRandomNumber1(int i) {
        return new Random().nextInt(i);
    }

    public int getRandomNumber2() {
        return 0;
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            int x = 11;
            out.print(x);
            out.print(this.x);
        %>
    </body>
</html>
