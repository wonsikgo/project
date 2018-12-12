<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/table.css">
</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1" class="type11">
		<form action="writego" method="post">
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="writer" size = "50" value="${writer}" readonly="readonly"> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="title" size = "50" required> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea name="contents" rows="15" required></textarea> </td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="noticeBoard.do">목록보기</a></td>
			</tr>
		</form>
	</table>
	<form action="upload" method="post" enctype="multipart/form-data">
		<input type="file" name="file1"><br>
		<input type="submit" value="upload">
	</form>
</body>
</html>