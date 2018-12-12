<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>FreeBoard2_KBM</title>
    <link href="http://fonts.googleapis.com/css?family=Raleway:400,200,500,600,700,800,300" rel="stylesheet" />
<link href="resources/default.css?" rel="stylesheet" type="text/css" media="all" />
<link href="resources/fonts.css" rel="stylesheet" type="text/css" media="all" />

    <style>
         body {
            background-color: black;
            color: white;
        } 
        table {
            margin: auto;
            align-content: center;
            width : 60%;
            border : 2px solid #bcbcbc;
        }
        tr {
            border-color: gray;
        }
        table, th, td {
            text-align: center;
        }
        td {
            table-layout: auto;
        }
        button {
            all: unset;
            background-color: rgba(110, 110, 110, 0.904);
            color: white;
            padding: 5px 20px;
            border-radius: 5px;
            cursor: pointer;
        }
/*         a {
        	color:white;
        	text-decoration: none;
        } */
 		ul li a:hover, ul li a:focus {   
             color:#fff;   
             border:1px solid #f40;   
             background-color:#f40;   
         }   
        a:link    { color: white; text-decoration: none;}
        a:visited { color: orange; text-decoration: none;}
        a:hover   { color: blue; text-decoration: none;}

    </style>
</head>
<body>
<jsp:include page="include1.jsp"/>
    <div class="allboard">
    <table frame="hsides" rules="rows">
        <caption style="color:white;"><h1>FreeBoard2</h1></caption> 
        <thead frame="below">
            <tr>                
                <th>번호</th>   
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
                <th>조회수</th>
            </tr>
        </thead>
        <tbody>
		<br>
            <c:forEach items="${freeBoard2}" var="freeBoard2">
                <tr>
                    <td>${freeBoard2.no}</td>
                    <td><a href="view2?no=${freeBoard2.no}" color="white">${freeBoard2.title}</a></td>
                    <td>${freeBoard2.writer}</td>
                    <td><fmt:formatDate value="${freeBoard2.write_Date}" pattern="yyyy-MM-dd"/></td>
                    <td>${freeBoard2.hit}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
		<hr>
		<div align="center">
			<button id="towrite"><a href="writeForm2" type="button">글쓰기</a></button>
			<button id="tohome">	<a href="home" type="button">홈으로</a></button></br>
		</div>
	</div>
</body>
</html>