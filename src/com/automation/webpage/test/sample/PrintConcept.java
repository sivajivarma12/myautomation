package com.automation.webpage.test.sample;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class PrintConcept {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// Print the content and then go to next line
	       System.out.println("Hello, World!");
	       System.out.println("Hello, Sivaji!");
	       
	       // Print the content and then stay on same line
	       System.out.print("Hello,");
	       System.out.print(" World!");
	       System.out.println();
	       
	       // Print the formated content and then stay on same line
	       System.out.printf("%s is completed Btech, empId is %d and visa status is %b","sivaji",1236,false);
	       System.out.println();
	       
	       // Format the digits and then Print the formated content and then stay on same line
	       System.out.format("Total Bill is %.2f %n",100.935435343);
	       System.out.println();
	       
	       // Join multiple print statements together
	       System.out.append("My Name is sivaji varma").append(", My emp id is 1234");
	       System.out.println();
	       
	       // Print the char based on ASCII value
	       System.out.write(65);
	       System.out.println();
	       
	       // Print Logs of Program
	       Logger log = Logger.getLogger("MyLogger");
	       log.info("Current line is 44");
	       log.warning("There is some warning at line 45, Please check");
	       
	       // Print the errors in print statements
	       System.err.println("ERROR : Expected result is not matching with actual Result");
	       
	       PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationTraining\\src\\File1");
	       writer.println(LocalDateTime.now()+"Currently Line 54 is running");
	       writer.println(LocalDateTime.now()+"Currently Line 55 is running");
	       writer.println(LocalDateTime.now()+"Execution is compled");
	       writer.close();
	       
	       //single line comments which is used to describe the meaning of one line code or method creation purpose
	       /*multi liner comments which is used to describe the meaning in mult liner
	        * that can be done
	        * okk
	        * done*/
	       
	       /**Used for comment with some special tags
	        * @author Sivaji
	        * @Version 23.44
	        * describes the author and owner of the code implementor */
	       
	       System.out.println("comments");
	}

}
