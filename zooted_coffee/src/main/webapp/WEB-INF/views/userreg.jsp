<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">


<title>User Registration</title>
</head>
<body>

<h1>Here is the landing for User Registration</h1>

<p> Please fill out the form below for our yearly free birthday coffee:</p>

<!-- action is where the page takes us, usually the final page -->


<form action="/summary_page.php" method="post">

<p>Enter your name: <input name = "name" /> </p>

<p>Enter your birthdate: <input type="date" name="bday" max="1939-12-31"/></p>

<p>Favorite drink?
<br>
  <input type="radio" name="coffee" value="Hot Chocolate" > Hot Chocolate<br>
  <input type="radio" name="coffee" value="Chai Latte"> Chai Latte<br>
  <input type="radio" name="coffee" value="Light Roast"> Light Roast<br>


  </p>

<p>Enter your email to receive a coupon for your free birthday coffee:
<br>
<input type="email" name="email"></p>

<p> <button>Submit</button> </p>

</form>

</body>
</html>