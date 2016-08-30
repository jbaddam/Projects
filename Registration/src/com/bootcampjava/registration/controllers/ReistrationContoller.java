package com.bootcampjava.registration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bootcampjava.registration.models.Customer;

@Controller
public class ReistrationContoller {

	@RequestMapping("/registration")
    public String registratation(@ModelAttribute("customer") Customer customer,ModelMap model) {
		System.out.println("Am in registration controller");
		model.addAttribute("customer", customer);		
        return "success";
    }
	
	@RequestMapping("/" )
    public ModelAndView home() {
		System.out.println("Am in controller");
			
        return new ModelAndView("register");
    }
	
 
}
