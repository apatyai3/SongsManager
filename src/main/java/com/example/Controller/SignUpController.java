package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.Form.loginForm;

@Controller
public class SignUpController {

	@GetMapping("/signUp")
	public String top(@ModelAttribute("loginForm") loginForm loginForm){
		
        return "signUp.html";
    }
}
