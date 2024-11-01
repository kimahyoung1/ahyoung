package kr.or.human.emp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human.emp.dto.EmpDTO;
import kr.or.human.emp.service.Empservice;

@Controller
public class EmpController {
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);

	@Autowired
	Empservice empService;
	
	
	@RequestMapping("/member")
	public String listEmp(Model model) {
		List<EmpDTO> list= empService.listEmp( );
		model.addAttribute("list",list);           
		
//		System.out.println("list.size(): "+ list.size());
		logger.debug("debug list.size( ): "+ list.size());
		logger.info("debug list.size( ): "+ list.size());
		logger.warn("debug list.size( ): "+ list.size());
		logger.error("debug list.size( ): "+ list.size());
		
		
		return "emp";
	}
}
