package com.example.ExamenSpringBoot.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	 
	
	 @RequestMapping(method = RequestMethod.GET)
	    public String home() {	        
	        return "home";
	    }
	

}
