<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
action 의 기본값: 내주소 
method 의 기본값: get
-->
	<!-- 	<form action="calcResult.jsp"> -->
	<!-- 		<input type="number"  name="num1"> -->
	<!-- 		 <input type="number"  name="num2"> -->

	<!-- 		<button type="submit">SEND</button> -->
	<!-- 	</form> -->


	<form action="/proj2_calc_MVC/calc/makeResult" method="post">
		<input type="number " name="num1"> <input type="number"
			name="num2">
		<button type="submit">SEND-post</button>
	</form>

	<form action="/proj2_calc_MVC/calc/makeResult" method="get">
		<input type="text" name="text1" value="text2"><br>
		<input type="button" name="btn1" value="btn2"><br>
		<button type="button" name=btn2" vlaue="btn3">버튼2</button>
		<input type="password" name="pw1" value="pw2"><br>
		<input type="hidden" name="hidden1" value="hidden2"><br>
		
		<input type="radio" name="radio1" value="radio2">라디오2<br>
		<input type="radio" name="radio1" value="radio3">라디오3<br>
		
		<input type="checkbox" name="chk1" vlaue="chk2">체크2<br>
		<input type="checkbox" name="chk1" vlaue="chk3">체크3<br>
		<input type="checkbox" name="chk1" vlaue="chk4">체크4<br>
		
		<input type="date" name="date1">
 		
		<input type="text" name="text2" value="text3" style="display:none;"> <br>
		
		<select name="select1">
		<option vlaue="op1">옵션1</option>
		<option vlaue="op2">옵션2</option>
		<option vlaue="op3">옵션3</option>
		<option vlaue="op4">옵션4</option>
		</select>
		
		<textarea name="textarea1">초기값
		엔터
		엔터
		</textarea>
		
		
		<button type="submit">SEND-post</button>
	</form>
	
	전달 받은 값 : ${param.text }

</body>
</html>