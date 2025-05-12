<%-- 
    Document   : error
    Created on : May 12, 2025, 3:15:30 PM
    Author     : syabo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error Page</title>
    </head>
    <body>
        <h1>error!</h1>
        <%
            String name = (String)request.getAttribute("errorMsg");
        %>
        <p>
            <%=name%>
        </p>
    </body>
</html>
