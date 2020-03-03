package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Form.loginForm;

@Controller
public class TopController {

	@PostMapping("/top")
	public String top(@ModelAttribute("loginForm") loginForm loginForm){
		String userName = loginForm.getUserName();
		
        return "top.html";
    }
}
