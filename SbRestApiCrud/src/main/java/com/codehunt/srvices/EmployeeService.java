package com.codehunt.srvices;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codehunt.dto.EmployeeDto;
import com.codehunt.entities.Employee;
import com.codehunt.repositories.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	private Employee employeeDtoToEmployeeEntity(EmployeeDto employeeDto) {
		
		Employee employee = new Employee();
		
		employee.setId(employeeDto.getId());
		employee.setName(employeeDto.getName());
		employee.setAddress(employeeDto.getAddress());
		employee.setSalary(employeeDto.getSalary());
		employee.setDate(LocalDate.now().toString());
		
		return employee;
	
	}
	
	public Employee saveEmployee(EmployeeDto employeeDto) {
		
		Employee employee = employeeDtoToEmployeeEntity(employeeDto);
		
		return employeeRepo.save(employee);
		
	}

	public List<Employee> readAllData() {
		
		return employeeRepo.findAll();
	}

	public Optional<Employee> readSingleData(Long id) {
		
		return employeeRepo.findById(id);
	}

	public Employee updateAllData(Long id, EmployeeDto employeeDto) {
		
		Optional<Employee> op = employeeRepo.findById(id);
		
		if(op.isPresent()) {
			Employee employee = employeeDtoToEmployeeEntity(employeeDto);
			Employee updated = employeeRepo.save(employee);
			return updated;
		}
		
		return null;
		
	}

	public Employee updatePartialData(Long id, Double salary) {
		
Optional<Employee> op = employeeRepo.findById(id);
		
		if(op.isPresent()) {
			Employee employee = op.get();
			employee.setSalary(salary);
			Employee updated = employeeRepo.save(employee);
			return updated;
		}
		
		return null;
	}
	

	
	
}
