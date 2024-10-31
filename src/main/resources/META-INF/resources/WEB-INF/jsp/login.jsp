<html>
	<head>
		<title>Login Page</title>
	</head>
	<body>
		<div class="container">
			 <h1>Hi Welcome to login page!</h1> 
			 
			 <pre>${errormessage}</pre>
			 <form method="post">
			 	Name: <input type="text" name="name" value="${name}">
			 	Password: <input type="password" name="password">
			 	<input type="submit">
			 </form>
		 </div>
	</body>
</html>