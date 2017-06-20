<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
  
  body {
     background-image="backimg.jpg"
      font: 400 15px Lato, sans-serif;
      line-height: 1.8;
      color: orange;
  }
  h3 {
      font-size: 24px;
      text-transform: uppercase;
      color: #303030;
      font-weight: 600;
      margin-bottom: 30px;
  }
  p{
      font-size: 19px;
      line-height: 1.375em;
      color: #303030;
      font-weight: 400;
      margin-bottom: 30px;
  }</style>
<title>Pubhub200</title>
</head>
<body>
<div class="jumbotron text-center"color="orange">
  <h1>Pubhub200</h1>
  <p>A website for Authors and Readers alike</p> 
</div>
  
<div class="container" align="center" >
  <div class="row" align="center">
    <div class="col-sm-4" >
      <h3>LOGIN!!!</h3>
      <p>Sign in to track your order</p>
     <a href="../users/login">Login!!</a>
    </div>
    <div class="col-sm-4">
      <h3>Register</h3>
      <p>Sign up to view the avaiable books</p>
     <a href="../users/register">Register for new user</a>
    </div>
    <div class="col-sm-4">
    <img src="/pubhub/src/main/resources/images/backimg.jpg" class="img-rounded" alt="Icon" width="304" height="236"></div>
   </div>
</div>


</body>
</html>