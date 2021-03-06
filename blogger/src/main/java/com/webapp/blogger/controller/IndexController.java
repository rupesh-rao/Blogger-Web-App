package com.webapp.blogger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("message", "hello world");
		return "index";
	}
}
