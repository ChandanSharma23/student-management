<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="login" style="display: block">
<h3>login form</h3>
 <form action= method="post">
   
    <br/>Username:<input type="text" name="username">
     <br/>Password:<input type="password" name="password">
      <br/>roll_no:<input type="number" name="rollNo"> 
       <br/>DOB:<input type="text" name="dob"> 
       
     <br/><input type="submit" value="Login">
  </form>
<button onclick="showSignUp()">Sign up</button>
</div>
<div id="signup"  style="display: none">
<h3>Create New Account</h3>
 <form action= method="post">
   
    <br/>Username:<input type="text" name="username">
     <br/>Password:<input type="password" name="password">
      <br/>roll_no:<input type="number" name="rollNo"> 
       <br/>DOB:<input type="text" name="dob"> 
       
  
     <br/><input type="submit" value="Sign Up"> </form>
<button onclick="showlogin()">already registered? login here</button>
</div>
<script type="text/javascript">
var button = document.getElementById('login'); // Assumes element with id='button'

 function showSignUp() {
    var div = document.getElementById('login');
    var div2 = document.getElementById('signup');
        div.style.display = 'none';
    	div2.style.display = 'block'; 
};

function showlogin() {
    var div = document.getElementById('login');
    var div2 = document.getElementById('signup');
        div.style.display = 'block';
    	div2.style.display = 'none'; 
};
</script>
</body>
</html>