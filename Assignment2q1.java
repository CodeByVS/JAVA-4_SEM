/*A. Write a program in java to ask the user to enter three numbers.
a. Next, write conditions to check whether the entered numbers are integers.
i. If any of the input numbers are not integers, then the program
should print “Enter valid integer inputs,”
ii. Else the program needs to find out the largest among the three
numbers and print the output: “The largest number among the
input integers is: <the_number_returned_by_the_program>”*/

import java.util.*;

public class Assignment2q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b, c;
        System.out.println("Enter 1st integer variable:");
        a = sc.nextLine();
        System.out.println("Enter 2nd integer variable:");
        b = sc.nextLine();
        System.out.println("Enter 3rd integer variable:");
        c = sc.nextLine();
        boolean flag = true;

        try {
            Integer.parseInt(a);
            System.out.println(a + " is a valid integer");
        } catch (NumberFormatException e) {
            System.out.println(a + " is not a valid integer");
            flag = false;
        }
        try {
            Integer.parseInt(b);
            System.out.println(b + " is a valid integer");
        } catch (NumberFormatException e) {
            System.out.println(b + " is not a valid integer");
            flag = false;
        }
        try {
            Integer.parseInt(c);
            System.out.println(c + " is a valid integer");
        } catch (NumberFormatException e) {
            System.out.println(c + " is not a valid integer");
            flag = false;
        }

        if (flag) {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            int z = Integer.parseInt(c);
            int largest = Integer.MIN_VALUE;
            if (x > largest) {
                largest = x;
            }
            if (y > largest) {
                largest = y;
            }
            if (z > largest) {
                largest = z;
            }
            System.out.println("Largest value is " + largest);
        } else {
            System.out.println("Enter valid integer inputs");
        }
        sc.close();

    }
}
