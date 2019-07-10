<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Liste des utilisateurs</h1>

<p>${courant.pseudo }</p>

<div>
	<table class="table">
		<thead>
			<tr>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Pseudo</th>
				<th>Mot de passe</th>
				<th>Adresse</th>
				<th>Téléphone</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="utilisateur" items="${listeUtilisateurs}">
				<tr>
					<td>${utilisateur.nom }</td>
					<td>${utilisateur.prenom }</td>
					<td>${utilisateur.pseudo }</td>
					<td>${utilisateur.password }</td>
					<td>${utilisateur.adresse }</td>
					<td>${utilisateur.telephone }</td>
				</tr>
		
			</c:forEach>
		</tbody>
	</table>
</div>



</body>
</html>