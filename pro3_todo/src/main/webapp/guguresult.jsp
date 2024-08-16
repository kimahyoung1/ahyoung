<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title> 구구단</title>
</head>
<body>
	<div>
	<h1>구구단 결과</h1>
	</div> 
	<ul>
	<%
	String[] gugudanResults = (String[]) request.getAttribute("gugudanResults");
    if (gugudanResults != null) {
        for(String result : gugudanResults) {
            out.println("<li>" + result + "</li>");
            
        }
    }
	%>
	</ul>
	
</body>
</html> 