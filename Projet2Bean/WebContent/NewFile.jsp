<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>

	<x:parse var="parsedDoc">
		<stock> <produit id="01"> <nom>PC</nom> <quantite>3</quantite>
		<min>10</min> <commande>10</commande> </produit> 236 <produit id="02">
		<nom>Mac</nom> <quantite>5</quantite> <min>10</min> <commande>5</commande>
		</produit> </stock>
	</x:parse>
	
	<!--Afficher la quantité de PC en stock : -->
	<x:out select="$parsedDoc/stock/produit[nom='PC']/quantite" />
	<!--Afficher un message si la quantité de PC est inférieur au minimum : -->
	<x:if select="$parsedDoc/stock/produit[nom='PC'][quantite<min]">
	Il faut commander des PCs !!!!!
	</x:if>

</body>
</html>