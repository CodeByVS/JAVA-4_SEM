//Write a program in java to ask three different users to enter their:
//a. Name
//b. roll no
//c. section,
//d. and branch
//Followed by printing the details of each user in separate lines.


import java.util.Scanner;

public class Assignment1q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for user " + i + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Section: ");
            String section = scanner.nextLine();

            System.out.print("Branch: ");
            String branch = scanner.nextLine();

            // Print user details in a formatted way
            System.out.println("User " + i + " Details:");
            System.out.println("Name:         " + name);
            System.out.println("Roll No:      " + rollNo);
            System.out.println("Section:      " + section);
            System.out.println("Branch:       " + branch);
        }

        scanner.close();
    }
}
