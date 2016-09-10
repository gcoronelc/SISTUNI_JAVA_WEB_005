<%@page import="pe.egcc.app.service.MateService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
// Datos
int n1 = Integer.parseInt(request.getParameter("num1"));
int n2 = Integer.parseInt(request.getParameter("num2"));
// Proceso
MateService service = new MateService();
int suma = service.sumar(n1, n2);
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SUMAR</title>
  </head>
  <body>
    <h1>SUMA</h1>
    <table>
      <tr>
        <td>Número 1:</td>
        <td><%= n1 %></td>
      </tr>
      <tr>
        <td>Número 2:</td>
        <td><%= n2 %></td>
      </tr>
      <tr>
        <td>Suma:</td>
        <td><%= suma %></td>
      </tr>
    </table>
      <a href="index.html">Retornar</a>
  </body>
</html>
