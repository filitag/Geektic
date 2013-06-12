<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des Geeks</title>
</head>
<body>
	<table>
		<c:forEach var="geek" items="${listeGeek}">
			<tr>
				<td>ID : ${geek.id}</td>
				<td>PSEUDO : ${geek.pseudo}</td>
				<td>AGE : ${geek.age}</td>
				<td>HOBBIES : ${geek.hobbie}</td>
			</tr>	
		</c:forEach>
	</table>
	
	
</body>
</html>