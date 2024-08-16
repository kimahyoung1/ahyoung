<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--<%(todoDTO)request.getAttribute("dto")).getTno( ) --%>
<%--밑에 꺼랑 같은 의미--%> 
<div>${dto.tno }</div>
<div>${dto.title }</div>
<div>${dto.dueDate }</div>
<div>${dto.finished }</div>
 
 <a href ="list">목록으로 가기</a>

<form method ="post" action="remove">
<input type="hidden" name="tno" value="${dto.tno }">
<input type =" submit" value="삭제">
</form>

<a href="/_proj3_todo/todo/modify?tno=${dto.tno }">수정</a>"

</body>
</html>