<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
<link rel="stylesheet" type="text/css" href="resources/myStyle.css">
<link href="http://fonts.googleapis.com/css?family=Raleway:400,200,500,600,700,800,300" rel="stylesheet" />
<link href="resources/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="resources/fonts.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<jsp:include page="/WEB-INF/views/include1.jsp"/>

<table>
		<div class="boardcss_list_table">
			<table class="list_table">
			
				<caption>자유 게시판</caption>
				<colgroup>
					<col width="5%" />
					<col width="10%" />
					<col width="30%" />
					<col width="5%" />
					<col width="10%" />
					<col width="5%" />
				</colgroup>
				<h1>글 상세보기</h1>
				<thead>
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>내용</td>
						<td>작성자</td>
						<td>작성날짜</td>
						<td>조회수</td>
					</tr>
				</thead>

				<tbody>

						<tr>
							<td><input type="text" name="no" value="${view.no}" size = "1" readonly="readonly"></td>
							<td><input type="text" name="title" value="${view.title }"size = "10" readonly="readonly" ></td>
							<td><input type="text" name="contents" value="${view.contents}"	size="100" readonly="readonly" ></td>
							
							<td><input type="text" name="writer" value="${view.writer}"	size="10" readonly="readonly" ></td>
							<td><input type="text" name="write_Date" value="${view.write_Date}" size="10" readonly="readonly" ></td>
							<td><input type="text" name="write_Date" value="${view.hit}" size="10" readonly="readonly" ></td>
						<tr>

				</tbody>
			</table>
		</div>
		<tr>
			<td colspan="2"><a class="add_button" href="freeBoard4">목록보기</a> &nbsp;&nbsp; <a class="add_button" href="freeBoard4Modify?no=${view.no}">수정하기</a>  <a class="add_button" href="freeBoard4ReplyForm?no=${view.no}">답변</a> &nbsp;&nbsp;&nbsp;<a class="add_button" href="delete4?no=${view.no}">삭제하기</a> </td>
		</tr>
	</table>

</body>
</html>