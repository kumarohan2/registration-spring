package com.lti.controller;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dto.RegisterDTO;
import com.lti.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(RegisterDTO registerDTO) {
		registerService.r
(registerDTO);
		return "redirect:/confirmation.jsp";

	}
}
