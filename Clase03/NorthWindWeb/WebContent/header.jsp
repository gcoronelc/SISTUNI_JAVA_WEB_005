<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<table style="width: 100%;">
  <tr>
    <td style="width: 50%;"><img src="img/logo.jpg" /></td>
    <td>
      Usuario: ${sessionScope.usuario.nombre}<br>
      <a href="#">Salir</a>
    </td>
  </tr>
</table>