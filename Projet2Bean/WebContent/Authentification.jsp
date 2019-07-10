<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<fmt:setLocale value="${sessionScope.lang }"/>
<fmt:setBundle basename="ressouces/messages"/>
	<a href="Change?lang=fr"><img src="images/fr_flag.png" width=100px style="height : 50px; width : 50px;"></a>
	<a href="Change?lang=en"><img src="images/en_flag.png" width=100px  style="width : 50px; height : 50px;"></a>
	<h1><fmt:message key="label.authentification"></fmt:message>  </h1>
	<form action="Controler" method="post">
	<input type="hidden" name="page" value="1">
	<fmt:message key="label.pseudo"></fmt:message> :
	<br>
	<input type="text" name="pseudo">
	<br>
	<br> <fmt:message key="label.password"></fmt:message> :
	<br>
	<input type="text" name="password">
	<br>
	<br>
	<input type="submit" value="Valider">
	<input type="button" value="S'inscrire"
			onclick="window.location.href='Controler?page=2'">
			</form>
</body>
</html>