<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>BOOK SEARCH</h2>

<form action="searchbook.jlc">

<table border="1">
<tr>
<td colspan="2" align="center">select category</td>

</tr>
<tr><td>select name</td><td> <select name="category">
<option value="select" >SELECT</option>
<option value="java">java</option>
<option value="testing">TESTING</option>
<option value=".NET">.NET</option>

</select> </td></tr>

<tr><td colspan="2" align="center"> <input type="submit" value="searchbooks"/> </td></tr>

</table>

</form>




</body>
</html>