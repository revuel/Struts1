<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!-- Strut Tags & dependencies-->
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %> <!-- Estas etiquetas tienen que estar en web-xml puestas -->
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>  
    
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Superan la nota de corte</title>
	</head>
	<body>
		<h2>Listado de alumnos por encima de la nota de corte</h2>
			<p>Aquellos que superan la nota de corte</p>
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
						<logic:iterate name="alumninotacorte" id="alunc" scope="session" >
						<!-- Debe existir alumni en sesión, creado en AddAlumnoAction -->
							<tr>
								<logic:notEmpty name="alunc" property="nombre" scope="page">
									<td><bean:write name="alunc" property="nombre" /></td>
									<td><bean:write name="alunc" property="apellidos" /></td>
									<td><bean:write name="alunc" property="edad" /></td>
									<td><bean:write name="alunc" property="nota" /></td>
								</logic:notEmpty>
							</tr>	
							
							<logic:empty name="alunc" property="nombre"  scope="page">
									Nadie supera la nota de corte			
							</logic:empty>
	  					</logic:iterate>
					</tbody>
				</table>
			<hr>
			<a href = "Index.jsp">Volver al menú principal</a>
	</body>
</html>