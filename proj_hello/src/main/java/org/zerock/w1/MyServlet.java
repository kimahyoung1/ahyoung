package org.zerock.w1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// webservlet의 전달인자 글씨로 주소가 연결됨
// 원래는 전달인자로 utlpatterns={"주소1",주소2"} 이렇게 적을 수 있고 
// 책처럼 28p. name등 다른 요소도 넣을 수 있지만
// 주소하나만 쓰는 경우 모두 생략할 수 있다.
@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; // 괄호가 없으면 변수 // 신경안써두됨

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	// 이거는 생성자
	public MyServlet() {
		// 부모 생성자
		super();
		// TODO Auto-generated constructor stub
		System.out.println(" MyServlet 생성자 실행");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() 실행");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// get	방식으로 요청한 겨우 doget메소드를 톰켓이 실행해 준다
	// 우리는 doget을 Override해서 원하는 알고리즘을 실행할 수 있다.
	@Override
	// public은 가능함  
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget 실행");
		//HttpServletRequest: 요청에 관련된 모든 내용이 들어있다
		//HttpServletResponse: 응답에 관련된 모든 내용을 넣어주면 브라우저까지 전달된다.
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// 리스펀스가 갖고잇는 겟라이터를 꺼내고(글씨에 관련된)   append = 글씨를 더해줄수있다.
		PrintWriter out =response.getWriter( );
		out.println("<h1>");
		out.print("Hello Servlet");
		out.println("</h1>");
		
		//0~9까지
		out.println("<hr>");  // 선
		
		for(int i =0; i<10; i++) {
			out.print( i+ "<br>");
		}
		
		
				
	}

}
