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
    <h1>제목 : ${list.title}</h1>

	<table>
		<form action="">
			<tr>
				<td>글번호</td>
				<td><input type="text" name="no" size="50" value="${list.no}"
					readonly="readonly"></td>
			</tr>

			<tr>
				<td>이름</td>
				<td><input type="text" name="writer" size="50"
					value="${list.writer}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" size="50"
					value="${list.title}" readonly="readonly"></td>
			</tr>

			<tr>
				<td>작성날짜</td>
				<td><input type="text" name="write_date" size="50"
					value="${list.write_date}" readonly="readonly"></td>
			</tr>

			<tr>
				<td>내용</td>
				<td><textarea name="contents" rows="10"
						 readonly="readonly">${list.contents}</textarea></td>
			</tr>

			<tr>
				<td colspan="2"><a href="freeBoard1">목록보기</a>&nbsp;&nbsp; <a
					href="freeBoardModify1?no=${list.no}">수정</a> &nbsp;&nbsp; <a
					href="freeBoardDelete1?no=${list.no}">삭제</a></td>
			</tr>
		</form>
	</table>

	</div>
</body>
</html>