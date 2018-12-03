package com.spring.boot.app.employee;

public class Employee {

	private int empID;
	private String name;
	private String address;
	
	
	public Employee(){
		
	}
	
	public Employee(int empID, String name, String address) {
		super();
		this.empID = empID;
		this.name = name;
		this.address = address;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
