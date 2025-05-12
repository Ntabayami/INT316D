<%-- 
    Document   : countOutcome
    Created on : Apr 23, 2025, 9:15:25 PM
    Author     : syabo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Count Outcome Page</title>
    </head>
    <body>
        <h1>Count Outcome!</h1>
        <%
            Integer count = (Integer)request.getAttribute("count");
        %>
        <p>We have <b><%=count%></b> students in the database.</p>
        <p>
            Click <a href="menu.jsp">here</a> to go back to menu 
            or <a href="index.html">here</a> to exit
        </p>
    </body>
</html>
