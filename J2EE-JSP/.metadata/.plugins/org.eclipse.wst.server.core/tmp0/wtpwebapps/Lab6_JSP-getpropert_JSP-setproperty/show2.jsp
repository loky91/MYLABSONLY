<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<jsp:useBean id="ST1" class="com.jlcindia.Student">
<jsp:setProperty property="sid" name="ST1"/>
<hr/>
<h1>
sid:
<jsp:getProperty property="sid" name="ST1"/>
<br/>Name:
<jsp:getProperty property="name" name="ST1"/>
<br/>Phone
<jsp:getProperty property="phone" name="ST1"/>
</jsp:useBean>

</body>
</html>