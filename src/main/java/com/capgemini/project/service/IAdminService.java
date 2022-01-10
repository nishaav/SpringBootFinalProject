package com.capgemini.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.project.dao.AdminRepository;
import com.capgemini.project.model.Admin;

@Service
public class IAdminService {

	@Autowired
	AdminRepository adminRepository;
	
	public String loginAdmin(String adminName,String adminPass)
	{
		List<Admin> adminList=adminRepository.findByLogin(adminName, adminPass);
		if(adminList.size()==1)
		{
			return "success";
		}
		else
		{
			return "fail";
		}
	}
	
}
