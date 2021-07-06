<%-- 
    Document   : usetag
    Created on : 2021年7月5日, 下午8:29:09
    Author     : dennesshen
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://my.scwcd" prefix="my"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1><my:required /> </h1> 
        <h1><my:greet user="Vincent" /> </h1> 
        <h1><my:greet user="Vincent ${ 1+2 } "  /> </h1> 
        <h1><my:if condition="<%= (new Date().getTime() % 2 == 0)%>">
                現在時間：<%= new Date()%>
            </my:if>
        </h1>

        <h1><my:loop count="3">
                Java <br>
            </my:loop>
        </h1>

        <hr>
        <my:mark search="s">
            she sell sea shore on the sea shore
        </my:mark>
        <hr>
        <h1>
            <my:implicit attributeName="RandomNumber" scopeName="session"/>
        </h1>

        <h1>
            <my:switch conditionValue="2">
                <my:case caseValue="1">
                    男生
                </my:case>
                <my:case caseValue="2">
                    女生
                </my:case>
                <my:case caseValue="default">
                    錯誤
                </my:case>
            </my:switch>
        </h1>

    </body>
</html>
