<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!-- Strut Tags & dependencies-->
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %> <!-- Estas etiquetas tienen que estar en web-xml puestas -->
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>  

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Nota media</title>
	</head>
	
	<body>
		<h2>Nota media</h2>
		<p>Para el rango de edad establecido anteriormente</p>
		<hr>
			<bean:write name="avgnota"></bean:write>
		<hr>
		<a href = "Index.jsp">Volver al menú principal</a>
	</body>
</html>