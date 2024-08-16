package org.zero.w1.todo.dto.Todo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.w1.todo.dto.TodoDTO;

@WebServlet("/one") // 클래스에 주소가 붙는다
public class TodoOneController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/one doGet 실행");

		// 한글깨짐 방지는 위에 쓰는게 좋다
		// 들어오는 애들
		request.setCharacterEncoding("utf-8");
		// 나가는 애들
		response.setContentType("text/html; charset=utf-8;");

		// 브라우저를 글씨를 보낸다
		PrintWriter out = response.getWriter();// 한번에 써도 되는데 변수에 담는다
		out.println("<h1>h");
		out.print("e");
		out.append("ll");
		out.write("o</h1>");

		// 글씨를 브라우저에 응답을 주려면?

		// 브라우저에서 보낸 파라미터를 받는다
		// id의 값 출력하기
		String 아이디 = request.getParameter("id");
		System.out.println("아이디: " + 아이디);

		// pw의 값 출력하기
		String 비밀번호 = request.getParameter("pw");
		System.out.println("비밀번호:" + 비밀번호);

		// id의 값과 pw의 값을 브라우저에 출력
		// http://localhost:8080/_pro3_todo/one?id=1234&pw=4567

		PrintWriter out1 = response.getWriter();
		out.println("<h2>id  :" + 아이디 + "</h2>");
		out.println("<h2>pw  :" + 비밀번호 + "</h2>");

		out.println("<hr>");

		// 리스트 쓰는 방법
		// 서비스에서 했던 일
		List<TodoDTO> list = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			TodoDTO dto1 = new TodoDTO();
			dto1.setTno(i);
			dto1.setTitle("할일" + i);
			if (i % 3 == 0) {
				dto1.setFinished(true);
			}
			// DTO를 만들어서 리스트에 담은것
			list.add(dto1);
			// 만약에 숫자 1을 쓸 수가 없다.
			// 제네릭을 쓰면은 무조건 투두 디티오만 쓸 수 있다.
			// 제네릭 쓰는거 추천!
		}
		// 리스트에서 하나를 꺼냄
        
		// 향상된 포문
		// jsp역할
		// jsp에서 했던일
		for (int i = 0; i < list.size(); i++) {
			// TodoDTO dto2 = (todoDTO) list.get(i);
			TodoDTO dto2 = list.get(i);
			
			out.println("<div>");
			out.println("<input type='checkbox' ");
			if(dto2.isFinished()) {
				out.println("checked='checked' ");
			}
			out.println(">");
			out.println("tno : "  + dto2.getTno());
			out.println("title : "  + dto2.getTitle());
			out.println("</div>");
		}
	}

}
