<%-- 
    Document   : addStudentOutcome
    Created on : Apr 23, 2025, 3:14:22 PM
    Author     : syabo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student Outcome Page</title>
    </head>
    <body>
        <h1>Add Student Outcome!</h1>
        <%
            String name = (String)request.getAttribute("name");
        %>
        <p>
            <b><%=name%></b> was added.
            Click <a href="menu.jsp">here</a> to go back to menu 
            or <a href="index.html">here</a> to exit
        </p>
    </body>
</html>
