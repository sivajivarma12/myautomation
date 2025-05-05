package com.tutorial.Assignments;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
       int value;
		
		for(int i=number;i>0;i--)
		{
			value=5;
			for (int j=i; j>1 ;j--)
			{
				System.out.print(" ");
				--value;
			}
			for(int k=1;k<=value;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<number;i++)
		{
			value=5;
			for(int space=i;space>=1;space--)
			{	
				System.out.print(" ");
				--value;
			}
			for(int k=1;k<=value;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
