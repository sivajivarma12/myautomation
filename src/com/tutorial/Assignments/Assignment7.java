package com.tutorial.Assignments;

public class Assignment7 {

	public static void main(String[] args) {
		
	String	customerName = "John Doe";
	int	creditScore = 720;
	float	income = 55000.0f;
	boolean	isEmployed = true;
	float	debtToIncomeRatio = 35.0f;
	
	if(creditScore>750)
	{
		System.out.println(customerName+" Your credit score is above 750 loan is approved!!");
	}
	else if( creditScore<750 && creditScore>650)
	{
		if(income >= 50000.0)
		{
			System.out.println(customerName+" loan is under consideration need to verfiy if customer is employed because income is atleast 50000");
	        if(isEmployed)
	        {
	         if(debtToIncomeRatio<40)
	           System.out.println(customerName+" Loan Approved");	
	         else
	        	 System.out.println(customerName+" Loan declined");
	        }
	        else
	        {
	        	System.out.println(customerName+" loan declined eventhough income is greater than 50000 but he is not employe");
	        }	
		}
		else
		{
			System.out.println(customerName+" income is less than 50000 loan got declined");
		}	
		
	}
	else
	{
		
		System.out.println("loan declined");
	}
	
	}

}
