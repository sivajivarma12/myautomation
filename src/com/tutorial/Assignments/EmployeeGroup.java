package com.tutorial.Assignments;

public class EmployeeGroup extends Employee{

	
	public static void main(String[] args) {
		
		EmployeeGroup emp = new EmployeeGroup();
	String[] employee = emp.EmployeesName;
	int[]  emplyeeId = emp.EmployeeID;
  
	System.out.println("Employee Name "+employee[0]);
	System.out.println("Employee ID "+emplyeeId[0]);
	}

}
