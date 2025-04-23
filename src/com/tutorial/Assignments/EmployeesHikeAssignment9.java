package com.tutorial.Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesHikeAssignment9 {
	
	public Map<String, List<Double>> Employee()
	{
		//store employee 1 data
		List<Double> employee1details = new ArrayList<Double>();
		employee1details.add(75000.0);
		employee1details.add(5.1);
		employee1details.add(4.2);
		//store employee 2 data
		List<Double> employee2details = new ArrayList<Double>();
		employee2details.add(68000.0);
		employee2details.add(3.2);
		employee2details.add(3.8);
		//store employee 3 data
		List<Double> employee3details = new ArrayList<Double>();
		employee3details.add(82000.0);
		employee3details.add(7.1);
		employee3details.add(4.5);
		//store employee 4 data
		List<Double> employee4details = new ArrayList<Double>();
		employee4details.add(90000.0);
		employee4details.add(10.2);
		employee4details.add(2.5);
		//store employee 5 data
		List<Double> employee5details = new ArrayList<Double>();
		employee5details.add(60000.0);
		employee5details.add(2.4);
		employee5details.add(3.5);
		
		//store entire data in maps
		Map<String,List<Double>> employeeDetails = new HashMap<String,List<Double>>();
		
		employeeDetails.put("Alice Johnson", employee1details);
		employeeDetails.put("Bob Smith", employee2details);
		employeeDetails.put("Carol Davis", employee3details);
		employeeDetails.put("David Brown", employee4details);
		employeeDetails.put("Eva Green", employee5details);
		
		return employeeDetails;
	}
}
