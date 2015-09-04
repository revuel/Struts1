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
		<p>Esto no aparece explícitamente en el enunciado</p>
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
					<logic:iterate name="libritos" id="li" scope="session" >
					<!-- Debe existir alumni en sesión, creado en AddAlumnoAction -->
						<tr>
							<logic:notEmpty name="li" property="titulo" scope="page">
								<td><bean:write name="li" property="titulo" /></td>
								<td><bean:write name="li" property="autor" /></td>
								<td><bean:write name="li" property="isbn" /></td>
							</logic:notEmpty>
						</tr>	
						
						<logic:empty name="libritos" property="titulo"  scope="page">
								No hay alumnos				
						</logic:empty>
  					</logic:iterate>
				</tbody>
			</table>
		<hr>
		<a href = "Index.jsp">Volver al menú principal</a>
	</body>
</html>