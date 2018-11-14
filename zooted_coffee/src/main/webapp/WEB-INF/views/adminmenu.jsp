<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Admin Menu</title>
</head>
<body>
<h1>Admin Menu Landing</h1>

<div class = "container">
<table>
<tr>
<th>Item</th>  <th>Category</th> <th>Description</th> <th> Price</th>
</tr>

<c:forEach var="menuitem" items="${zootedmenu }">
<!-- items come from controller and var only exist in the table -->
<tr>
<td>${menuitem.name }</td>
<td>${menuitem.category }</td>
<td>${menuitem.description }</td>
<td> ${ menuitem.price } </td>

</tr>
</c:forEach>
</table>
</div>


<a href="/admin/menu"> Admin Menu</a> <br>
<p> insert text</p>
</body>
</html>