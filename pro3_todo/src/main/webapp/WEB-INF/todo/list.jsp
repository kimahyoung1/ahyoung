<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TODO List</title>
</head>
<body>
<!-- 	<h1>List Page</h1> -->

<%--    ${list1} --%>
<!--    <hr> -->
<%--    ${list1[0]} --%>
<!--    <hr> -->
<%--    ${list1[0].title} --%>
<!--    <hr> -->
<%--    ${list1[0]["title"]} --%>
<!--    <hr> -->
<%--    123${null}456 --%>
   
<!-- <hr> -->
	<style>
   div {
      border: 1px solid red;
      padding: 10px;
      margin: 10px;
   }
</style>
<div style="text-align: right">
	<a href="register">글쓰기</a>
</div>
<%-- ${list1} 자바가 보내주는 것을 꺼내주는 것--%>
<c:forEach var="todoDTO" items="${list1}">
   <div>
      제목 : <a href="/_pro3_todo/todo/read?tno=${todoDTO.tno}">${todoDTO.title}</a>, 시간 : ${todoDTO.dueDate}
   </div>
</c:forEach>
  
 
    
</body>
</html>
