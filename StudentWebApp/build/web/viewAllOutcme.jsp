<%-- 
    Document   : viewAllOutcme
    Created on : Apr 23, 2025, 3:52:30 PM
    Author     : syabo
--%>

<%@page import="java.util.Base64"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All Outcome Page</title>
    </head>
    <body>
        <h1>View All Outcome</h1>
        <%
            List<Student> list = (List<Student>)request.getAttribute("list");
        %>
        <table>
            <%
                for(int i = 0; i <list.size(); ++i)
                {
                    Student p = list.get(i);
                    String name = p.getName();
                    String surname = p.getSurname();
                    String stuNo = p.getStudentNumber();
                    byte[] photo = p.getPhoto();
                    
                    String image = "data:image/*;base64," + Base64.getEncoder().encodeToString(photo);
                
            %>
            <tr>
                <td><img src="<%=image%>" height="50" width="50"/></td>
            </tr>
            <tr>
                <td>Student number:</td>
                <td><%=stuNo%></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td>Surname:</td>
                <td><%=surname%></td>
            </tr>
            <%
                }
            %>
        </table>
        <p>
            Click <a href="menu.jsp">here</a> to go back to menu 
            or <a href="index.html">here</a> to exit
        </p>
    </body>
</html>
