package com.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.beans.DataHolder;
import com.tutorial.beans.EmployeeRepository;
import com.tutorial.beans.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	EmployeeRepository repo;
	
	@RequestMapping("/getuserbyemail")
	public List<DataHolder> getUserByEmail(String email){
		
		return repo.findAllDataByEmail(email);
	}
	
	@RequestMapping("/getapp")
	public Map<String,String> getApp(){
		
		Map<String,String> res= new HashMap();
		res.put("name", "eureka-client-1");
		
		return res;
		
		
	}

}
