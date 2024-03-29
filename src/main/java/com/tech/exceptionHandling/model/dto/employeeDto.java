package com.tech.exceptionHandling.model.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class employeeDto {

	@NotBlank(message = "Name should not be null")
	@Length(min = 3, message = "Name Should be contain min 3 letters")
	@Length(max = 15, message = "Name Should be contain max 15 letters")
	private String EmployeeName;
	@NotNull(message = "Employee salary should not null ")
	@Min(value = 5, message = "Number should contian min 10 numbers")
	private int EployeeSalary;
	@NotBlank(message = "Employee working location should not  be null")
	@Length(min = 3, message = "Name Should be contain min 3 letters")
	@Length(max = 25, message = "Name Should be contain max 25 letters")
	private String Location;

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
