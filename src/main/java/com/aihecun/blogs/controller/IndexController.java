package com.aihecun.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "index";
	}
	@RequestMapping("login")
	public String doLogin(ModelMap model) {

		model.addAttribute("userNumber", "YOUR NUMBER:");
		model.addAttribute("password", "YOUR PASSWORD:");
		model.addAttribute("login", "GO GO");

		return "login";
	}
}