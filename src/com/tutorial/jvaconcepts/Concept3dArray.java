package com.tutorial.jvaconcepts;

public class Concept3dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num_array [ ] [ ] [ ] = {
	        		{
	        	//[000][001][002][003]		
	        		{10 ,20 ,99,05},
	        	//[010][011][012]	
	        		{30 ,40 ,88}
	        		},
	        		{
	        	//[100][101][102]		
	        		{50 ,60 ,77},
	        	//[110][111][112]	
	        		{80 ,70 ,66}
	        		},
	        		};
	        System.out.println(num_array[0][0][3]);
	}

}
