package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TopController {

	@PostMapping("/top")
	public String top(Model model){
        return "top.html";
    }
}
