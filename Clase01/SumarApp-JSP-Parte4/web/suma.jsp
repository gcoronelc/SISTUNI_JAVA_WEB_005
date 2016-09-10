<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="model" scope="request" 
             type="pe.egcc.app.model.SumaModel"/>
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
        <td><jsp:getProperty name="model" property="num1" /></td>
      </tr>
      <tr>
        <td>Número 2:</td>
        <td><jsp:getProperty name="model" property="num2" /></td>
      </tr>
      <tr>
        <td>Suma:</td>
        <td><jsp:getProperty name="model" property="suma" /></td>
      </tr>
    </table>
      <a href="index.html">Retornar</a>
  </body>
</html>
