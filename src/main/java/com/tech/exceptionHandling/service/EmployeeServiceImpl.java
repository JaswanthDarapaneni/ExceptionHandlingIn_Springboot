package com.tech.exceptionHandling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.exceptionHandling.model.Employee;
import com.tech.exceptionHandling.model.dto.employeeDto;
import com.tech.exceptionHandling.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {
	@Autowired
	private EmployeeRepo EmployeeRepo;

	@Override
	public employeeDto createEmployee(employeeDto employee) {
		// TODO Auto-generated method stub

		Employee emp = EmployeeRepo.save(convertDTOToEMP(employee));
		return convertEmpToDTO(emp);
	}

	private Employee convertDTOToEMP(employeeDto employeeDto) {
		Employee em = new Employee();
		em.setEmployeeName(employeeDto.getEmployeeName());
		em.setEployeeSalary(employeeDto.getEployeeSalary());
		em.setLocation(employeeDto.getLocation());
		return em;
	}

	private employeeDto convertEmpToDTO(Employee employee) {
		employeeDto em = new employeeDto();
		em.setEmployeeName(employee.getEmployeeName());
		em.setEployeeSalary(employee.getEployeeSalary());
		em.setLocation(employee.getLocation());
		return em;
	}

}
