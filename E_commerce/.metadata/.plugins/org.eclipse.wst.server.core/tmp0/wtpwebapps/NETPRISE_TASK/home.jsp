<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>

<HTML>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME TO THE PRODUCTS LIST</title>
</head>

<BODY BGCOLOR=#FFFFFF>
<B><I>NETPRISE: Ecommerce Platform</I></B> 




<pre><font color="red" size="4">

Welcome ${UN}
</font></pre>


 <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/NETPRISE"
        user="root" password="root"
    />
    
    <sql:query var="listproduct"   dataSource="${myDS}">
        SELECT pid,product_name FROM products;
    </sql:query>
    
<div align="center">
<font color="green" size="3"> ${ADDED}</font>
<%Object obj=request.getAttribute("MSG"); 
if(obj!=null){
%>

<br/><center> <font color="red" size="3"><%=obj%></font>
<br/> <a href="home.jsp">Add product again</a></center>

<% 
}

%>
        <table border="1" cellpadding="5">
            <caption><h2> LIST OF PRODUCTS</h2></caption>
            <tr>
                <th>product id</th>
                <th>product name</th>
                <th>action</th>
          
          </tr>
            <c:forEach var="product" items="${listproduct.rows}">
                <tr>
                    <td><c:out value="${product.pid}" /></td>
                    <td><c:out value="${product.product_name}" /></td>
                    <td>
                    
                    <form action="addtocart.net">
                    <input type="hidden" name="pname" value="${product.product_name}">
                    <input type="submit" value="ADD TO CART">
                    </form>
                  
                    
                    </td>
                    
                    
                   
                </tr>
            </c:forEach>
            
            
        </table>
       <form action="showcart.net"> 
       
       <input type="submit" value="SHOW CART">
        </form>
    </div>    
    





</BODY>
</HTML>