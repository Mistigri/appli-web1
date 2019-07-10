<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Enregistrement</h1>
<p>Quel est votre nom ?</p>
<form action="/SeptiemeServlet.php">
  Nom :<br>
  <input type="text" name="name">
  <br>
  Quel est votre mot de passe ?<br>
  <input type="password" name="password">
  <br><br>
  <input type="submit" value="Soumettre la requête">
</form> 

</body>
</html>