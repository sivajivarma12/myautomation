package com.tutorial.Assignments;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assignmnet 15
		
		String sentence = "Java programming is fun and challenging";
		String []sentenceWords = sentence.split(" ");
		
		//Count the total number of words in the sentence.
		System.out.println("word count of the sentence : "+sentenceWords.length);
        
		//Print the sentence words in reverse order.
		for (int i=sentenceWords.length-1 ; i>=0 ; i--)
			System.out.print(sentenceWords[i]+" ");
		
		System.out.println();
		System.out.println("-----------------------------------");
		
		//first letter capital
		for(int i=0;i<sentenceWords.length;i++)
		{
			for(int j=0 ; j<sentenceWords[i].length();j++)
			{
			  if(j==0)
			  {	
				System.out.print(sentenceWords[i].toUpperCase().charAt(0));
			  }
			  else
			  {
				 System.out.print(sentenceWords[i].charAt(j)); 
			  }
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");	
		
		//Assignment 16
		
		int count =0;
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String []paragraphWords = paragraph.split(" ");
		
		//Print count and Indexes of the word
		System.out.print("Java word index at : ");
		for(int i=0;i<paragraphWords.length;i++)
		{
			if(paragraphWords[i].equals("Java"))
			{
				++count;
				System.out.print(" "+i);
			}
		}
		System.out.println("");
		//Find total number of occurrences
		System.out.println("toatl java count : "+count);
	
	System.out.println("-------------------------------------------------");

	//assignment 17
	int number=5;
	
	for(int i=1;i<=number;i++)
	{
		for (int j=1; j<=number-i ;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
}
