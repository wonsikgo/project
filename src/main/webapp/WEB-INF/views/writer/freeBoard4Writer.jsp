<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<link rel="stylesheet" type="text/css" href="resources/myStyle.css">
<link href="http://fonts.googleapis.com/css?family=Raleway:400,200,500,600,700,800,300" rel="stylesheet" />
<link href="resources/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="resources/fonts.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<jsp:include page="/WEB-INF/views/include1.jsp"/>

<form action="write4" method="post">
<table>
		<div class="boardcss_list_table">
			<table class="list_table">
				<colgroup>
					<col width="5%" />
					<col width="10%" />
					<col width="30%" />
					<col width="5%" />
					<col width="10%" />
					<col width="5%" />
				</colgroup>
				<h1>글 작성하기</h1>
				<thead>
					<tr>
						<td>제목</td>
						<td>내용</td>
						<td>작성자</td>
					</tr>
				</thead>

				<tbody>

						<tr>
							<td><input type="text" name="title" size = "10" required ></td>
							<td><input type="text" name="contents" 	size="100" required ></td>			
							<td><input type="text" name="writer" value="${writer}"	size="10" readonly="readonly" ></td>
						<tr>

				</tbody>
			</table>
		</div>
		<tr>
			<td colspan="2"><input class="add_button" type="submit" value="입력" style="width: 122px; height: 42px;">
			<a  class="add_button" href="freeBoard4">취소</a> &nbsp;&nbsp; 
			 </td>
		</tr>
	</table>
</form>

</body>
</html>