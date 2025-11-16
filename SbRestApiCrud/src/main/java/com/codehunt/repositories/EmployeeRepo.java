package com.codehunt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codehunt.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	
	
}
