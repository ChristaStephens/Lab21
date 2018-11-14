<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>

<h1>Zooted Cart</h1>
<p>insert text</p>

<c:forEach var="cartitem" items="${cartItem }">
<!-- items come from controller and var only exist in the table -->


${cartitem.quantity }
${cartitem.menuItem.name}
${cartitem.menuItem.price} 

</c:forEach>

</body>
</html>