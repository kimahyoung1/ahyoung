<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
내가 입력한 내용 <br>
<%-- id : ${dto.userID} <br> --%>
<%-- pw: ${dto.userPW} --%>

<!--컨트롤에서 로그인5 부분  -->
id : ${memberDTO.userID }<br>
pw: ${memberDTO.userPW}<br>
</body>
</html>