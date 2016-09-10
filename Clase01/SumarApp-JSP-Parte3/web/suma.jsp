<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="mate" scope="request" 
             class="pe.egcc.app.service.MateService" />
<jsp:setProperty name="mate" property="num1" param="a" />
<jsp:setProperty name="mate" property="num2" param="b" />
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
        <td><jsp:getProperty name="mate" property="num1" /></td>
      </tr>
      <tr>
        <td>Número 2:</td>
        <td><jsp:getProperty name="mate" property="num2" /></td>
      </tr>
      <tr>
        <td>Suma:</td>
        <td><jsp:getProperty name="mate" property="suma" /></td>
      </tr>
    </table>
      <a href="index.html">Retornar</a>
  </body>
</html>
