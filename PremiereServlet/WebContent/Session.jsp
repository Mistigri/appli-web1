<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Bonjour <%=session.getAttribute("nom") %></p>
<form method = "POST" action="CtLivre"> Quel est son titre :<br>
<input type="text" name="bookTitle"><br> "Quelle est sa catégorie ?<br>
<input type="text" name="category" > <br><br>
<input type="submit" value="Valider"></form>
</body>
</html>