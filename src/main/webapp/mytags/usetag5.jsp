<%-- 
    Document   : usetag
    Created on : 2021年7月5日, 下午8:29:09
    Author     : dennesshen
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/tlds/mytld_library" prefix="mytld_library"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <mytld_library:ExchangeRate symbol="USDTWD=x" />
        </h1>
        <h1>
            <mytld_library:ExchangeRate symbol="TWDUSD=x" />
        </h1>
        
        <h1>
            <mytld_library:ExchangeRate symbol="1234155533" />
        </h1>
    </body>
</html>
