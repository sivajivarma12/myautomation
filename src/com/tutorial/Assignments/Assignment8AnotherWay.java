package com.tutorial.Assignments;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment8AnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> creditAoumtList = new ArrayList<Integer>();
		List<Integer> DebtAoumtList = new ArrayList<Integer>();
		
		creditAoumtList.add(50000);
		DebtAoumtList.add(-2000);
		creditAoumtList.add(3000);
		DebtAoumtList.add(-15000);
		DebtAoumtList.add(-200);
		DebtAoumtList.add(-300);
		creditAoumtList.add(4000);
		DebtAoumtList.add(-3000);
		
		Map<String, List<Integer>> creditValues = new HashMap<String, List<Integer>>();
	   	creditValues.put("Credit", creditAoumtList);
	   	
	   	Map<String, List<Integer>> DebtValues = new HashMap<String, List<Integer>>();
	   	DebtValues.put("Debit", DebtAoumtList);
	   	
	   	List<Map<String,List<Integer>>> finalList = new ArrayList<Map<String,List<Integer>>>(); 
	   	finalList.add(DebtValues);
	   	finalList.add(creditValues);
	   	
	   	int creditAmount=0,debitAmount=0;
	   	int suspicious=0;
	   	
	   	for (int amount : finalList.get(1).get("Credit"))
	   	{
	   		creditAmount +=amount;
	   		if(amount>=10000)
	   			++suspicious;
	   			
	   	}	
	   	for (int amount : finalList.get(0).get("Debit"))
	   	{	
	   		debitAmount +=amount;
	   		if(amount<=-10000)
	   			++suspicious;
	   	}
	   	
        System.out.println("Total transaction count : "+(DebtAoumtList.size()+creditAoumtList.size()));
        System.out.println("Total credit count :" +creditAoumtList.size());
        System.out.println("Total Debt count :" +DebtAoumtList.size());
        System.out.println("Total amount count :" +(creditAmount+debitAmount));
        System.out.println("Total credit amount :"+creditAmount+" and total debt amount: "+Math.abs(debitAmount));
        System.out.println("suspicious transaction count "+suspicious);
	}
}