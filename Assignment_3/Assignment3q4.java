/*Write a program in Java to define a class Rectangle having data members:
length & breadth, and three methods called read(), calculate() and display() to
read the values of length & breadth, calculate the area and perimeter of the
rectangle and display the result respectively. Finally, create two objects of the
Rectangle class, ask and input the respective dimensions (length,breadth) from
the user, and then calculate and display their respective areas and perimeters.
Input: Mention length and breadth

Output: Display Area of Rectangle and Perimeter of rectangle. */

import java.util.Scanner;

class rectangle {
    int length;
    int breadth;
    int area;
    int perimeter;

    public void read() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        length = sc.nextInt();
        System.out.println("Enter the breath:");
        breadth = sc.nextInt();
        sc.close();
    }

    public void calculate() {
        area = length * breadth;
        perimeter = (length + breadth) * 2;

    }

    public void display() {
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+ perimeter);
    }

}

public class Assignment3q4 {
    public static void main(String[] args) {
        rectangle rx = new rectangle();
        rx.read();
        rx.calculate();
        rx.display();
    }
}
