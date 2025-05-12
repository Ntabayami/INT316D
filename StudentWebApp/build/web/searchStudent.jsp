<%-- 
    Document   : searchStudent
    Created on : Apr 23, 2025, 8:24:36 PM
    Author     : syabo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Student Page</title>
    </head>
    <body>
        <h1>Search Student</h1>
        <form action="searchStudentServlet.do" method="POST">
            <table>
                <tr>
                    <td>Student number:</td>
                    <td><input type="text" name="stuno"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
