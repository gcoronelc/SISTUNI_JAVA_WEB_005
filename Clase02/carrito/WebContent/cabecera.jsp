<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>DEMO DE CARRITO</h1>

<h3>Hola ${sessionScope.carrito.cliente}</h3>
<p>
Cantidad de Items: ${sessionScope.carrito.cantItems}
&nbsp &nbsp &nbsp
Importe Total: ${sessionScope.carrito.total}
</p>

<a href="main.jsp">Home</a> &nbsp &nbsp &nbsp
<a href="agregar.jsp">Agregar Item</a> &nbsp &nbsp &nbsp
<a href="mostrar.jsp">Mostrar Carrito</a> &nbsp &nbsp &nbsp
