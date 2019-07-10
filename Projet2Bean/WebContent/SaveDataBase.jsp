<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver" url="${initParam['dbURL']}" user="${initParam['dbUser']}" password="${initParam['dbPass']}" />
<sql:update dataSource="${dbsource}" var="result">
insert into appliwebtest(name, lastname, address, phone) values (?,?,?,?)
<sql:param value="${u.nom }"></sql:param>
<sql:param value="${u.prenom }"></sql:param>
<sql:param value="${u.adresse }"></sql:param>
<sql:param value="${u.telephone }"></sql:param>
</sql:update>
<c:if test="${result>=1}">
<font size="5" color='green'> Congratulations ! Data inserted successfully.</font>
</c:if>
</body>
</html>