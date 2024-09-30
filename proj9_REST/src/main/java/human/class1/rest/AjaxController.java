package human.class1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	// 아작스로 구현할거임

	/*
	 * "/rest/ajax.view" "/rest/ajax.do" "/rest/ajax"
	 */

	// get,post로 둘다 받을 수 있음
	// 아작스.jsp로 가기위한것
	@RequestMapping(value = "/ajax.view", method = RequestMethod.GET)
	public String ajaxView() {
		return "ajax";
	}

	// @RequestBody : post로 보낸 json을 처리
	@RequestMapping(value = "/ajax", method = RequestMethod.POST)
	public String ajax(

			@RequestParam(value = "ename", required = false) String ename,
			@ModelAttribute EmpDTO dto2, @RequestBody EmpDTO dto) {
		System.out.println("ename : " + ename);
		System.out.println("dto2 : " + dto2);
		System.out.println("dto : " + dto);

		// json으로 보낸건 @RequestParam 또는 request.getparameter로 받을 수 없다
		return "ajax";

	}
	// @ResponseBody : 그냥 값이나 json으로 리턴해줌
	@RequestMapping(value = "/ajax/string", method = RequestMethod.POST)
	@ResponseBody
	public String ajaxString(@RequestBody EmpDTO dto) {
		System.out.println("dto : " + dto);

		return "human";

	}

	@RequestMapping(value = "/ajax/dto", method = RequestMethod.POST)
	@ResponseBody
	public EmpDTO ajaxDto(@RequestBody EmpDTO dto) {
		System.out.println("dto : " + dto);

		return dto;

	}

	@RequestMapping(value = "/ajax/list", method = RequestMethod.POST)
	@ResponseBody
	public EmpDTO ajaxList(@RequestBody EmpDTO dto) {
		System.out.println("dto : " + dto);

		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		return dto;

	}

	@RequestMapping(value = "/ajax/forward", method = RequestMethod.GET)
	public String ajaxForward() {

		return "forward:/ajax.view";
	}

	@RequestMapping(value = "/ajax/redirect", method = RequestMethod.GET)
	public String ajaxRedirect() {

		return "redirect:/ajax.view";
	}

	@RequestMapping("/ajax/notice/{num}/static/{str}")
	@ResponseBody
	public int notice(
			@PathVariable("num")
			int number,
			
			@PathVariable("str")String str1,
			
			HttpServletRequest request
			) {
		System.out.println(request.getParameter("num"));
		System.out.println("number: " + number);
		System.out.println("str1: "+ str1);
		
		return number;
	}
		

	}


