/*Write a java program that will overload the area() method and display the area
of a circle, triangle, and square as per user choice and user-entered
dimensions.
Input: Mention dimensions like radius, base, height, side

Output: Display area of circle
Display area of triangle
Display area of square */

import java.util.Scanner;
class Area {
    public double area(int radius,double pi) {
        return (pi * radius * radius);
    }

    public int area(int base, int height) {
        return ((base * height)/2);
    }

    public int area(int side) {
        return (side * side);
    }

}


public class Assignment3q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Area a1=new Area();
        System.out.println("Enter the radius of circle:");
        int xrad=sc.nextInt();
        System.out.println("Enter the base of triangle:");
        int xbase=sc.nextInt();
        System.out.println("Enter the height of triangle:");
        int xheight=sc.nextInt();
        System.out.println("Enter the side of square:");
        int xside=sc.nextInt();
        System.out.println("Area of circle:");
        System.out.println(a1.area(xrad, 3.14));
        System.out.println("Area of triangle:");
        System.out.println(a1.area(xbase, xheight));
        System.out.println("Area of square:");
        System.out.println(a1.area(xside));
        sc.close();
    }
}
