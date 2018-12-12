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

.update:nth-child(even) {
	background-color: #f2f2f2
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
	<h2>수정</h2>

	<table >
		<form action="freeBoardUpdate1">
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
				<td class="update">제목</td>
				<td class="update"><input type="text" name="title" size="50"
					value="${list.title}" required="required" ></td>
			</tr>

			<tr>
				<td>작설날짜</td>
				<td><input type="text" name="write_date" size="50"
					value="${list.write_date}" readonly="readonly"></td>
			</tr>

			<tr>
				<td class="update">내용</td>
				<td class="update"><textarea name="contents" rows="10" required="required">${list.contents}</textarea></td>
			</tr>

			<tr>
				<td colspan="2"><a href="freeBoard1">목록보기</a>&nbsp;&nbsp; <input type="submit"
					value ="수정확인" /> &nbsp;&nbsp; <a
					href="freeBoardDelete1?no=${list.no}">삭제</a></td>
			</tr>
		</form>
	</table>

	</div>
</body>
</html>