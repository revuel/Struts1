<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!-- Strut Tags & dependencies-->
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %> <!-- Estas etiquetas tienen que estar en web-xml puestas -->
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>  

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Establecer rango de edad</title>
	</head>
	<body>
		<h2>Elegir nota de corte</h2>
		<hr>
			
		<html:form action="setRango">
			<table>
				<thead>
					<tr>
						<th>Edad mínima</th>
						<th>Edad máxima</th>
					</tr>
				</thead>
				<tbody>
					<!-- Estas propiedades son los nombres de los atributos del bean -->
					<tr>
						<td>
							<html:select property="min">
								<html:option value="0">0</html:option>
								<html:option value="10">10</html:option>
								<html:option value="20">20</html:option>
								<html:option value="30">30</html:option>
								<html:option value="40">40</html:option>
								<html:option value="50">50</html:option>
								<html:option value="60">60</html:option>
								<html:option value="70">70</html:option>
								<html:option value="60">80</html:option>
								<html:option value="70">90</html:option>
							</html:select>
						</td>
						<td>
							<html:select property="max">
								<html:option value="10">10</html:option>
								<html:option value="20">20</html:option>
								<html:option value="30">30</html:option>
								<html:option value="40">40</html:option>
								<html:option value="50">50</html:option>
								<html:option value="60">60</html:option>
								<html:option value="70">70</html:option>
								<html:option value="60">80</html:option>
								<html:option value="70">90</html:option>
								<html:option value="60">100</html:option>
							</html:select>
						</td>
					</tr>
				</tbody>
			</table>
			<br>
			<html:submit value="Determinar"></html:submit>
		</html:form>
		<hr>
		<a href = "Index.jsp">Volver al menú principal</a>
	</body>
</html>