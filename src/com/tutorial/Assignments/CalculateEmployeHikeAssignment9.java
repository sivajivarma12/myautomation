package com.tutorial.Assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CalculateEmployeHikeAssignment9 {

	int Bonus=0;
	double variablepay=0.0d,HikedSalary=0.0d;
	
	public static void main(String[] args) {
	
		//create a object to get employees data
		EmployeesHikeAssignment9 obj1 = new EmployeesHikeAssignment9();
		
		//call method to get employee details
		Map<String, List<Double>> employeeDetails = obj1.Employee();
		
		//Store all the keys for iteration
		Set<String> names = employeeDetails.keySet();
		
		//Store final data after hikesalary 
		Map<String,Double> AfterHike = new HashMap<String, Double>();
		
		//ready all the values for each employee
		for(String name : names) 
		{
		 double BaseSalary = employeeDetails.get(name).get(0);
		 double experience = employeeDetails.get(name).get(1);
		 double Rating = employeeDetails.get(name).get(2);
		 CalculateEmployeHikeAssignment9 obj2 =new CalculateEmployeHikeAssignment9();
		 double SalaryAfterHike = obj2.CalucateHike(BaseSalary, experience, Rating);
		 AfterHike.put(name, SalaryAfterHike);
		}
		
		System.out.println(AfterHike);
		//print hike salary for all the employee
	/*	for(String name : names) 
		{
		 System.out.println("Emaployee name : "+name+" Hiked salary : "+AfterHike.get(name));
		}
      */  
		 
	}
   
	//method to calculate and return new hike value
	public double CalucateHike(double BaseSalary,double experience,double Rating)
	{
		if(Rating >=4)
		{
			Bonus=1500;
			variablepay=15.0d;
			//HikedSalary = (BaseSalary+(BaseSalary*variablepay))+Bonus;
			//System.out.println("Hiked salary" +HikedSalary);
			
		}	
		else if(Rating>=3 && Rating<4)
		{
			Bonus=1200;
			variablepay=10.0d;
			//HikedSalary = (BaseSalary+(BaseSalary*variablepay))+Bonus;
			
			//System.out.println("Hiked salary" +HikedSalary);
		}	
		else
		{
			Bonus=300;
			variablepay=3.0d;
			//HikedSalary = (BaseSalary+(BaseSalary*variablepay))+Bonus;
			//System.out.println("Hiked salary" +HikedSalary);
		}
		
		HikedSalary = (BaseSalary+(BaseSalary*variablepay))+Bonus;
		if(experience>=5.0)
		{	
			HikedSalary +=5000.0;
		//System.out.println("Hiked salary" +HikedSalary);
		}
		
		//HikedSalary = (BaseSalary+(BaseSalary*variablepay))+Bonus;
		double HikedPer = ((HikedSalary/BaseSalary));
		
		return HikedPer;
	}
}
