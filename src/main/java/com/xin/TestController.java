package com.xin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@Value("${application.hello:Hello Angel}")
	private String message;
	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("message", message);
		return "index";
	}
}
