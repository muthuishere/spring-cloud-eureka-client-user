package com.tutorial;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tutorial.beans.Employee;
import com.tutorial.beans.EmployeeRepository;
import com.tutorial.beans.User;
import com.tutorial.beans.UserRepository;

@SpringBootApplication
public class SpringCloudEurekaClientUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientUserApplication.class, args);
	}
	
	@Autowired
	UserRepository userrepo;
	
	@Autowired
	EmployeeRepository employeerepo;
	
	
	@Bean
	InitializingBean initDb() {
		
		return () -> {
			userrepo.save(new User("a@ar.com","userA","City-X"));
			userrepo.save(new User("b@ar.com","userB","City-Y"));
			
			employeerepo.save(new Employee("a@ar.com", "Manager", "Company-Y"));
			employeerepo.save(new Employee("b@ar.com", "Architect", "Company-Y"));
			
		};
	}
	
}
