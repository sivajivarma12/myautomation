package conditionalStatements;

public class SwitchCaseConditionalStatements {

	public static void main(String[] args) {
		
		String day = "Friday";
		
		switch(day) {
		
		case "Monday":
			System.out.println("Today is Weekday");
			break;
		case "Tuesday":
			System.out.println("Today is Weekday");
			break;
		case "Wednesday":
			System.out.println("Today is Weekday");
			break;
		case "Thursday":
			System.out.println("Today is Weekday");
			break;
		case "Friday":
			System.out.println("Today is TGIF");
			break;
		case "Saturday":
			System.out.println("Today is Weekend");
			break;
		case "Sunday":
			System.out.println("Today is Weekend");
			break;
		default:
			System.out.println("Invalid day");
	
		}
		
		
//		int priority = 1;
//		
//		switch (priority) {
//		case 1:
//			System.out.println("High");
//			break;
//		}

	}

}
