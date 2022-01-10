package com.capgemini.project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.project.dao.AdminRepository;
import com.capgemini.project.model.Admin;
import com.capgemini.project.service.IAdminService;

@Controller
public class AdminController 
{
	@Autowired
	IAdminService adminService;
	@RequestMapping("/")
	public String home()//handler method
	{
		return "index.jsp";
	}
	
	@RequestMapping("/login")
	@PostMapping
	public ModelAndView loginAdmin(@RequestParam("username") String adminName,@RequestParam("userpass") String adminPass)
	{
		ModelAndView modelAndView=new ModelAndView();
		if(adminService.loginAdmin(adminName, adminPass).equals("success"))
		{
			modelAndView.setViewName("Profile.jsp");
			modelAndView.addObject("adminInfo","username");
		}
		else
		{
			modelAndView.setViewName("Error.jsp");
			modelAndView.addObject("statement","Invalid Credentials,Please login again!!");
			
		}
		return modelAndView;
		
	
	}
}
