package com.spring.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.sample.vo.S0611VO;

@Controller
@RequestMapping("/0611")
public class S0611Controller {
	
	//@GetMapping("/index")
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getIndex() {
		
		return "0611/index";
	}
	
	@GetMapping("/test1")
	public String getTest1(HttpServletRequest request) {
		String mid = request.getParameter("mid");
		String pwd = request.getParameter("pwd");
		
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		
		return "0611/test1";
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String getTest2(String mid, String pwd, int age, int gender, Model model) {
		String strGender = "";
		if(gender == 1 || gender == 3) strGender = "남자";
		else strGender = "여자";
		
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		model.addAttribute("age", age-1);
		model.addAttribute("gender", strGender);
		
		return "0611/test2";
	}
	
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String getTest3(String mid, 
			String pwd, 
			int age, 
			//@RequestParam(name="gender") int sex, 
			@RequestParam(name="gender", defaultValue = "2", required = false) int gender, 
			Model model
			) {
		String strGender = "";
		if(gender == 1 || gender == 3) strGender = "남자";
		else strGender = "여자";
		
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		model.addAttribute("age", age-1);
		model.addAttribute("gender", strGender);
		
		return "0611/test3";
	}
	
	@RequestMapping(value = "/test4", method = RequestMethod.GET)
	public String getTest4(String mid, 
			String pwd, 
			int age, 
			//@RequestParam(name="gender") int sex, 
			@RequestParam(name="gender", defaultValue = "2", required = false) int gender, 
			Model model
			) {
		String strGender = "";
		if(gender == 1 || gender == 3) strGender = "남자";
		else strGender = "여자";
		
		S0611VO vo = new S0611VO();
		vo.setMid(mid);
		vo.setPwd(pwd);
		vo.setAge(age);
		vo.setStrGender(strGender);
		
		model.addAttribute("vo", vo);
		
		return "0611/test4";
	}
	
	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	public String getTest5(S0611VO vo, Model model) {
		if(vo.getGender() == 1 || vo.getGender() == 3) vo.setStrGender("남자");
		else vo.setStrGender("여자");
		
		model.addAttribute("vo", vo);
		
		return "0611/test5";
	}
}
