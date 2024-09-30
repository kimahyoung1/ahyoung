package human.class1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/human")
/*
 * @RestController
 * = @Controller + @ResponseBody
 */
@Controller 
@ResponseBody
public class RestController {

	@RequestMapping("/test1")
	@ResponseBody
	public int test1() {
		return 100;
	}

	@RequestMapping("/test2")
	@ResponseBody
	public String test2() {
		return "ajax";
	}
}