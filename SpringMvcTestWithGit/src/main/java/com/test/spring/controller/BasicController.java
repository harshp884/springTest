package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class BasicController {

	@RequestMapping(value="/testController")
	@ResponseBody
	public String testController(){
		
		return "inside test controller ";
	}
}
