<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="capaEntidades.Electrodomesticos" %>
<%@ page import="capaLogica.Ejecuta;" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<Electrodomesticos> electro = new Ejecuta().getOrden(); %>
<table border="1" bordercolor="Blue" id="contenido">
 <tr style="font-weight: bold;">
  	<td> Descripcion </td>
	<td> Precio (U$S) </td>
	<td> Color </td>
	<td> Peso (kg) </td>
	<td> Consumo	</td>
	<td> Carga (kg) </td>
	<td> Resol. (in)	</td>
	<td> TDT	</td>
 </tr>
 <% for(int i=0; i<electro.size();i++) { %>
 <tr>
 		<td align="center"> <%= electro.get(i).getTipo() %> </td>
 		<td align="center"> <%= electro.get(i).precioFinal() %> </td>
 		<td align="center"> <%= electro.get(i).getCol().getColor() %> </td>
 		<td align="center"> <%= electro.get(i).getPeso() %> </td>
 		<td align="center"> <%= electro.get(i).getConsu().getConsumo()%> </td>
 		<td align="center"> <% if(electro.get(i) instanceof capaEntidades.Lavarropas) 
 								{ %> <%= ((capaEntidades.Lavarropas)electro.get(i)).getCarga() %> 
 								<% } else { %>
 								<%="" %> <% } %> </td>
 		<td align="center"> <% if(electro.get(i) instanceof capaEntidades.Television) 
 								{ %> <%= ((capaEntidades.Television)electro.get(i)).getResolucion() %> 
 								<% } else { %>
 								<%="" %> <% } %></td>
 		<td align="center"> <% if(electro.get(i) instanceof capaEntidades.Television) 
 								{ %> <%= ((capaEntidades.Television)electro.get(i)).getTDT() %> 
 								<% } else { %>
 								<%="" %> <% } %></td>
 		<td> 
 		<form action="eliminarElectrodomestico" method="post">
 			<input type="submit" name="submit" value="Eliminar" style="color: red; font-weight: bold;">
 		</form>
 		</td>
 		<td>
 		<form action="modificarElectrodomestico" method="post">
 			<input type="submit" name="submit" value="Modificar" style="color: green; font-weight: bold;">
 		</form>
 		</td>
  </tr>
 <% } %> 
</table>
</body>
</html>