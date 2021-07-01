<%-- 
    Document   : calcAreaResult
    Created on : 2021年6月7日, 下午8:26:54
    Author     : dennesshen
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>計算結果</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
    </head>
    <body style="padding: 20px" >
        
        <% List<Map> resultList = (List<Map>) request.getAttribute("ResultList");%>
        <% for (Map map : resultList) {%>
        <form class="pure-form" >
            <fieldset>
                <legend>計算<%=map.get("TypeName")%>結果</legend>
                半徑：<font color="#0000ff"><%=map.get("Radio")%></font><br>
                結果：<font color="#ff0000"><%=map.get("Result")%></font><p />
            </fieldset>
        </form>
        <% }%>
        
        <button type="button" onclick="window.history.back()" class="pure-button pure-button-primary">回上一頁</button>
    </body>
</html>
