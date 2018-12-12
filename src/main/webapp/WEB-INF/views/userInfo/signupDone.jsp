<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="http://fonts.googleapis.com/css?family=Raleway:400,200,500,600,700,800,300"
	rel="stylesheet" />
<link href="resources/default.css?" rel="stylesheet" type="text/css"
	media="all" />
<link href="resources/fonts.css" rel="stylesheet" type="text/css"
	media="all" />
	<style>
		#join_section {
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
        #logout{
        	float: right;
        }
        #nickname{
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
        .btn {
            border: none;
            background-color: inherit;
            padding: 14px 28px;
            font-size: 16px;
            cursor: pointer;
            display: inline-block;
            text-decoration: none;
            color: black;
        }
        
        .btn:hover {background: #eee;}
        #ButtonSection {
			display:flex;
			text-align:center;
			vertical-align:middle;
		  	align-items:center;
		  	justify-content:center;
		  	top:0;right:0;bottom:0;left:0;
            text-decoration: none;
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
      
    <br>
    <br>
    <div id="info_section">
	    <div style="display:block; width:100%; text-align:center;">회원가입이 완료되었습니다.</div>
    </div>
    <br>
    <div id="ButtonSection">
       <a href="login" type="button" class="btn">로그인</a>
    </div>
</body>
</html>