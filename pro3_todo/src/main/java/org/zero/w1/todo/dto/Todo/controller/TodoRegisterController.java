package org.zero.w1.todo.dto.Todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.w1.todo.dto.TodoDTO;
import org.zero.w1.todo.service.TodoService;


@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doGet 실행");
		
		request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doPost 실행"); 
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String title = request.getParameter("title");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		
//		세가지 값을 dto에 넣을거임
		
		TodoDTO todoDTO = new TodoDTO( );
		todoDTO.setTitle(title);
		todoDTO.setDueDate(LocalDate.parse(dueDate));
		if("N".equals(finished)) {
			todoDTO.setFinished(false);
		} else {
			todoDTO.setFinished(true);
		}
		System.out.println(todoDTO);
		
		// DB의  insert 까지 실행
		TodoService todoservice = new TodoService( );
		int result = todoservice.register(todoDTO);
		System.out.println("insert 결과: "+ result);    
			
		// 목록으로 보내기
//		response.sendRedirect("_pro3_todo/todo/list");
//		response.sendRedirect("list");
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath+"/todo/list");
		
	}

}
