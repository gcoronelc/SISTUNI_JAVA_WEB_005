<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>SUMAR</h1>
    <!-- FORMULARIO -->
    <form method="post" action="MateSumar">
      <p>Número 1: <input type="text" name="num1"/></p>
      <p>Número 2: <input type="text" name="num2"/></p>
      <p><input type="submit" value="Procesar"/></p>
    </form>

    <!-- REPORTE -->
    <c:if test="${requestScope.model != null}">
      <h1>REPORTE</h1>
      <table>
        <tr>
          <td>Número 1:</td>
          <td>${requestScope.model.num1}</td>
        </tr>
        <tr>
          <td>Número 2:</td>
          <td>${requestScope.model.num2}</td>
        </tr>
        <tr>
          <td>Suma:</td>
          <td>${requestScope.model.rpta}</td>
        </tr>
      </table>
    </c:if>
      
      <a href="index.html">Retornar</a>
  </body>
</html>
