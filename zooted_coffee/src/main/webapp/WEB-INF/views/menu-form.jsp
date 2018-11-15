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

<h1>Add item</h1>

	<form action="/item/create" method="post">
		<input type="hidden" name="id" value="${zootedmenu.id}" />
		<div class="form-group">
			<label for="name">Name</label> <input class="form-control" id="name"
				name="name" value="${menu.name}" required minlength="2"
				autocomplete="off">
		</div>
		<div class="form-group">
			<label for="category">Category</label> <input class="form-control"
				id="category" name="category" value="${menu.category}" required>
		</div>

		<div class="form-group">
			<label for="description">Description</label> <input
				class="form-control" id="description" name="description"
				value="${menu.description}" required minlength="3">
		</div>
		
		
		<div class="form-group">
			<label for="price">Price</label> <input
				class="form-control" id="price" name="price"
				value="${menu.price}" required minlength="3">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		<a href="/menu" class="btn btn-link">Cancel</a>
	</form>






<div class="container">
		<h2>Menu Items </h2>
		<h3>Add a Item</h3>
		<form action="/item/create" method="post">
		<table class="table">
			<tr>
				<th scope="row">Name</th>
				<td><input type="text" name="name" autofocus/></td>
			</tr>
			<tr>
				<th scope="row">Category</th>
				<td><input type="text" name="capacity" /></td>
			</tr>
			<tr>
				<th scope="row">Description</th>
				<td><input type="text" name="name" autofocus/></td>
				
				<th scope="row">Price</th>
				<td><input type="text" name="name" autofocus/></td>
				
				
				
			</tr>
		</table>
		<button type="submit" class="btn btn-primary" href="/item/create">Add</button>
		<a class="btn link" href="/menu">Cancel</a>
		</form>
	</div>






<a href="/menu">
</body>
</html>