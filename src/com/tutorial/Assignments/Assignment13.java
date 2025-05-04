package com.tutorial.Assignments;

public class Assignment13 {

	public static void main(String[] args) {
     
	 int verifyPrimeNumber=19,primeflag=0;
	 
	 if(verifyPrimeNumber==1)
	 {
		 System.out.println("1 is a prime number");
	 }	 
	 else
	 {
		 for(int i=1;i<=verifyPrimeNumber;i++)
		 {
			 if(verifyPrimeNumber%i==0)
			 {
				++primeflag;
			 } 
		 }
	 }
	 if(primeflag>=3)
	 {
		 System.out.println(verifyPrimeNumber+" not a prime number");
	 }
	 else
		 System.out.println(verifyPrimeNumber+" is a prime number");
	}
}
