package com.capgemini.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.project.model.Admin;



public interface AdminRepository extends CrudRepository<Admin,Integer>
{
	List<Admin> findByAdminName(String AdminName);
	
	@Query("from Admin where AdminName=?1 and AdminPassword=?2")
	List<Admin> findByLogin(String AdminName,String AdminPassword);
}
