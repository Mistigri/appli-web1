<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<BODY> <H2>JSP Expressions</H2>
<UL>
<LI>Current time: <%= new java.util.Date() %>
<LI>Your hostname: <%= request.getRemoteHost() %>
<LI>Your session ID:<%= session.getId() %>
<LI>The <CODE>testParam</CODE>
form parameter:<%= request.getParameter("testParam") %>
</UL>
</BODY>
</body>
</html>