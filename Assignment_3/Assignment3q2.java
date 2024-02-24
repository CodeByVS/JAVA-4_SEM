/*Write a program to overload subtract method with various parameters in a
class in Java. Write the driver class to use the different subtract methods using
objects.
Input: Mention various subtract method having different parameters.
Output: Subtract method will display the result accordingly */

import java.util.Scanner;
class sub {
    public int subtract(int x, int y) {
        return (x - y);
    }

    public int subtract(int x, int y, int z) {
        return (x - y - z);
    }

    public double subtract(double x, double y) {
        return (x - y);
    }

}

public class Assignment3q2 {

    public static void main(String[] args) {
        sub s = new sub();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st integer variable:");
        int x=sc.nextInt();
        System.out.println("Enter 2nd integer variable:");
        int y=sc.nextInt();
        System.out.println("Enter 3rd integer variable:");
        int z=sc.nextInt();
        System.out.println("Enter 1st double variable:");
        double a=sc.nextDouble();
        System.out.println("Enter 2nd double variable:");
        double b=sc.nextDouble();
        System.out.println("Subtract using two integer variable:");
        System.out.println(s.subtract(x, y));
        System.out.println("Subtract using three integer variable:");
        System.out.println(s.subtract(x, y, z));
        System.out.println("Subtract using two double variable:");
        System.out.println(s.subtract(a, b));
        sc.close();
    }
}
