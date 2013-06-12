<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="utf-8" />
		<link rel="stylesheet" href="<c:url value='/css/index.css'/>" />
		<title></title>
	</head>
	<body>		

		<table class="login" border="0" bordercolor="#000000">
			<tr>
				<td colspan="2" align="center"><p>GEEKTIC</p></td>
			</tr>
			<tr>
				<td align="center"><p>login</p></td>
				<td align="center"><INPUT type=text name="identifiant"></td>
			</tr>
			<tr>
				<td align="center"><p>mot de passe</p></td>
				<td align="center"><INPUT type=password name="mdp"></td>
			</tr>
			<tr>
				
					
				
				<td align="right" colspan="2">
					<input type="button" value="Inscription">
					<input type="submit" value="Connexion">
				</td>
			</tr>
		</table>		
			 
	</body>
		
	
</html>