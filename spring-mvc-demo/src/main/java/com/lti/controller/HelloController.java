package com.lti.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	
@RequestMapping(path="/hello" , method=RequestMethod.GET)
public String hello(Map model)	{
	model.put("message", "Welcome to Spring Model View Controller");
	return "redirect:/hello.jsp";
	}
}
