<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
<!--Logiques sur des booléens -->
${ true && true } <br /> <!--Affiche true -->
${ true && false } <br /> <!--Affiche false -->
${ true || false } <br /> <!--Affiche true (warning dans le code source -->
${ !true || false } <br /> <!--Affiche false -->

<!--Calculs arithmétiques -->
${ 10 / 4 } <br /> <!--Affiche 2.5 -->
${ 10 mod 4 } <br /> <!--Affiche le reste de la division entière, soit 2 -->
${ 10 % 4 } <br /> <!--Affiche le reste de la division entière, soit 2 -->
${ 8 * 8 } <br /> <!--Affiche 64 -->
${ 64 -8 } <br /> <!--Affiche 56 -->
${ 10 / -8 } <br /> <!--Affiche -1.25 -->
${ 8 / 0 } <br /> <!--Affiche Infinity -->
<!--Compare les caractères 'x' et 'y'. Le caractère 'x' étant bien situé avant le caractère 'y' dans l'alphabet ASCII, cette EL affiche true. -->
${ 'x' < 'y' } <br />
<!--Compare les chaînes 'titi' et 'toto'. 'i' < 'o', cette EL affiche false. -->
${ 'titi' gt 'toto' } <br />
<!--Compare le résultat d'un calcul à une valeur fixe. Ici, 5 x 7 vaut 35 et non pas 40, le résultat est false. -->
${ 5 * 7 == 40 } <br />
${ empty 'toto' } <!--La chaîne testée n'est pas vide, le résultat est false -->
${ empty '' } <!--La chaîne testée est vide, le résultat est true -->
</p>



</body>
</html>