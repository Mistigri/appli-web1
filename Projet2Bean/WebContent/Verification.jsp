<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="u" class="com.gk.model.Users" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="u" />
	<h3>Vous avez saisi :</h3>
	<form action="SaveServlet">
		Prénom :<jsp:getProperty property="prenom" name="u" /><br> <br>
		Nom :<jsp:getProperty property="nom" name="u" /><br> <br>
		Pseudo :<jsp:getProperty property="pseudo" name="u" /><br> <br>
		Mot de passe :<jsp:getProperty property="password" name="u" /><br><br>
		Adresse :<jsp:getProperty property="adresse" name="u" /><br> <br>
		Téléphone :<jsp:getProperty property="telephone" name="u" /><br> <br>
		<br> <input type="button" value="Corriger"
			onclick="window.location.href='Inscription.jsp'"> <input
			type="submit" value="Valider">
	</form>

</body>
</html>