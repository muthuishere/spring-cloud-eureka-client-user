package com.tutorial.beans;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	@Query("SELECT "
			+ "new com.tutorial.beans.DataHolder("
			+ " u.email,u.name,u.city,e.designation,e.organization)"
			+ "	 from User u,Employee e where e.email=u.email AND e.email= :email")
	List<DataHolder> findAllDataByEmail(@Param("email") String email);
}
