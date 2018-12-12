<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="modify9" method="post">
			<input type="hidden" name="no" value="${noticeView.no}">
			<tr>
				<td> 번호 </td>
				<td> ${noticeView.no} </td>
			</tr>
			<tr>
				<td> 조회수 </td>
				<td> ${noticeView.hit} </td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="writer" value="${noticeView.writer}"></td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="title" value="${noticeView.title}"></td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea rows="10" name="contents">${noticeView.contents}</textarea></td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="확인"> &nbsp;&nbsp; <a href="noticeBoard">목록보기</a> &nbsp;&nbsp; <a href="delete9?no=${noticeView.no}">삭제</a></td>
			</tr>
		</form>
	</table>
</body>
</html>