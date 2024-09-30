<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

#side {
	display: inline-block;
	wihth: 60%;
	 border: 1px solid red;
}

#content{
	display: inline-block;
	wihth: 30%;
	border: 1px solid red;
}


</style>
</head>
<body>
	<!-- 페이지에 대한 레이아웃을 만들고있다 -->

	<!-- 	< header> -->
	<div>
		<%-- 	<%import %> --%>
		<%-- 	<jsp:includre page=""></jsp:includre> --%>

		<tiles:insertAttribute name="header" />

	</div>

	<!-- 	side -->
	<div>
		<div id=side>
			<tiles:insertAttribute name="side" />
		</div>
	</div>

	<div id=content>
		<!-- content -->
		<div>
			<tiles:insertAttribute name="content" />
		</div>
	</div>

	<div id=footer>
		<!-- footer -->
		<div>
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
	
	${serverTime}
</body>
</html>