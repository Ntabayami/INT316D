<%-- 
    Document   : deleteOutcome
    Created on : Apr 23, 2025, 5:15:47 PM
    Author     : syabo
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Outcome Page</title>
    </head>
    <body>
        <h1>Delete Outcome!</h1>
        <%
            Student st = (Student)request.getAttribute("st");
            String name = st.getName();
        %>
        <p>
            <b><%=name%></b> is removed.
        </p>
        <p>
            Click <a href="menu.jsp">here</a> to go back to menu 
            or <a href="index.html">here</a> to exit
        </p>
    </body>
</html>
