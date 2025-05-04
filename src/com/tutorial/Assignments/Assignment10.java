package com.tutorial.Assignments;

public class Assignment10 {

	public static void main(String[] args) {
		int a[]= {12,34,11,36,87,98,93};
		int temp=0;
		
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
        System.out.println("seccond value : "+a[a.length-2]+"thrid largest value : "+a[a.length-3]);
	}

}
