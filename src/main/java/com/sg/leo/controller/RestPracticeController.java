package com.sg.leo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")   // localhost:8080/api/
public class RestPracticeController {
	@RequestMapping("/hello")   // http://localhost:8080/api/hello
	public String hello() {
		return "return from /hello, RestPracticeController. 10/23 by 이용희";
	}
	
	@GetMapping("/get")
	public String get() {
		return "return from /get,  RestPracticeController. 10/16 by 이용희";
	}
	
	@GetMapping(value = "/getchk/{variable}")
	public String getchk(@PathVariable String variable) {
		return "return from /getchk,  RestPracticeController. 10/16 by 이용희: " + variable;
	}
	
	@GetMapping(value="/getparam")
	public String getparam(  String name, String email) {
		return "retrun from /getparm, name = " + name + ", 이메일주소는=" + email;
	}
	
}



