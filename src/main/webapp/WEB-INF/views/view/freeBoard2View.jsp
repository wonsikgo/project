<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>FreeBoard2_KBM</title>

    <style>
        body {
            background-color: black;
            color: white;
        }
        table {
            margin: auto;
            align-content: center;
            /* width : 60%; */
            border : 2px solid #bcbcbc;
        }
        tr {
            border-color: gray;
        }
        #txtAr {
            width: 99%;
            height: 300px;
        }
        table, th, td {
            text-align: center;
        }
        td {
            table-layout: auto;
        }

        button {
            all: unset;
            background-color: rgba(110, 110, 110, 0.904);
            color: white;
            padding: 5px 20px;
            border-radius: 5px;
            cursor: pointer;
        }
        ul { 
            float: right;
            position: relative;
            left: -40%;
            margin: auto;
            text-align: center;
            list-style:none;  
            /* float:left;   */
            display:inline;  
        }  
        ul li {  
            display: inline;
            vertical-align: middle;
        }  
        ul li a {  
            display:inline;
            display:inline-block;
            vertical-align:top;
            padding:4px;  
            margin-right:3px;  
            width:15px;  
            color:darkorange;
            font:bold 12px tahoma;  
            border:1px solid #eee;  
            text-align:center;  
        }  
        ul li a:hover, ul li a:focus {  
            color:#fff;  
            border:1px solid #f40;  
            background-color:#f40;  
        }  
        a:link    { color: white; text-decoration: none;}
        a:visited { color: orange; text-decoration: none;}
        a:hover   { color: blue; text-decoration: none;}

    </style>
</head>
<body>
    <div class="allboard">
        <table frame="hsides" rules="rows">
            <caption style="color:white;"><h1>상세보기</h1></caption>
            <tr>
                <td> 글번호&emsp;</td>&nbsp;
                <td><input type="text" name="no" size="100" value="${view.no}" readonly></td>
            </tr>
            <tr>
                <td> 제목&emsp;</td>&nbsp;
                <td><input type="text" name="title" size="100" value="${view.title}" readonly></td>
            </tr>
            <tr>
                <td> 내용&emsp;</td>&nbsp;&nbsp;
                <td><textarea id="txtAr" name="contents" readonly>${view.contents}</textarea></td>
                </tr>
            <tr>
                <td> 작성자&emsp;</td>&nbsp;
                <td><input type="text" name="writer" size="100" value="${view.writer}" readonly></td>
            </tr>
            <tr>
                <td> 작성일&emsp;</td>&nbsp;
                <td><input type="text" name="write_Date" size="100" value="${view.write_Date}" pattern="yyyy-MM-dd" readonly/></td>
            </tr>
            <tr>
                <td> 조회수&emsp;</td>&nbsp;
                <td><input type="text" name="hit" size="100" value="${view.hit}" readonly></td>
            </tr>
			<div id="fileDiv">
				<th scope="row">첨부</th>
                <td colspan="2">${view.fileName}&emsp;
					<a href="${view.filePath}/${view.fileName}" type="button">보기</a></td>		
		</table>
    </div>
        <hr/>
        <div align="center">
        <button id="modify"><a href="modifyForm2?no=${view.no}" class="button">수정</a></button> 
        <button id="delete"> <a href="delete2?no=${view.no}" class="button">삭제</a></button>
        <button id="home">  <a href="freeBoard2" class="button">고홈</a></button>
        </div>
    </div>
</body>
</html>