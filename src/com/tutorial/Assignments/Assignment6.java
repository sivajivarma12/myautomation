package com.tutorial.Assignments;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String []StudentName = {"Suresh","Mahesh","Naresh"};
       int []Marks = {75,80,82};
       float total=0;
       for(int i=0 ;i<Marks.length;i++)
       {
    	Marks[i]+=10;
    	total += Marks[i];
    	System.out.println("StudentName "+StudentName[i] +" : "+Marks[i]);
       }   
       System.out.println("Average Marks :"+total/Marks.length);
	}

}
