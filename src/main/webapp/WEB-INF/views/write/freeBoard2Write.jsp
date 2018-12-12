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
            border : 2px solid #bcbcbc;
        }
        tr {
            border-color: gray;
        }
        #txtAr {
            width: 99%;
            height: 300px;
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
    <div class="write2">
        <form action="write2" method="post" enctype="multipart/form-data">
            <table frame="hsides" rules="rows">
                <caption style="color:white;"><h1>글쓰기</h1></caption> <!-- 제목 -->
                    <tr>
                        <td> &emsp;제목&emsp;</td>&nbsp;&nbsp;
                        <td><input type="text" name="title" size="100" required></td>
                    </tr>
                    <tr>
                        <td> &emsp;내용&emsp;</td>&nbsp;&nbsp;
                        <td><textarea id="txtAr" name="contents" required></textarea></td>
                    </tr>
                    <tr>
                        <td> &emsp;작성자&emsp;</td>&nbsp;&nbsp;
                        <td><input type="text" name="writer" size="100" value="${writer}" readonly="readonly"></td>
                    </tr>
                    <div id="fileDiv" align="center">
                    <p>
                		<tr><td><input type="file" id="file" name="uploadFile">
                						  <a href="#" class="btn" id="delFile" name="delFile">삭제</a></td></tr>
                	</p>
                	</div>
                </table>
                <div align="center">
                    <hr/>
                    <button type="submit">입력</button> <button><a href="freeBoard2" type="button">목록</a></button>
                	</br>
                </div>
            </form>
    </div>
    
    
</body>
</html>