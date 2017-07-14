<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ST2" class="com.jlcindia.Student" />
<jsp:setProperty property="sid" name="ST3"/>
<jsp:setProperty property="phone" name="ST3" param="studphone"/>
<hr/>

sid:<jsp:getProperty property="sid" name="ST3"/>
<br/>
phone
<jsp:getProperty property="phone" name="ST3"/>
</h1>
</body>
</html>