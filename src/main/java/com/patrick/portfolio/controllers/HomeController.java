package com.patrick.portfolio.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "forward:/index.html";
	}
	@RequestMapping("/projects")
	public String projects() {
		return "forward:/projectpage.html";
	}
	@RequestMapping("/aboutme")
	public String about() {
		return "forward:/about.html";
	}
}
