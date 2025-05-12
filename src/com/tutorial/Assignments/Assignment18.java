package com.tutorial.Assignments;

public class Assignment18 {

	public static void main(String[] args) {
		
		String ss = "A man, a plan, a canal: Panama";
		//String ss = "race a car";
		String aa = ss.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
		System.out.println(aa);
		boolean palindorme =false;
	    for(int i=0; i< aa.length()/2 ; i++)
	    {
	    	if(aa.charAt(i) == aa.charAt(aa.length()-i-1))
	    		palindorme =true;
	    	else
	    		palindorme = false;
	    }
	    	
	    if(palindorme)
	    	System.out.println("String is palindorme");
	    else
	    	System.out.println("String is not palindorme");
		
	}

}
