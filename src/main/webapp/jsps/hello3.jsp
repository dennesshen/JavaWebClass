<%@page import="com.web.job.Calc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <%
          Calc calc =new Calc();
          calc.setX(10);
          calc.setY(20);
          out.println(calc.getResult());
      %>
      
      <jsp:useBean id="calc2" class="com.web.job.Calc"/>
      <jsp:setProperty name="calc2" property="x" value="30" />
      <jsp:setProperty name="calc2" property="y" value="40" />
      <jsp:getProperty name="calc2" property="result" />
                      

</html>
