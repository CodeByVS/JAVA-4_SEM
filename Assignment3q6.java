/*Write a program in java using constructor overloading concept to calculate the
area of a rectangle having data members as length and breadth. Use default
constructor to initialize the value of the data member to zero and parameterized
constructor to initialize the value of data member according to the user input.

Input: Mention the value of length and breadth
Output: Display the area of the rectangle accordingly. */


import java.util.Scanner;
class rectangle {
    double length, breadth;

    rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

}

public class Assignment3q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int length=sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth=sc.nextInt();
        rectangle r1=new rectangle(length,breadth);
        System.out.println("Area of rectangle: " +r1.area());
        sc.close();
    }
}
