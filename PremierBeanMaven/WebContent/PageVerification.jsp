<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body BGCOLOR="#FDF5E6">


	<H1 ALIGN=CENTER>Vérification</H1>

	<jsp:useBean id="util" class="model.Utilisateur" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="util" />

	<label> Nom : </label><jsp:getProperty property="nom" name="util" /><br>
	<label> Prenom : </label><jsp:getProperty property="prenom" name="util" /><br>
	<label> Login : </label><jsp:getProperty property="login" name="util" /><br>
	<label>Mot de passe : </label><jsp:getProperty property="mdp" name="util" /><br>


	<form method="post" action="ControleurMaven?page=2">
		<input type='submit' value='Corriger'>
		</form>
		<form method="post" action="ControleurMaven?page=4">
			<input type='submit' value='Envoyer'>
		</form>
</body>
</html>