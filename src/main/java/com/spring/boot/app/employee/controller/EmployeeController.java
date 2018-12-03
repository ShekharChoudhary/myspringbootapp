package com.spring.boot.app.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.app.employee.Employee;
import com.spring.boot.app.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	/*
	 * Here RequestMethod.GET is the default method so we dont need to specify it.
	 */
	@RequestMapping(method=RequestMethod.GET, value="/employee")
	public List<Employee> getAllEmployeeDetails(){
		
		return employeeService.getAllEmployees();
	}
	/*
	 * If we want to use different variable name then we can use it this way
	@RequestMapping("/employee/{temp}")
	public Employee getTheEmployee(@PathVariable("temp") int id){
	*/
	@RequestMapping("/employee/{id}")
	public Employee getTheEmployee(@PathVariable int id){	
		return employeeService.getTheEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employee")
	public void addANewEmployee(@RequestBody Employee employee){
		employeeService.addANewEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
	public void updateAnEmployee(@RequestBody Employee employee, @PathVariable int id){
		employeeService.updateAnEmployee(employee,id);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="employee/{id}")
	public void deleteAnEmployee(@PathVariable int id){
		employeeService.deleteAnEmployee(id);
	}
	
}
