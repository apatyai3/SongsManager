package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    @RequestMapping(value="/")
    public ModelAndView  top(ModelAndView mav){
    	mav.setViewName("login");
        return mav;
    }
    
    
}