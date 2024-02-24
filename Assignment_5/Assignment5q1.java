/*Illustrate the usage of abstract class with following Java classes:
a. An abstract class ‘student’ with two data members roll no, reg no, a method
getinput() and an abstract method course()
b. A subclass ‘kiitian’ with course() method implementation
Write the driver class to print the all details of a kiitian object.
Input: Rollno - 2205180

Registration no - 1234567890

Output: Rollno - 2205180

Registration no - 1234567890
Course - B.Tech. (Computer Science & Engg) */

import java.util.Scanner;

abstract class student {
    int rollno;
    long registration;
    public void getinput(Scanner sc) {
        System.out.println("Enter Roll no. of Student:");
        this.rollno = sc.nextInt();
        System.out.println("Enter Registration number of Student:");
        this.registration = sc.nextLong();
    }

    abstract void course();
}

class kiitian extends student {

    void course(){
        System.out.println("Roll no: "+rollno);
        System.out.println("Registration number: "+registration);
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class Assignment5q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student st = new kiitian();
        st.getinput(sc);
        st.course();
        sc.close();
    }

}
