package human.class1.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import human.class1.ajax.dto.EmpDTO;
import human.class1.ajax.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;

	@RequestMapping("/listEmp")
	@ResponseBody
	public List ListEmp() {
		List list = empService.listEmp();
		System.out.println("list.size( ) : " + list.size());

		return list;
	}

	@RequestMapping("/emp")
	public String emp() {

		return "emp";
	}

	@RequestMapping(value = "/deleteEmp", method = RequestMethod.DELETE)
	@ResponseBody
	public int deleteEmp  (@RequestBody EmpDTO empDTO) {
		System.out.println("controller empno : " + empDTO.getEmpno());
		int result = empService.deleteEmp(empDTO);

		System.out.println("삭제 결과 : " + result);
		return result;

	}
	


}
