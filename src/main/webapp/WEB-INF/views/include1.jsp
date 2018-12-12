<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="wrapper">
   <div id="menu-wrapper">
      <div id="menu" class="container">
         <ul>
            <li class="current_page_item" ><a href="home" id ="menubar">Home</a></li>
            <li><a href="noticeBoard" id ="menubar">notice</a></li>
            <li><a href="freeBoard1" id ="menubar">FreeBoard1</a></li>
            <li><a href="freeBoard2" id ="menubar">FreeBoard2</a></li>
            <li><a href="freeBoard4" id ="menubar">FreeBoard3</a></li>
            <c:choose>
               <c:when test="${loginid eq null}">
                  <li class="login"><a href="loginForm" id="menubar" style="">login</a></li>
               </c:when>
               <c:when test="${loginid ne null}">
                  <li class="login"><a href="logout" id="menubar">logout</a></li>
               </c:when>
            </c:choose>
         </ul>
      </div>
      <!-- end #menu --> 
   <div id="header-wrapper">
      <div id="header" class="container">
         <div id="logo">
            <h1><a href="home">KKYYL Project</a></h1>
            <p>Design by YOON JONG HUN</p>
         </div>
      </div>
   </div>
   </div>
      </div>