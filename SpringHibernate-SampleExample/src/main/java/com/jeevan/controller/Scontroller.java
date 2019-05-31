package com.jeevan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeevan.model.Student;
import com.jeevan.service.StudentService;
import com.jeevan.service.StudentServiceimpl;


@Controller
public class Scontroller 
{
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/createStudent")
	public String createstudent(Model m)
	{
		System.out.println("Controller");
		m.addAttribute("student",new Student());
		return "enterDetails.jsp";
		
	}
	
	@RequestMapping(value="/EnteredDetails" , method=RequestMethod.POST)
	public String EnteredDetails(@ModelAttribute("student") Student student)
	{
	
		System.out.println("EnteredDetails controller");
		System.out.println(student.getName());
		
		System.out.println("--> EnteredDetails controller--> StudentServiceimpl");
		studentService.addStudent(student);
		//Stervice.addStudent(student);
		/* return "listStudents.jsp"; */
		
		return "redirect:/Display";
	}
	 
	
	@RequestMapping(value="/Display",method=RequestMethod.GET)
	public String Display(Model m)
	{
		System.out.println("Display controller");
		
		List<Student> list=new ArrayList();
		list=studentService.listAllStudents();
		
		System.out.println("Student Details in  Controller");
		for(Student stt:list)
		{
			System.out.println(stt.getId());
			System.out.println(stt.getName());
			System.out.println(stt.getFname());
		}
		System.out.println("before m.add..");

		m.addAttribute("list", list);
		System.out.println("after m.add..");

		return "listStudents.jsp";
	}
	

			@RequestMapping(value="/updateOrDelete",method=RequestMethod.POST )
			public String updateOrDelete(HttpServletRequest req,Model model)
			{
				int key=Integer.parseInt(req.getParameter("key"));
				String action=req.getParameter("action");
				
				if(action.equals("update"))
				{
				
					Student student=studentService.getStudentObject(key); 
					
					System.out.println("updateOrDelete----Update controller");
					System.out.println("sname"+student.getName());
					System.out.println("sname"+student.getFname());
					System.out.println("sname"+student.getPhnum());
					
					model.addAttribute("student",student);

					return "update.jsp";
					//return "redirect:/update.jsp";
					
				}
				else
				{
					studentService.deleteStudent(key);
				
				
					return "redirect:/Display";
				}
			}
			
			@RequestMapping(value="/Update" , method=RequestMethod.POST)
			public String Update(HttpServletRequest req    ,@ModelAttribute("student") Student student)
			{
			
				System.out.println("Update controller");
				int key=Integer.parseInt(req.getParameter("key"));
				student.setId(key);
				System.out.println(student.getId());
				System.out.println(student.getName());
				
				System.out.println("--> Update controller--> StudentServiceimpl");
				studentService.updateStudent(student);
				//Stervice.addStudent(student);
				/* return "listStudents.jsp"; */
				
				return "redirect:/Display";
			}
			
	
	
}
