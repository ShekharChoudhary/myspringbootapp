package com.spring.boot.app.employee.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.app.employee.Employee;

@Service
public class EmployeeService {

	private List<Employee> employeeList = new ArrayList<>(Arrays.asList(new Employee(1, "Shekhar", "Pune"),
			new Employee(2, "Bittu", "Patna"),
			new Employee(3, "Joe", "Delhi"),
			new Employee(4, "Samuel", "Mumbai")));

	public List<Employee> getAllEmployees(){
		return employeeList;
	}
	
	public Employee getTheEmployee(int id){
		
		return employeeList.stream().filter(e -> e.getEmpID()==id).findFirst().get();
	}

	public void addANewEmployee(Employee employee) {

		employeeList.add(employee);
	}

	public void updateAnEmployee(Employee employee, int id) {

		for(int i =0;i<employeeList.size();i++){
			if(employeeList.get(i).getEmpID() == id){
				employeeList.set(i, employee);
				return;
			}
		}
	}

	public void deleteAnEmployee(int id) {


		for(int i =0;i<employeeList.size();i++){
			if(employeeList.get(i).getEmpID() == id){
				employeeList.remove(i);
				return;
			}
		}
	}
}
