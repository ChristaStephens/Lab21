<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" href="/style.css" />


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Admin Menu Item Add -->
<h1>Add item</h1>



<div class="container">
		<h2>Menu Items </h2>
		<h3>Add a Item</h3>
		<form action="/item/added" method="post">
		<table class="table">
			<tr>
				<th scope="row">Name</th>
				<td><input type="text" name="name" autofocus/></td>
			</tr>
			<tr>
				<th scope="row">Category</th>
				<td><input type="text" name="category" /></td>
			</tr>
			<tr>
				<th scope="row">Description</th>
				<td><input type="text" name="description" autofocus/></td>
				</tr>
				<tr>
				<th scope="row">Price</th>
				<td><input type="text" name="price" autofocus/></td>
				</tr>
				
				
			</tr>
		</table>
		<button type="submit" class="btn btn-primary" href="/item/create">Add</button>
		<a class="btn link" href="/menu">Cancel</a>
		</form>
	</div>


<a href="/admin/menu"> Admin Menu</a>

</body>
</html>