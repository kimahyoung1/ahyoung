package org.zero.w1.todo.dto.Todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.w1.todo.service.TodoService;


@WebServlet("/Todo/Remove")
public class TodoRemovecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str_tno =request.getParameter("tno");
		int  tno =Integer.parseInt(str_tno);
		
		TodoService service =new TodoService( );
		int result = service.remove(tno);
		
		System.out.println("삭제개수 :"+ result);
		
		response.sendRedirect("list");
	}

}
