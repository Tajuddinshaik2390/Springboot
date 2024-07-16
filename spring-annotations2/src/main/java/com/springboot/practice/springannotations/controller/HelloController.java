package com.springboot.practice.springannotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

	@RequestMapping("helloworld")
	//@ResponseBody
	 public String helloWorld() {
		return "WELCOME TO MY-WORLD";
	}
	
}
