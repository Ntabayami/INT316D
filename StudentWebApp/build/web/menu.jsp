<%-- 
    Document   : menu
    Created on : Apr 23, 2025, 2:42:27 PM
    Author     : syabo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>
        <p>
            Choose the option below: 
        </p>
        <ol>
            <li><a href="addStudent.jsp">add student</a></li>
            <li><a href="viewAllStudServlet.do">view all students</a></li>
            <li><a href="deleteStudent.jsp">delete student</a></li>
            <li><a href="searchStudent.jsp">search student</a></li>
            <li><a href="countServlet.do">number of students</a></li>
        </ol>
    </body>
</html>
