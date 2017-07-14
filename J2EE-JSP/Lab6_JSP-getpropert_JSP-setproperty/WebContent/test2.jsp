<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">




<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="com.jlcindia.Student" %>
<hr/>

<jsp:useBean id="ST" class="com.jlcindia.Student" scope="session">
</jsp:useBean>

<jsp:setProperty property="sid" name="ST" value="88"/>
<jsp:setProperty property="name" name="ST" value="nivas"/>
<jsp:setProperty property="phone" name="ST" value="31234"/>
<br/>

sid: <jsp:getProperty property="sid" name="ST"/><br/>
NAme:<jsp:getProperty property="name" name="ST"/><br/>
phone: <jsp:getProperty property="phone" name="ST"/>



</body>
</html>