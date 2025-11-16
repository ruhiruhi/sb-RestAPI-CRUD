package com.codehunt.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
    private long id;
	
	private String name;
	
	private String address;
	
	private double salary;
	
	private String date;
	
}
