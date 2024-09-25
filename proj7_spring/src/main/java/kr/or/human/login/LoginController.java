package kr.or.human.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	//"loginForm.do"
	
	//@RequestMapping(value="/test/main5.do", method=RequestMethod.GET)
		@GetMapping("/loginForm.do")
		public ModelAndView loginForm() {
		
			ModelAndView mav = new ModelAndView();
			mav.setViewName("login");
		
			return mav;
		}
	@RequestMapping("/login")
		//@PostMapping("/login")
		public ModelAndView login(HttpServletRequest req) {
		
			String userID = req.getParameter("userID");
			String userPW = req.getParameter("userPW");
			
			MemberDTO dto = new MemberDTO();
			dto.setUserID(userID);
			dto.setUserPW(userPW);
			
			System.out.println(dto);
			
			ModelAndView mav = new ModelAndView();
			mav.addObject("dto", dto);
			mav.setViewName("result");
			
			return mav;
	

		}
	@RequestMapping("/login2")
	//@PostMapping("/login")
	public ModelAndView login2(
			
			////	String userID = req.getParameter("userID"); 이것과 동일한 동작
			//기본적으로 필수값으로 변경됨, 없다면 400  Bad Request코드 발생
			//required 의 기본값: true
			@RequestParam("userID")
			String userID,
			
			// 만약 parameter의 key와 변수명이 같다면, @RequestParam 생략가능
			@RequestParam(value = "userPW", required = false)
			String userPW
	 ){
	
	//	String userID = req.getParameter("userID");
	//	String userPW = req.getParameter("userPW");
		
		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		
		//만약 parameter의 key와 변수명이 같다면 @RequestParam 생략가능
		
		dto.setUserPW(userPW);
		
		
		System.out.println(dto);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");
		
		return mav;


	}
	@RequestMapping("/login3")
	//@PostMapping("/login")
	public ModelAndView login3(
			//전달받은 모든 것을 Map으로 전환
			@RequestParam Map user 
			) {
		String userID = (String)user.get("userID");
		String userPW = (String)user.get("userPW");
		
		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);
		
		System.out.println(dto);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");
		
		return mav;

		
	}
	
	@RequestMapping("/login4")
	//@PostMapping("/login")
	public ModelAndView login4(
			//@ModelAttribute : DTO에 알아서 넣어줌
			//@ModelAttribute MemberDTO dto2
			
			//request에 "dto"라는 key로 자동완성된 MemberDTO를 넣어 줌
			//@ModelAttribute("dto") MemberDTO dto2
			
			// request에 앞글자만 소문자로 바꾼 "memberDTO"라는 key로 넣어줌
			MemberDTO dto2
			) {
	
		System.out.println(dto2);
		
		ModelAndView mav = new ModelAndView();
	//	mav.addObject("dto", dto2);
		mav.setViewName("result");
		
		return mav;


	}
	// 요 느낌으로 쓰장 
	@RequestMapping("/login5")
	public String login5(
			String userID, 
			MemberDTO dto, 
			Model model) {
		
		System.out.println("login5 실행");
		System.out.println("userID 실행" + userID);
		System.out.println(dto);
		
		model.addAttribute("userID", userID);
		model.addAttribute("dto", dto);
		
		return "result";
		
	}
	@RequestMapping("result.do")
	public void login6(MemberDTO dto) {
		//return type이 void
		// 또는 return 값이 null 일 때
		// 주소의 마지막 . 앞의 주소를 
		// viewResolver로 보냄
		// 즉 주소 .jsp가 호출된다
		
		// 그래도 읽기 좋게 명시적으로
		// return "result"; 해주는게 좋다 
		
		
	}
	
}
