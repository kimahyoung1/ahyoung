<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">

<title>할 일 작성 | 할 일 관리</title>
</head>
<body>
	<a href="list">목록으로</a>
<form method ="post" action="register">
	title : <input type="text" name="title"><br>
	duedate : <input type="date" name="dueDate"><br>
	finished :
	<%--글씨는 안가고 value가 감--%> 
	<input type="radio" name="finished" value="N" checked="checked" > 미완료
	<input type="radio" name="finished" value="Y" >  완료
	<br>
	<input type="submit" value="등록"> 
	
	
</form>
</body>
</html>