package emp2.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;


@WebServlet("/emp2")
public class Emp2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("/emp2 doGet 실행");
			
			
			String empno =request.getParameter("empno");
			System.out.println("empno : "+empno);	
			
			try {
				// # emp2에 있는 모든 내용을  jsp에 보여줄거임
				// DB에서 emp2 조회하기
				
				// ##여기서 부터 DB접속 방식
				//JNDI 방식으로
				//Servers 폴더의 context.xml 중  Resource 태그(노드)를 가져온다
				// 거기에는 DB정보가 있다
				// 그걸로 DataSource만든다
				// DataSource가 커넥션 풀이라고 생각하면된다
				Context ctx = new InitialContext();
				DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
				
				// 커넥션 풀에서 접속정보를 가져오기
				Connection con = dataSource.getConnection();
				// ##DB접속 끝
				
				
				// SQL 준비

				String query = null;
				PreparedStatement ps = null;
				
				if(empno == null ) {
						query =" select*from emp2";
				} else if (empno != null) {
					query = "SELECT * FROM emp2 where empno =?"; 					
				}
				ps = con.prepareStatement(query);
				
				if(empno != null) {
						ps.setInt(1, Integer.parseInt(empno));
				}
				

				//Statement = sql을 실행시켜줌
				
				// sql 실행 및 결과 확보
				//				executeQuery : select문 실행
				//				ResultSet : select문 조회 결과 전체(엑셀처럼 테이블  느낌)
				ResultSet rs =ps.executeQuery( );
				
				// 결과활용
				// 			한 줄 한줄을 DTO에 넣기
				//			그렇게 만들어진 DTO를 List에 넣기
				
				
				List list = new ArrayList( );
//				rs.next( ) : 다음 줄로 커서를 이동한다
				// 다음줄이 있다면 true를,없으면 false를 돌려줌
				// 다음줄이 있으면 rs는 다음 중 덩어리가 된다: 즉 테이블의 tr 한 줄 같이(1차원 배열같이)
				
				
				while ( rs.next( )) {
					EmpDTO empDTO = new EmpDTO();
					
					
					// 이번 줄에서 empno 컬럼의 int로 형변환해서 가져옴
					int empno2 =rs.getInt("empno");
					// Integer.parseInt(str) 함수로 String을 int로 변환해준다
					empDTO.setEmpno(Integer.parseInt(empno));
					
					
					String ename =rs.getString("ename");
					empDTO.setEname(ename);
					
					empDTO.setJob( rs.getString("job"));
					empDTO.setHireDate( rs.getDate("hiredate"));
					
					list.add(empDTO); 
					
					
				}
				
				// request 자체는 브라우저에서 서버로 요청한 모든 정보가 있는 곳
				// 거기에다 우리 list도 담아두자  
				request.setAttribute("list", list); // 일단은 request에 넣어놈 

						
				// #jsp로 forward로 보여주기
				// forward  방식은 request도 전달해줌
				// 그래서 list를  request에 넣었던 것임
				request.getRequestDispatcher("/WEB-INF/views/empList.jsp").forward(request, response);
				} catch (Exception e) {
				e.printStackTrace();
			}
							
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
