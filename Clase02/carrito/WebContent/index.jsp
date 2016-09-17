<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CARRITO</title>
</head>
<body>
  <h1>CARRITO</h1>
  <h2>Inicio de Sesion</h2>
  <p>${requestScope.error}</p>
  <form method="post" action="Ingresar">
    Nombre:
    <input type="text" name="nombre"/>
    <input type="submit" value="Ingresar"/>
  </form>
</body>
</html>