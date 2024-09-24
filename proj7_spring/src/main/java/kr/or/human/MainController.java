package kr.or.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//컨트롤러에는@Controller를 붙여줘야한다 붙이지 않으면 브라우저에 들어올 수 없다  
// bean으로 등록이 된다.

//ControllerBean(즉 스프링이 생성할 수 있는 클래스)으로 등록한다, 필요할때 new 할 수 있다.
//context path : 프로젝트 구분하는 것 
@Controller

// ip:port/context path/sub/**
// 이 클래스에서 반복되는 첫 주소를 한번에 지정할때 사용
// 클래스에 붙은 @RequestMappingdms HendlerAdaper가 처리합니다
@RequestMapping("/sub") // 이렇게 쓸 수가 있다
public class MainController {

	// ( 첫번째 메소드)
	// ModelAndView 뷰 리저브로 가는것
	// 메소드에 적용한 @RequestMappingd은 HandlerAdaper가 처리한다

	@RequestMapping("/main1.do")

	public ModelAndView main1() {
		System.out.println("main1  실행");

		// 리턴할 것
		// ModelAndView 뷰 리저브로 보내는 객체
		ModelAndView mav = new ModelAndView();
		// jsp의 조합을 위한 이름
		// forword로 이동하게 됨
		mav.setViewName("main");

		// viewname을 생성자에 넣어도됨
		// ModelAndView mav = new ModelAndView("main");
		return mav;

	}

	// (두번째 메소드)
	@RequestMapping("/test/main2.do")
	public ModelAndView main2() {
		System.out.println("main2  실행");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		// 보내고싶은 것을 마치 request.setAtttibute처럼 담을 수 있는 방법
		mav.addObject("msg", "떡볶이");
		return mav;

	}

	// ( 세 번째 메소드)
	// 전달인자가 value하나 일때는 value라는 글씨를 생략할 수 있다
	// 두 개이상 쓸때는 중괄호{ }를 사용한다
	// value는 url 패턴을 뜻한다
	// method에는 접근 방식을 제안함
	// 적은 것만 들어올 수 있음
	// method를 생략하면 모든 방식 허용
	@RequestMapping(value = {"/test/main/*/search",
			"/test/main4.do"}, method = {RequestMethod.POST, RequestMethod.GET}

	)
	public ModelAndView main3() {
		System.out.println("main3 실행");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		// 보내고싶은 것을 마치 request.setAtttibute처럼 담을 수 있는 방법
		mav.addObject("msg", " main3 메소드 실행");
		return mav;

	}

	// url주소가 같으면 부팅 시 예외 발생한다
	// @RequestMapping("/test/main2.do")
	// public ModelAndView main4() {
	// System.out.println("main2 실행");
	//
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("main");
	//
	// // 보내고싶은 것을 마치 request.setAtttibute처럼 담을 수 있는 방법
	// mav.addObject("msg", " 떡볶이");
	// return mav;
	//
	// }

	@RequestMapping(value = "/test/main5.do", method = RequestMethod.GET)
	public ModelAndView main5() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", " 떡볶이");
		return mav;

	}

	@RequestMapping(value = "/test/main5.do", method = RequestMethod.POST)
	public ModelAndView main6() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", " 떡볶이");
		return mav;

	}

	// @RequestMapping(value="/test/main5.do", method=RequestMethod.GET) 이거를 한번에
	// 쓰는 방법

	// @RequestMapping(value="/test/main5.do", method=RequestMethod.PUT)
	@PutMapping(value = "/test/main5.do")
	public ModelAndView main8() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", " 떡볶이");
		return mav;
	}

	// @RequestMapping(value="/test/main5.do", method=RequestMethod.DELETE)
	@DeleteMapping(value = "/test/main5.do")
	public ModelAndView main7() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", " 떡볶이");
		return mav;
	}
}
