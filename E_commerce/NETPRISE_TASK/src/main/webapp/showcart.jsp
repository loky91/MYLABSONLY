<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NETPRISE PRODUCT STORE</title>
</head>
<body>
<%Object obj=request.getAttribute("MSG"); 

if(obj!=null){

%>

<br/><center><font color="red" size="4"><%=obj%></font></center>
<%
}
else{
	
obj=request.getAttribute("CART");
ArrayList<String> plist=(ArrayList<String>)obj;
%>
<br/>
<br>
<center><i>  ITEMS IN YOUR CART </i> </center>
<hr>
<center>
<form action="removefromcart.net" method="post">
<table border="2">
<tr>
<th>product name</th>
<th>ACTION</th>
</tr>

<% 
for(String pnm:plist){

%>
<tr>
<td width="2">
<input type="hidden" name="p_name" value="<%=pnm%>"/>
<font size="4"><%=pnm%></font>
</td>
<td width="1%">
<center>
<input type="submit" value="Remove from Cart"/>
</center>
</td>
</tr>

<%

}
%>
</table>
</form>
<br/>
<center>



<form action="placeorder.net">
<%
for(String pnm:plist){
%>
<input type="hidden" name="pname" value="<%=pnm%>">
<%}
%>
<input type="submit" value="PLACE ORDER"/>
</form>
</center>
<%


}
%>


<center>
<a href="home.jsp">ADD PRODUCT:GO TO THE PRODUCT PAGE </a>
</center>
</center>
</body>
</html>