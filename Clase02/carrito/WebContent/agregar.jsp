<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CFARRITO</title>
</head>
<body>
  <jsp:include page="cabecera.jsp"/>
  <h2>AGREGAR ITEM</h2>
  <p style="color:red;">${requestScope.error}</p>
  <form method="post" action="Grabar">
    Articulo:
    <input type="text" name="articulo"/><br/>
    Precio:
    <input type="text" name="precio"/><br/>
    Cantidad:
    <input type="text" name="cant"/><br/>
    <input type="submit" value="Procesar"/>    
  </form>
</body>
</html>