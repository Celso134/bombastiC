<%-- 
    Document   : ventana
    Created on : 7/12/2020, 11:31:16 AM
    Author     : monol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ALV XDD</h1>
        <iframe src="data:application/pdf;base64,<%=request.getAttribute("imgBase")%>" height="200" width="300"></iframe>
        <img src="data:image/jpeg;base64,<%=request.getAttribute("imgBase")%>"/>
    </body>
</html>
