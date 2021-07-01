<%-- 
    Document   : registerJSP1
    Created on : 2021年6月11日, 下午9:11:33
    Author     : dennesshen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
String studentNumber =request.getAttribute("studentNumber").toString();
String testChoose        =request.getAttribute("testChoose") .toString();
String times                 =request.getAttribute("times").toString();
String pay                    = request.getAttribute("pay").toString();
String memoText         = request.getAttribute("memoText") .toString();

%>  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>提交結果</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
    </head>
    <body style="padding: 20px">
        <form class="pure-form">
            <fieldset>
                <legend style="color: #005100">提交結果</legend>
                學員編號：<%=studentNumber %><p />
                認證代號：<%=testChoose        %><p />
                考試時段：<%=times                 %><p />
                繳費狀況：<%=pay                    %><p />
                備註資料：<%=memoText         %><p />
                <button type="button" onclick="window.history.back()" class="pure-button pure-button-primary">回上一頁</button>
            </fieldset>
        </form>

    </body>
</html>
