<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CONSULTAR CLIENTE</title>
</head>
<body>
  <h1>CONSULTAR CLIENTE</h1>
  <form id="form1">
    <fieldset style="width: 250px;">
      <legend>Código del cliente</legend>
      <input type="text" name="codigo">
      <input type="button" id="btnConsultar" value="Consultar">      
    </fieldset>
  </form>
  <div id="divCliente" style="display: none;">
    <h2>Datos del Cliente</h2>
    <table>
      <tr>
        <td>ID</td>
        <td>falta</td>
      </tr>
      <tr>
        <td>NOMBRE</td>
        <td>falta</td>
      </tr>
      <tr>
        <td>CONTACTO</td>
        <td>falta</td>
      </tr>
      <tr>
        <td>CARGO</td>
        <td>falta</td>
      </tr>
    </table>
  </div>

  <script>
    $("#btnConsultar").click(function(){
    	 // Traer datos en JSON
  	   // LLenar la tabla
   	   // Mostrar DIV
    	 $("#divCliente").show(); 
    });
  </script>
</body>
</html>