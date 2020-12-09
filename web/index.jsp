<%-- 
    Document   : index
    Created on : 5/12/2020, 08:42:43 PM
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
        <form method="post" action="registrarProyecto" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>ID: </td>
                    <td><input type="text" name="id" size="50"/></td>
                </tr>
                <tr>
                    <td>titulo: </td>
                    <td><input type="text" name="titulo" size="50"/></td>
                </tr>
                <tr>
                    <td>grupo: </td>
                    <td><input type="text" name="grupo" size="50"/></td>
                </tr>
                <tr>
                    <td>intro: </td>
                    <td><input type="text" name="intro" size="50"/></td>
                </tr>
                <tr>
                    <td>glosario: </td>
                    <td><input type="text" name="glosario" size="50"/></td>
                </tr>
                <tr>
                    <td>proposito: </td>
                    <td><input type="text" name="proposito" size="50"/></td>
                </tr>
                <tr>
                    <td>impacto: </td>
                    <td><input type="text" name="impacto" size="50"/></td>
                </tr>
                <tr>
                    <td>objetivos: </td>
                    <td><input type="text" name="objetivos" size="50"/></td>
                </tr>
                <tr>
                    <td>archivo: </td>
                    <td><input type="file" name="archivo" size="50"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
