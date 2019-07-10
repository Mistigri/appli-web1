<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body BGCOLOR="#FDF5E6">

	<jsp:useBean id="util" class="model.Utilisateur" scope="session"></jsp:useBean>

	<H1 ALIGN=CENTER>Inscription</H1>

	<form method="post" action="ControleurMaven?page=3">
		<label> Nom </label> <input type="text" name="nom" id="nom" value="<jsp:getProperty property='nom' name='util' />"><br>
		<label> Prenom </label> <input type="text" name="prenom" id="prenom" value="<jsp:getProperty property='prenom' name='util' />"><br>
		<label> Login </label> <input type="text" name="login" id="login" value="<jsp:getProperty property='login' name='util' />"><br>
		<label>Mot de passe </label> <input type='text' name='mdp' id='mdp' value="<jsp:getProperty property='mdp' name='util' />"><br>
		<input type='submit' value='Envoyer'>
	</form>
</body>
</html>