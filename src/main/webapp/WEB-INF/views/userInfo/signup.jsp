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

	<div id="join_section">
		<form action="signup">
			<h2>회원가입</h2><br>
			<span style="display:inline-block; width:100px; text-align:right;">id: </span>
			<input type="text" id="id" name="id" value="" style="display:inline-block; width:200px;">
            <div class="iderr" id="notinput" style="display:none;">아이디를 입력해 주세요.</div>
            <div class="iderr" id="lesslength" style="display:none;">아이디는 최소 2글자 이상만 가능합니다.</div>
            <div class="iderr" id="overlength" style="display:none;">아이디는 최대 10글자 이하만 가능합니다.</div>
            <div class="iderr" id="" style="display:none;">아이디를 입력해 주세요.</div>

			<br>
			<span style="display:inline-block; width:100px; text-align:right;">password: </span>
			<input type="password" id="password" name="password" value="" style="display:inline-block; width:200px;">
			<input type="hidden" name="passworderr" value="" style="display:inline-block; width:200px;">
			<br>
			<span style="display:inline-block; width:100px; text-align:right;">이름: </span>
			<input type="text" id="name" name="name" value="" style="display:inline-block; width:200px;">
			<input type="hidden" name="nameerr" value="" style="display:inline-block; width:200px;">
			<br>
			<span style="display:inline-block; width:100px; text-align:right;">핸드폰 번호: </span>
			<input type="text" id="phonenum" name="phoneNum" value="" style="display:inline-block; width:200px;">
			<br>
			<span style="display:inline-block; width:100px; text-align:right;">이메일: </span>
			<input type="text" id="email" name="email" value="" style="display:inline-block; width:200px;">
			<input type="hidden" name="emailerr" value="" style="display:inline-block; width:200px;">
			<br>
			<br>
			<input type=submit value='회원가입'>
		</form>
	</div>
	
</body>
</html>