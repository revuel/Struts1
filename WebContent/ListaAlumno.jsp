<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!-- Strut Tags & dependencies-->
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %> <!-- Estas etiquetas tienen que estar en web-xml puestas -->
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>  

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Listado alumnos</title>
	</head>
	<body>
		<h2>Listado de todos los alumnos</h2>
		<p>Esto no aparece expl�citamente en el enunciado</p>
		<hr>
			<table>
				<thead>
					<tr>
						<th>Nombre</th>
						<th>Apellidos</th>
						<th>Edad</th>
						<th>Nota</th>
					</tr>
				</thead>
				<tbody>
					<logic:iterate name="alumni" id="alu" scope="session" >
					<!-- Debe existir alumni en sesi�n, creado en AddAlumnoAction -->
						<tr>
							<logic:notEmpty name="alu" property="nombre" scope="page">
								<td><bean:write name="alu" property="nombre" /></td>
								<td><bean:write name="alu" property="apellidos" /></td>
								<td><bean:write name="alu" property="edad" /></td>
								<td><bean:write name="alu" property="nota" /></td>
							</logic:notEmpty>
						</tr>	
						
						<logic:empty name="alu" property="nombre"  scope="page">
								No hay alumnos				
						</logic:empty>
  					</logic:iterate>
				</tbody>
			</table>
		<hr>
		<a href = "Index.jsp">Volver al men� principal</a>
	</body>
</html>