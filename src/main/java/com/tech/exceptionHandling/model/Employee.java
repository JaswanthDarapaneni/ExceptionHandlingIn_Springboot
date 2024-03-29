package com.tech.exceptionHandling.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Document(value = "employee_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	@Id
	@Generated
	private long EmployeeId;

	private String EmployeeName;

	private int EployeeSalary;

	private String Location;
	
	

	public long getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(long employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getEployeeSalary() {
		return EployeeSalary;
	}

	public void setEployeeSalary(int eployeeSalary) {
		EployeeSalary = eployeeSalary;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

}
