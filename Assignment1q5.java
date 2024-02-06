/*Using switch..case statement in Java, write a program to print the corresponding
weekday after asking the user first to enter a valid day number of the current
month. */

import java.util.Scanner;

public class Assignment1q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int Value=sc.nextInt();
        switch (Value) {
            case 0:
			System.out.printf("Sunday");
			break;
		case 1:
			System.out.printf("Monday");
			break;
		case 2:
			System.out.printf("Tuesday");
			break;
		case 3:
			System.out.printf("Wednesday");
			break;
		case 4:
			System.out.printf("Thursday");
			break;
		case 5:
			System.out.printf("Friday");
			break;
		case 6:
			System.out.printf("Saturday");
			break;
		default:
			System.out.printf("Please Enter the 0 to 6...");
			break;
        }
        sc.close();
    }
}
