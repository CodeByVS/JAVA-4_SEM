//Write a program in Java that asks the user to enter his/her first name and last
//name as input and then print both in one line in the following format: the last
//name followed by the first name.

import java.util.Scanner;
public class Assignment1q2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Print the last name followed by a comma, a space, and the first name
        System.out.println(lastName + ", " + firstName);
        scanner.close();
    }
}
