<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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


button{ 
    color: white;
    padding : 5px 25px;
    align-contents: left;
   
}

a { text-decoration:none;

}
input[type=text], textarea{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: black;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}


</style>
</head>
<body>
	<h2>글쓰기</h2>

	<div class="container">

		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<form action="writer1" method="post" enctype="multipart/form-data">

				<tr>
					<td>이름</td>
					<td><input type="text" name="writer" size="50" value="${writer}" readonly="readonly">
					</td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="title" size="50" value="" required="required">
					</td>
				</tr>
				<tr>
					<td>내용</td>
					<td><textarea name="contents" rows="10" required="required"></textarea></td>
				</tr>
				<tr>
					<td>파일업로드</td>
					<td><input type="file" name="uploadFile" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="입력">
						&nbsp;&nbsp; <a href="freeBoard1">목록보기</a>
				</tr>
			</form>
		</table>

	</div>
	
</body>
</html>