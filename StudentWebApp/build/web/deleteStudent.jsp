<%-- 
    Document   : deleteStudent
    Created on : Apr 23, 2025, 4:59:44 PM
    Author     : syabo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Student Page</title>
    </head>
    <body>
        <h1>Delete Student</h1>
        <form action="deleteStudentServlet.do" method="POST">
            <table>
                <tr>
                    <td>Student number: </td>
                    <td><input type="text" name="stdno"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
