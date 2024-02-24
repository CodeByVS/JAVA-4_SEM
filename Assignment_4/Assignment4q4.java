
/*Write a class Account containing acc_no, balance as data members and two
methods as input() for taking input from user and disp() method to display the
details. Create a subclass Person which has name and aadhar_no as extra data
members and override disp() function. Write the complete program to take and
print details of three persons.

Input: Enter details of three persons.
Output: Display details of three persons. */

import java.util.Scanner;

class Account {
    int acc_no;
    int balance;

    public void input(Scanner sc) {
        System.out.println("Enter the account number:");
        this.acc_no = sc.nextInt();
        System.out.println("Enter the balance:");
        this.balance = sc.nextInt();
    }

    public void disp() {
        System.out.println("Account no:" + this.acc_no);
        System.out.println("Balance:" + this.balance);
    }

}

class Person extends Account {
    String name;
    long aadhar_no;

    public void input(Scanner sc) {
        sc.nextLine();
        System.out.println("Enter the Name of person:");
        this.name = sc.nextLine();
        System.out.println("Enter the aadhar no:");
        this.aadhar_no = sc.nextLong();
    }

    public void disp() {
        System.out.println("Name:" + this.name);
        System.out.println("Aadhar no:" + this.aadhar_no);
    }

}

public class Assignment4q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of three persons:");


        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        account1.input(sc);
        person1.input(sc);
        account2.input(sc);
        person2.input(sc);
        account3.input(sc);
        person3.input(sc);
        
        

        System.out.println("\nDetails of Person 1:");
        account1.disp();
        person1.disp();
        System.out.println("\nDetails of Person 2:");
        account2.disp();
        person2.disp();
        System.out.println("\nDetails of Person 3:");
        account3.disp();
        person3.disp();
        
        sc.close();
    }

}
