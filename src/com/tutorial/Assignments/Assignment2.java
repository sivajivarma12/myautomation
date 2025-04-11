package com.tutorial.Assignments;

public class Assignment2 {

	public static void main(String[] args) {
		
		String studentsRecord [ ] [ ] [ ] = {
				{
					//[000] [001] [002]
					{"sem1","Mathematics1","Pass(78)"},
					//[010] [011] [012]
			        {"sem1","Physics","Pass(85)"},
			        //[020] [021] [022]
			        {"sem1","Chemistry","Fail(21)"},
			        //[030] [031] [032]
			        {"sem1","Computer Programming","Pass(74)"},
			        {"sem1","Engineering Drawing","Pass(88)"},
			        {"sem1","Basic Electrical Eng","Pass(79)"} 
				},
				{
					//[100] [101] [102]
					{"sem2","MathematicsII","Pass(82)"},
					//[110] [111] [112]
					{"sem2","Mechanics","Pass(77)"},
					//[120] [121] [122]
					{"sem2","Environmental Sc","Pass(93)"},
			    	{"sem2","Basic Electronics","Fail(19)"},
			    	{"sem2","Engineering Physics","Fail(24)"},
			    	{"sem2","Eng Graphics","Pass(90)"}
				},
				{
			    	  {"sem3","Data Structures","Pass(88)"},
			    	  {"sem3","Discrete Mathematics","Pass(81)"},
			    	  {"sem3","Digital Electronic","Pass(76)"},
			    	  {"sem3","Operating System","Fail(32)"},
			    	  {"sem3","Signals and Systems","Pass(85)"},
			    	  {"sem3","Object oritented Prog","Pass(78)"}
				  },
				  {
			    	  {"sem4","Algorithms","Pass(91)"},
			    	  {"sem4","Computer Networks","Pass(73)"},
			    	  {"sem4","Database Systems","Fail(19)"},
			    	  {"sem4","Microprocessors","Pass(80)"},
			    	  {"sem4","Communication Engineer","Pass(76)"},
			    	  {"sem4","Software Engineering","Pass(87)"}
				  },
				  {
					  {"sem5","Probability & stat","Pass(86)"},
					  {"sem5","Machine learning","Pass(88)"},
					  {"sem5","Compiler Design","Pass(84)"},
					  {"sem5","theary of Computation","Pass(95)"},
					  {"sem5","Embeded System","Pass(73)"},
					  {"sem5","Computer Granphics","Pass(90)"}
				  },
				};
		System.out.println("Semester 2 Subject 4 is"+studentsRecord[1][3][1] +" and subject 5 is "+studentsRecord[1][4][1]);
        System.out.println("Semester 4 Subject 3 marks status "+studentsRecord[3][2][2]+" and Semester 4 Subject 6 mark status "+studentsRecord[3][5][2]);    		
		
     	}

}
