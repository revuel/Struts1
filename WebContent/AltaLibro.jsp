<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!-- Strut Tags & dependencies-->
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %> <!-- Estas etiquetas tienen que estar en web-xml puestas -->
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Nuevo libro</title>
	</head>
	
	<body>
		<h2>Insertar un libro</h2>
		<hr>
		
		<html:form action="addLibro">
			
			<table>
				<thead>
					<tr>
						<td>Titulo</td>
						<td>Autor</td>
						<td>Isbn</td>
					</tr>
				</thead>
				<tbody>
					<!-- Estas propiedades son los nombres de los atributos del bean -->
					<tr>
						<td>
							<html:text property="titulo"></html:text>
						</td>
						<td>
							<html:text property="autor"></html:text>
						</td>
						<td>
							<html:text property="isbn"></html:text>
						</td>
					</tr>
				</tbody>
			</table>
			<br>
			<html:submit value="Agregar"></html:submit>
		</html:form>
		<hr>
		<a href = "Index.jsp">Volver al menú principal</a>
	</body>
</html>