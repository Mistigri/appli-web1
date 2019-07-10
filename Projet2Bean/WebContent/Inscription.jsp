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
	<form action="Verification.jsp">
		Prénom:<br>
		<input type="text" name="prenom" value="<jsp:getProperty property="prenom" name="u"/>"><br>
		Nom:<br>
		<input type="text" name="nom" value="<jsp:getProperty property="nom" name="u"/>"><br><br>
		Pseudo :<br>
		<input type="text" name="pseudo" value="<jsp:getProperty property="pseudo" name="u"/>"><br><br>
		Mot de passe :<br>
		<input type="text" name="password" value="<jsp:getProperty property="password" name="u" />"><br><br>
		Adresse :<br>
		<input type="text" name="adresse" value="<jsp:getProperty property="adresse" name="u"/>"><br><br>
		Téléphone :<br>
		<input type="text" name="telephone" value="<jsp:getProperty property="telephone" name="u"/>"><br><br>
		<input type="submit" value="Valider">
	</form>
</body>
</html>