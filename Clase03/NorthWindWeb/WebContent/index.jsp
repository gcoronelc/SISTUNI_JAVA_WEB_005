<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/estilos.css" rel="stylesheet" type="text/css" />
<title>INGRESO AL SISTEMA</title>
<style type="text/css">
#LOGON{
  width: 400px;
  background-color: white;
  color: #2E2E2E;
  margin: 10px auto;
  padding: 10px;
}
</style>
</head>
<body>
  <div id="LOGON">
    <img src="img/logo.jpg"/>
    <h1>INGRESO AL SISTEMA</h1>
    <p>${requestScope.error}</p>
    <form method="post" action="LogonIngresar">
      <table>
        <tr>
          <td>Usuario:</td>
          <td><input type="text" name="usuario" /></td>  
        </tr>
        <tr>
          <td>Clave:</td>
          <td><input type="password" name="clave" /></td>  
        </tr>
        <tr>
          <td colspan="2"><input type="submit" value="Ingresar" /></td>  
        </tr>
      </table>
    </form>
  </div>
</body>
</html>