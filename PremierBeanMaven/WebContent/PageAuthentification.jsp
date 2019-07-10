<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body BGCOLOR="#FDF5E6">
<c:if test="${not empty sessionScope.authError }">
Erreur d'authentification - ressayez
</c:if>
	<H1 ALIGN=CENTER>Authentification</H1>

	<form method="post" action="ControleurMaven?page=1">
		<label> Login </label> <input type="text" name="login" id="login"><br>
		<label>Mot de passe </label> <input type='text' name='mdp' id='mdp' ><br>
		<input type='submit' value='Valider'>
	</form>
	<form method="post" action="ControleurMaven?page=2">
	<input type='submit' value='Inscription'>
	</form>
</body>
</body>
</html>