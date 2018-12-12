<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="500" cellpadding="0" cellspacing="0" border="1" class="type11">
		<form action="writego" method="post">
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="writer" size = "50" required> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="title" size = "50" required> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea name="contents" rows="15" required></textarea> <img src="${pageContext.request.contextPath }${url }" style="width:150px"> </td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="noticeBoard.do">목록보기</a> &nbsp;&nbsp; <a href="notice_write.do">다시 업로드하기</a></td>
			</tr>
		</form>
	</table>
	<form action="upload" method="post" enctype="multipart/form-data">
		<input type="file" name="file1"><br>
		<input type="submit" value="upload">
	</form>
</body>
</html>