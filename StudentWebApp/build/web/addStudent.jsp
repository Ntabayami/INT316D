<%-- 
    Document   : addStudent
    Created on : Apr 23, 2025, 2:45:09 PM
    Author     : syabo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student Page</title>
    </head>
    <body>
        <h1>Add Student!</h1>
        
        <form action="addStudentServlet.do" method="POST" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>Student number:</td>
                    <td><input type="text" name="stdnum"/></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" name="lname"/></td>
                </tr>
                <tr>
                    <td><input type="file" name="photo" accept="image/*"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
