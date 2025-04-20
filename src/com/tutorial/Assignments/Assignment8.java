package com.tutorial.Assignments;

import java.util.ArrayList;
import java.util.List;


public class Assignment8 {

			
	    
		
			
	public static void main(String[] args) {

		//variable Intialiase
				int totalSupi=0,totalDebitTranAmount=0,totalCreditTranAmount=0,totalDebitCount=0,totalCreditCount = 0,finalAmount=0;
		
		//List of transaction adding to list
		List<Integer> transaction = new ArrayList<Integer>();
		transaction.add(50000);
		transaction.add(-2000);
		transaction.add(3000);
		transaction.add(-15000);
		transaction.add(-200);
		transaction.add(-300);
		transaction.add(4000);
		transaction.add(-3000);
				
		
		for(int i=0; i<transaction.size();i++)
		{	
			//check credit transcation amount only
			if(transaction.get(i)>0)
			{
				totalCreditTranAmount += transaction.get(i);
				++totalCreditCount;
			}	
			else 
			{
				totalDebitTranAmount += transaction.get(i);
				++totalDebitCount;	
			}
			
			finalAmount += transaction.get(i);
			
			//check suspicious credit and debit transaction
			if(transaction.get(i)>=10000 || transaction.get(i)<= -10000 )
			{	
				System.out.println("Suspicious credit/ debit Transaction with Amount "+transaction.get(i));
		        ++totalSupi;  
		        
			}
		}
		
		System.out.println("Total credit Amount : "+totalCreditTranAmount+" credit transaction count:"+totalCreditCount);
		System.out.println("Total debited Amount : "+Math.abs(totalDebitTranAmount)+" debit transaction count:"+totalDebitCount);
		System.out.println("total remaining amount : "+finalAmount);
		System.out.println("Total count of Suspicious "+totalSupi);
		System.out.println("total number of transactions "+transaction.size());
	}

}
