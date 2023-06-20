<%-- 
    Document   : index
    Created on : 19 juin 2023, 11:12:36
    Author     : SY
--%>

<%
    if(session.getAttribute("name")== null) {
        response.sendRedirect("Page/inscrire.jsp");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
