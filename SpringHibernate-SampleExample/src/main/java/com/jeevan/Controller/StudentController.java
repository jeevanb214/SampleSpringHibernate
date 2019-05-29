package com.jeevan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.Model.*;

@Controller
public class StudentController {
	
	@RequestMapping("/CreateAccount")
	public ModelAndView registerStudents()
	{
		//System.out.println("service obj = "+service);
		
		//model.addAttribute("customer", new Customer());
		ModelAndView m = new ModelAndView();

		m.addObject("customer", new Student());
		
		m.setViewName("enterDetails.jsp");
		
		return m;
	
		
	}

}
