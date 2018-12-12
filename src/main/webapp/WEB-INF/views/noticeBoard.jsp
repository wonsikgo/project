<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link href="http://fonts.googleapis.com/css?family=Raleway:400,200,500,600,700,800,300" rel="stylesheet" />
<link href="resources/default.css?" rel="stylesheet" type="text/css" media="all" />
<link href="resources/fonts.css" rel="stylesheet" type="text/css" media="all" />

<title>게시판 리스트</title>
</head>
<body>

<jsp:include page="include1.jsp"/>
<br>

	<div class="container">
		<table class="table table-hover">
			<h1>공지사항</h1>
			<tr>
				<th bgcolor="skyblue">번호</th>
				<th bgcolor="skyblue">제목</th>
				<th bgcolor="skyblue">작성자</th>
				<th bgcolor="skyblue">작성날짜</th>
				<th bgcolor="skyblue">조회수</th>
			</tr>
			<c:forEach items="${list}" var="info">
				<tr>
					<td>${info.no}</td>
					<td><a href="notice_view?no=${info.no}">${info.title}</a></td>
					<td>${info.writer}</td>
					<td>${info.write_date}</td>
					<td>${info.hit}</td>
					<%-- <td><a href="reply_view?no=${info.no}" class="btn btn-default" role="button">수정하기</a></td>
					<td><a href="delete?no=${info.no}" class="btn btn-default" role="button">삭제하기</a></td> --%>
				</tr>
			</c:forEach>
		</table>
		<a href="notice_write" class="btn btn-default" role="button">글쓰기</a>
	</div>
	<br/>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous">
	</script>
</body>
</html>