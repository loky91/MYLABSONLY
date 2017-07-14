<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td>
Student NAme
</td>
<td>
 ${param.sname} 
</td>
</tr>

<tr>
<td>
Primary Email
</td>
<td>
 ${paramValues.email[0]} 
</td>
</tr>


<tr>
<td>
Secondary email
</td>
<td>
 ${paramValues.email[1]} 
</td>
</tr>


<tr>
<td>
Host
</td>
<td>
 ${header.host} 
</td>
</tr>

<tr>
<td>
Refere
</td>
<td>
 ${header.referer} 
</td>
</tr>

<tr>
<td>
Jsession Id Cookie
</td>
<td>
  ${cookie.JSESSIONID.value}
</td>
</tr>


<tr>
<td>
Cp state
</td>
<td>
 ${initParam.state} 
</td>
</tr>

<tr>
<td>
CP:city
</td>
<td>
 ${initParam.city} 
</td>
</tr>
</table>


</body>
</html>