<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="http://fonts.googleapis.com/css?family=Raleway:400,200,500,600,700,800,300" rel="stylesheet" />
<link href="resources/default.css?" rel="stylesheet" type="text/css" media="all" />
<link href="resources/fonts.css" rel="stylesheet" type="text/css" media="all" />

	<style>
		#login_section {
			display:flex;
			text-align:center;
			vertical-align:middle;
		  	align-items:center;
		  	justify-content:center;
		  	top:0;right:0;bottom:0;left:0;
		}
		body {
		    margin: 0;
            font-family: generic-family;
		}
		.topnav {
		    overflow: hidden;
		    background-color: #333;
		}
		.topnav a {
		    float: left;
		    color: #f2f2f2;
		    text-align: center;
		    padding: 14px 16px;
		    text-decoration: none;
		    font-size: 17px;
		}
		#login{
		    float: right;
		}
		#join{
			float: right;
		}
		.topnav a:hover {
		    background-color: #ddd;
		    color: black;
		}
		.top {
		    overflow: hidden;
		    background-color: #333;
		}
		.input{
		    align-content: center;
		}
	</style>
</head>
<body>
<div id="wrapper">
   <div id="menu-wrapper">
      <div id="menu" class="container">
         <ul>
            <li class="current_page_item" ><a href="home" id ="menubar">Home</a></li>
            <li><a href="noticeBoard" id ="menubar">notice</a></li>
            <li><a href="freeBoard1" id ="menubar">FreeBoard1</a></li>
            <li><a href="freeBoard2" id ="menubar">FreeBoard2</a></li>
            <li><a href="freeBoard4" id ="menubar">FreeBoard3</a></li>
           	<li><a href="login" id ="menubar">Login</a>  </li>
           	<li><a href="signupForm" id ="menubar" style = color>SignUp</a> </li> 
         </ul>
      </div>
      </div>
      </div>
         <div id="header-wrapper">
      <div id="header" class="container">
         <div id="logo">
            <h1><a href="home">KKYYL Project</a></h1>
            <p>Design by YOON JONG HUN</p>
         </div>
      </div>
   </div>
      
      
    <br><br>
    <div id="login_section">
		<form action="login">
			<span style="display:inline-block; width:100px; text-align:right;">id:</span>
			<input type="text" name="id" value="" style="display:inline-block; width:100px;">
			<br>
			<span style="display:inline-block; width:100px; text-align:right;">password: </span>
			<input type="password" name="password" value="" style="display:inline-block; width:100px;">
			<br>
			<input type="checkbox" name="remembid" value="1">
			<span>아이디 기억</span>
			<br>
			<input type="hidden" name="frompage" value="">
			<input type=submit value='로그인'>
		</form>
	</div>
</body>
</html>