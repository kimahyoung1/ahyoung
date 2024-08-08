package org.zerock.w1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CalcController", urlPatterns = {"/calc/makeResult"})
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 실행");
		// 만약 키가 없다면 null나옴
		String text1 = request.getParameter("text1");
		String btn1 = request.getParameter("btn1");
		String btn2 = request.getParameter("btn2");
		String pw1 = request.getParameter("pw1");
		String hidden1 = request.getParameter("hidden1");
		String radio1 = request.getParameter("radio1");
		String chk1 = request.getParameter("chk1");
		String date1 = request.getParameter("date1");
		String text2 = request.getParameter("text2");
		String select1 = request.getParameter("select1");
		String textarea1 = request.getParameter("textarea1");

		textarea1 = textarea1.replace("\n", "<br>");

		String[] chk1s = request.getParameterValues("chk1");
		// 방어코딩
		if (chk1s != null) {
			for (int i = 0; i < chk1s.length; i++) {
				System.out.println(chk1s[i]);
			}
		}
		System.out.println("text1: " + text1);
		System.out.println("btn1: " + btn1);
		System.out.println("pw1: " + pw1);
		System.out.println("hidden1: " + hidden1);
		System.out.println("radio1: " + radio1);
		System.out.println("chk1: " + chk1);
		System.out.println("date1: " + date1);
		System.out.println("select1: " + select1);
		System.out.println("textarea1: " + textarea1);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 실행");

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);

		int result = 0;
		// 문자가 들어올 수 있어서 방어코딩 한거임
		try {
			result = Integer.parseInt(num1) + Integer.parseInt(num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//절대주소 언제어디서든 갈수있는곳
//		response.sendRedirect("/proj2_calc_MVC/calcResult.jsp?result=" + result);
		
		//상대주소  내 위치기준으로 
		response.sendRedirect("../calcResult.jsp?result=" + result);

	}
	
}
