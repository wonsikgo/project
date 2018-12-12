<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Free Board 4</title>
<link rel="stylesheet" type="text/css" href="resources/myStyle.css?2">
<link href="http://fonts.googleapis.com/css?family=Raleway:400,200,500,600,700,800,300" rel="stylesheet" />
<link href="resources/default.css?" rel="stylesheet" type="text/css" media="all" />
<link href="resources/fonts.css" rel="stylesheet" type="text/css" media="all" />
</head>

<body>
<jsp:include page="include1.jsp"/>

	<table>
		<div class="boardcss_list_table">
			<table class="list_table">
		
				<colgroup>
					<col width="5%" />
					<col width="10%" />
					<col width="25%" />
					<col width="5%" />
					<col width="10%" />
					<col width="5%" />
				</colgroup>
						
				<h1>자유게시판</h1>
				<select name="count" onclick="">
					<option>5개씩보기</option>
					<option>10개씩보기</option>
					<option>20개씩보기</option>
				</select>
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
					<c:forEach items="${list}" var="dto">
						<tr>
							<td>${dto.no}</td>
							<td><c:forEach begin="1" end="${dto.bIndent}">RE : </c:forEach>${dto.title}</td>
							<td><a href="freeBoard4View?no=${dto.no}">${dto.contents}</a></td>
							<td>${dto.writer}</td>
							<td>${dto.write_Date}</td>
							<td>${dto.hit}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</table>
	<br>
	<form action="freeBoard4Search" id="board_sel" >
		<select  name ="checkoption">
       		<option value="all" <c:out value="${check.checkoption eq 'all'?'selected':''}" />>전체 </option>
       		<option value="title" <c:out value ="${check.checkoption eq 'title'?'selected':''}"/>>제목</option>
        	<option value="con" <c:out value ="${check.checkoption eq 'con'?'selected':''}"/>>내용</option>
   		</select>
    <input type="text" id="search" name = "keyword" value="${check.keyword }" placeholder="검색어"> <input type="submit" class="sel" value="검색">
	</form>
	<a class="add_button" href="writeForm4" style="margin-right: 30px">글작성</a>



</body>
</html>