<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>freeboard1</title>
<link
	href="http://fonts.googleapis.com/css?family=Raleway:400,200,500,600,700,800,300"
	rel="stylesheet" />
<link href="resources/default.css?" rel="stylesheet" type="text/css"
	media="all" />
<link href="resources/fonts.css" rel="stylesheet" type="text/css"
	media="all" />

<style>
table {
	border-collapse: collapse;
	width: 100%;
	
}

th, td{
	border: 1px solid #dddddd;
	text-align: center;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2
}


button{ 
    color: white;
    padding : 5px 25px;
    align-contents: left;
   
}

a { text-decoration:none;

}


</style>

</head>
<body>
	<jsp:include page="include1.jsp" />

   <h1>자유게시판1</h1>

	<table >
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성날짜</td>
			<td>조회수</td>
		</tr>
		<tr>
			<c:forEach items="${list}" var="info">
				<tr>
					<td>${info.no}</td>
					<td><a href="freeBoardView1?no=${info.no}">${info.title}</a></td>
					<td>${info.writer}</td>
					<td><fmt:formatDate value="${info.write_date}"
							pattern="yyyy-MM-dd HH:mm:ss" /></td>
					<td>${info.hit}</td>

				</tr>
			</c:forEach>
	</table>
	<form action="freeBoard1Writer">
		<button align="left"  style="color: black;">글작성</button>
	</form>

    
	<form action="freeBoardSearch1" align="center">
		<select name="searchOption">
			<option value="title">제목</option>
			<option value="all">제목+내용</option>
			<option value="writer">작성자</option>

		</select> <input type="text" name="keyword" value="" size="30"
			placeholder="검색어를 입력하세요."> <input type="submit" value="검색">

	</form>
    

</body>
</html>