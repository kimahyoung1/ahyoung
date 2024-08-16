package org.zero.w1.gugu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Guguresult")
public class Guguresult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		// 파라미터 값 추출
				String danStr = request.getParameter("dan");
				int dan = Integer.parseInt(danStr);
						
				// 구구단 결과 배열에 담기
				String[] gugudanResults = new String[9];
				for(int i = 1; i <= 9; i++) {
					gugudanResults[i-1] = dan + " * " + i + " = " + (dan * i);
				}
						  
				// 계산된 구구단 결과를 request 객체에 속성으로 추가
				request.setAttribute("gugudanResults", gugudanResults);
						    
				// result.jsp로 전송
				RequestDispatcher dispatcher = request.getRequestDispatcher("/guguresult.jsp");
				dispatcher.forward(request, response); 
			
		
	}

}
