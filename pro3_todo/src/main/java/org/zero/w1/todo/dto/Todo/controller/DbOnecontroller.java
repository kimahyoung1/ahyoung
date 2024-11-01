package org.zero.w1.todo.dto.Todo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.w1.todo.dto.TodoDTO;

@WebServlet("/Db")
public class DbOnecontroller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/db doGet 실행");
		
		response.setContentType("text/html; chrset=utf-8");
        
		String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
        String user = "scott2_2";
        String password = "tiger";
        
        long start = System.currentTimeMillis();
		
        try {
        	// class.forName : String 을 이용해서 class 를 생성한다
        	// 드라이버 : 서로 다른 것들 (java,oracle)이 소통할 수 있게 해주는 것
        	// 오라클 드라이버 로딩
        	Class.forName(driver);
        	
        	//DB접속 하기
        	Connection con =DriverManager.getConnection(url,user,password);

        	//  sql 준비을 준비하는 과정
        	String query = "select * from tbl_todo";
        	// string 을 오라클용으로 컴파일
        	PreparedStatement ps =con.prepareStatement(query);
        	
        	//  sql  실행 및 결과 확보
        	// Result : sellect 전용   resultset  반환함
        	//
        	ResultSet rs =ps.executeQuery( );
        	//			ResultSet에 모든 select결과가 들어있다
        	
        	// 다음거 있니? 라고 물어볼때
        	List<TodoDTO> list = new ArrayList<TodoDTO>();
        	// 결과활용
        	//  rs.nest( ) 다음 줄이 있는가?
        	// next가 실행된 이후에는 rs가 한 줄로 바뀜
        	while ( rs.next( )) {
        		// 전달인자로 컬럼명을 적고 그 내영을 형변환 해서 가지고 온다
        		int tno =rs.getInt("tno");
        		String title = rs.getString("title");
        		String finished = rs.getString("finished");
        		
        		
        		LocalDate dueDate = rs.getDate("duedate").toLocalDate( );
        		
        		TodoDTO dto = new TodoDTO( );
        		dto.setTno(tno);
        		dto.setTitle(title);
        		dto.setDueDate(dueDate);
        		dto.setFinished(finished.equals("y")? true : false);
        		
        		list.add(dto);	
        	}
        	
        	for(int i=0; i<list.size( ); i++) {
        		TodoDTO dto2 = list.get(i);
        		
        		response.getWriter().println(
                        dto2.getTno() + "," + dto2.getTitle() + "," + dto2.getDueDate() + "," + dto2.isFinished() + "<br>");
        		
        	response.getWriter( ).println(" ");
        	}
        	rs.close( );
        	ps.close( );
        	con.close( ); 
        	
          } catch(Exception e) {  
        	e.printStackTrace( );
        }
        
        long end = System.currentTimeMillis();
        System.out.println("걸린시간 1/1000초 단위 : " + (end-start));
	

	}
}
