//Write a program in Java that first asks the user to input any number, followed by
//checking if the number entered by the user is a palindrome or not. If the number is
//a palindrome, then output the message “Palindrome successfully detected” or else
//“The input number is not a palindrome” on the console.

import java.util.Scanner;

public class Assignment1q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int d;
        int rev = 0;
        int num1=num;
        while (num > 0) {
            d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }
        if (num1 == rev) {
            System.out.println("Palindrome successfully detected");
        } else {
            System.out.println("The input number is not a palindrome");
        }

        scanner.close();
    }
}
