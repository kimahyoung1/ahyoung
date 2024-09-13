package emp;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emp")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("emp 실행");
		response.setContentType("text/html;charset=utf-8;");

		EmpDAO empdao = new EmpDAO();
		List<EmpDTO> emplist = empdao.selectEmp();

		System.out.println(emplist);
		request.setAttribute("emplist", emplist);

		// map을 담은 list 받기
		List<Map> empListMap = empdao.selectAllEmpMap();
		// 첫번째 map의 ename 출력
		Map map = empListMap.get(0);
		System.out.println(map.get("ENAME"));

		EmpDTO empDTO = empdao.selectOneEmp();
		System.out.println(empDTO);

		int total = empdao.selectTotalEmp();
		System.out.println("total " + total);
		
		String Ename = empdao.selectEnameEmp();
		System.out.println("Ename" + Ename);
		
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(7788);
		dto.setEname("ScoTT4");
		dto.setSal(3210);
		int updateResult = empdao.updateEmp(dto);
		System.out.println("업데이트결과:" + updateResult);
		System.out.println(dto);
		
		empDTO = empdao.selectEmpByEname("KING");
		System.out.println(empDTO);
		

	}

}
