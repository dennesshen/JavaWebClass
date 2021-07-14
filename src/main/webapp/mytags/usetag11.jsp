<%-- 
    Document   : usetag
    Created on : 2021年7月5日, 下午8:29:09
    Author     : dennesshen
--%>

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
            <mytld_library:AddTag x="19" y="15" />
        </h1>
                <h1> 
            <mytld_library:AddTag x="19" y="15" z="20 " />
        </h1>
       

    </body>
</html>
