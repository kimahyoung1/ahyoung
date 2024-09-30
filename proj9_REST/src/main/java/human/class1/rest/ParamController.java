package human.class1.rest;
// 배운거 싹 다 모아둔곳 3차때 보기 

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 컨트롤러 class에 붙여서 Bean으로 등록 시킨다
			// bean id 를 지정하지 않으면
			// class 명의 앞글자가 소문자인 bean id가 자동 지정됨
			// 그래서 지금은 "paramController"로 지정됨
// @Controller("beanID") // bean id를 지정하는 방법
@ResponseBody // 이 class의 모든 메소드에 @ResponseBody를 붙여줌
// @ Rescontroller // @controller + @ResponseBody
@RequestMapping("human/a") // 주소 앞에 공통으로 적용한다
							// 이 주소로 클래스까지 들어옴 (HandlerMapping)
							// 그리고 나머지 주소도 메소드 찾아감(HandlerAdaptor)
public class ParamController {
	// @Autowired // 이 타입이 변수에 넣을 수 있는 클래스를 찾는
	// 동일한 클래스나
	// 자동 형변환 되는 클래스를 찾아서
	// 생성하고(IOC)
	// 변수에 넣어준다(OI)

	// 만약 후보 클래스가 2개 이상 있다면
	// @primary가 붙은 클래스가 온다
	// @primary가 없다면 @Qualifier("bean id")로 특정 bean을 지정 할 수 있다
	// EmpService empservice;

	@RequestMapping( // 각 값이 두개 이상인 경우 {}로 묶는다
			value = {"/test", "/test/ {key}"}, // 연결되는 주소
			method = {RequestMethod.GET, RequestMethod.PUT} // 허용하는 method
	) 																			// 없으면 모두 허용
	
	@ResponseBody  // 메소드에 붙여주는건 json 또는 기본타입을 돌려줌 
	public EmpDTO paramTest(
			HttpServletRequest request,
			HttpServletResponse response,
			Model model,
			
			@RequestParam(value="id", required=true) String id,
			// String id = request.getParameter("id")에 해당
			// required 는 기본값이 true라서 생략하면 필수 전달인자가 됨
			// 필수 일 때 null인 경우 400Bad Request 발생
			
			// 파라메터의 key가 변수명과 동일하고 필수가 아닌 경우 
			 // @RequestParam 생략가능
//			@RequestParam(value="pw", required=true) String pw
			String pw,
			
			
			@RequestParam Map map, //모든 파라메터를 key, value로 map에 넣어줌 
			
			@ModelAttribute EmpDTO dto1, //getParameter로 꺼내서 필드에  set해서 넣어줌
			/*String ename = request.getParameter("ename")
			 * EmpDTO empDTO = newDTO( );
			 * empDTO.setEname(ename); 요론고를 ModelAttribute대신 해줌
			 * */

			@ModelAttribute("dto3" ) EmpDTO dto2, 
			// 어차피 dto를 model에 dto3 라고 넣는 경우
			// 즉, model.addAttribute("dto3", dto2)를 한 번에 해줌 

			//model에 넣는 key를 class명의 앞글자를 소문자로 하는 경우 생략 가능
//			@ModelAttribute("empDTO" )
			 EmpDTO dto5,
			 
			 @RequestBody EmpDTO dto6, //post,put, delete등으로 넘어온 json을 분석해서 dto6에 넣음
			 
			 @PathVariable("key") String name // 주소 중 {key}영역의 값을 name에 할당  
			
			) {
		return null;
	}
}

