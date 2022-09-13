package ks44team03.thymeleaf_layout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	
	/**
	 *  thymeleaf(third party library) layout 완성
	 * @param model
	 * @return
	 * */
	
	
	@GetMapping("/")
	public String main(Model model) {
		return "main";
	}
	
	/**
	 * thymeleaf 기본 layout 문법 실습
	 * @param model
	 * @return
	 * 
	 * */
	
	@GetMapping("/test")
	public String test(Model model) {
		
		
		
		
		return "test";
	}
	
	
	
}
