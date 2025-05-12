<%-- 
    Document   : searchOutcome
    Created on : Apr 23, 2025, 8:39:00 PM
    Author     : syabo
--%>

<%@page import="java.util.Base64"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Outcome Page</title>
    </head>
    <body>
        <h1>Search Outcome</h1>
        <%
            Student st = (Student)request.getAttribute("st");
            String stuno  = st.getStudentNumber();
            String name = st.getName();
            String surname = st.getSurname();
            byte[] photo = st.getPhoto();
            
            String image = "data:image/*; base64," + Base64.getEncoder().encodeToString(photo);
        %>
        <table>
            <tr>
                <td><img src="<%=image%>" height="50" width="50"/></td>
            </tr>
            <tr>
                <td>Student number:</td>
                <td><%=stuno%></td>
            </tr>
            <tr>
                <td>Student name:</td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td>Student surname:</td>
                <td><%=surname%></td>
            </tr>
        </table>
        <p>
            Click <a href="menu.jsp">here</a> to go back to menu 
            or <a href="index.html">here</a> to exit
        </p>
    </body>
</html>
