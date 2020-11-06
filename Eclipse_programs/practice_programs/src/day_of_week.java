/*
 Q- Write a program to find day of week from its corresponding Number
 
 */
public class day_of_week {

	public static void main(String[] args) {
		
		int day = 4;
		switch(day)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default :
				System.out.println("Entered Number is not between 1-7");
		}
		
	}

}
