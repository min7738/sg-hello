package com.adacho.hello.controller;


@Controller
public class HelloController {
	@GetMapping("/hello")
	public String helloPage(Model model) {
		model.addAttribute("greeting", "Hi!");
		return "hello";
	}
}
