<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
<div class = "container">
<h1>Zooted Menu</h1>

<!-- User Menu -->

<form>
<input name="category" placeholder="Category"/>
<button>Filter</button>

</form>

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

<a href="/item/create"> Item Create</a>
<p></p>

</body>
</html>