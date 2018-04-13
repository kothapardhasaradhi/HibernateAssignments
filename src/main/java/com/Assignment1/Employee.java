package com.Assignment1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	int employeeID;
	String employeeName; 
	String employeeBand;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeBand() {
		return employeeBand;
	}
	public void setEmployeeBand(String employeeBand) {
		this.employeeBand = employeeBand;
	}
	
	
}
