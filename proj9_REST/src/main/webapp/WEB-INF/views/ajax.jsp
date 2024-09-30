<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	window.addEventListener("load", function() {
		const btn = document.querySelector("#btn")
		btn.addEventListener("click", function() {

			console.log("click!!")

			// 아작스로  post로 보내는데 제이슨으로 받을거임 
			// 가능하면 const사용
			// 내용을 바꿀 일이 없기 때문에 const 사용함 
			const xhr = new XMLHttpRequest();

			// 브라우저로 가는데 아작스를 이용한 것 
			// 			const url =  "ajax";
			// 			const url = "ajax/dto";
			// 			const url = "human/list"
			const url = "human/test1"
			const data = {
				"ename" : "이름",
				sal : 3200,
			}
			// 내컨텐츠의 타입이 제이슨 이다
			xhr.open("post", url)
			xhr.setRequestHeader("Content-Type", "application/json");
			// 글씨로 만드는것

			const strData = JSON.stringify(data);
			console.log(data) // 객체 그 자체
			//네트워크는 객체를 전달 할 수 없다  

			console.log(' ' + data)
			// 이건 string이다 
			console.log(strData) // 그래서 string으로 변형
			console.log(data, strData)

			// 간거야 
			xhr.send(strData)

			// function 함수를 사용해라 
			xhr.onload = function() {
				console.log(xhr.responseText)

				try {
					let result = JSON.parse(xhr.responseText)
					console.log(result)

					console.log(result.ename) // 이것만 기억하구 있어두됨
					console.log(result["ename"])
				} catch (e) {
					console.log("json아님")
				}
			}
		})

	})
</script>

</head>
<body>
	<!--아작스로 주고 받을 만한 @룰 많이 사용하고, 컨트롤러만 사용할거임  -->

	<button id="btn">ajax 실행</button>


</body>
</html>