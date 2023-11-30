package com.sg.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // annotation
public class HelloController {
	
	@GetMapping("/html")   // localhost:8080/html
	public String html() {
		System.out.println("HTML파일이 요청됨");
		return "redirect:myspring.html";
	}
	
	@GetMapping("/img")     // localhost:8080/img
	public String img() {
		System.out.println("이미지파일이 요청됨");
		return "redirect:image/shinguexpo.jpg";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("jsp파일이 요청됨");
		model.addAttribute("username","흐흠 이콘텐츠주인, 이용희");
		return "hellojsp";
	}

}
