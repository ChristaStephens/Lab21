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

<a href="/menu"> Zooted Menu</a>

	<h1>Here is the landing for User Registration</h1>

	<p>Please fill out the form below for our yearly free birthday
		coffee:</p>

	<!-- action is where the page takes us, usually the final page -->


	<form action="/summary" method="post">

		<!-- Mr. Ms. Doctor Miss change our the below radio buttons between the p tags -->

		<p>
			Salutation: <br> <input type="radio" name="sal" value="Mr."> Mr. 
			<input type="radio" name="sal" value="Mrs."> Mrs.
			<input type="radio" name="sal" value="Miss"> Miss
			<input type="radio" name="sal" value="Ms."> Ms.
			<input type="radio" name="sal" value="Dr."> Dr.


		</p>



		<p>
			Enter your first name: <br> <input name="name" pattern="[a-zA-Z]*" />
		</p>

			Enter your last name: <br> <input name="last" pattern="[a-zA-Z]*" />
		<p>
			Enter your birthdate: <br> <input type="date" name="bday"
				min="1939-12-31" max="2005-12-31" />
		</p>

		<p>
			Favorite drink? <br> 
			<input type="radio" name="coffee"value="Hot Chocolate"> Hot Chocolate<br>
		 	<input type="radio" name="coffee" value="Chai Latte"> Chai Latte<br>
			<input type="radio" name="coffee" value="Light Roast"> Light Roast<br>


		</p>

		<p>
			Enter your email to receive a coupon for your free birthday drink: <br>
			<input type="email" name="email">
		</p>

		Would you like to receive future email updates from Zooted? <br>
		<input type="checkbox" name="updates" value="updates"> Yes, sign me up!<br>

		<p>
			<button>Submit</button>
			
			
			<button type="submit" class="btn btn-primary" href="/item/create">Add</button>
		<a class="btn link" href="/menu">Cancel</a>
		</p>

	</form>

</body>
</html>