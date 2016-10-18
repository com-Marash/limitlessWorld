<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Welcome to Limit-less World</title>
    </head>
    <body>
       	<form method="POST" action="${contextPath}/login" class="form-signin">
       		<h2 class="form-heading">Log in</h2>

        	<div>
            	<span>${message}</span>
            	<input name="username" type="text" placeholder="Username" />
            	<input name="password" type="password" placeholder="Password"/>
            	<span>${error}</span>
            	<button type="submit">Log In</button>
        	</div>
		</form>
    </body>
</html>