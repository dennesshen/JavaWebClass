<%-- 
    Document   : usetag
    Created on : 2021年7月5日, 下午8:29:09
    Author     : dennesshen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="mytld_library"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
        <title>WatchList</title>
    </head>
    <body style="padding: 20px">
        <mytld_library:watchList symbols="${param.symbols}" />
    </body>
</html>
