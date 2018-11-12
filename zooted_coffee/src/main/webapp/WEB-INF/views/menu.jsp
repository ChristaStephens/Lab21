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
<h1>Zooted Menu</h1>


<form>
<input name="category" placeholder="Category"/>
<button>Filter</button>

</form>

<table>
<tr>
<div class = "container">
<th>Item</th>  <th>Category</th> <th>Description</th> <th> Price</th>
</tr>

<c:forEach var="menuitem" items="${menuitem }">
<tr>
<td>${menuitem.name }</td>
<td>${menuitem.category }</td>
<td>${menuitem.description }</td>
<td> %{menuitem.price} </td>

</tr>
</c:forEach>
</table>
</div>


<p></p>

</body>
</html>