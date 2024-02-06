/*Write a program in java using roll, name, and cgpa as data members to input
the details of n students, followed by displaying their values. Next, display the
name of the student having the lowest cgpa.
Input: Enter Roll No, Name and cgpa of n number of students.
Output: Display the details of n number of students. Also display the
name of student with lowest cgpa */

import java.util.Scanner;

public class Assignment3q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the total no. of student:");
        n = sc.nextInt();
        int[] roll;
        roll = new int[n+1];
        String[] name;
        name = new String[n+1];
        double[] cgpa;
        cgpa = new double[n+1];
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the roll no. of " + i + " Student");
            roll[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name of " + i + " Student");
            name[i] = sc.nextLine();
            System.out.println("Enter the cgpa of " + i + " Student");
            cgpa[i] = sc.nextDouble();
        }
        double lowest = Double.MAX_VALUE;
        String xname="";
        for (int i = 1; i <= n; i++) {
            System.out.println("Roll no. of " + i + " student:" + roll[i]);
            System.out.println("Name of " + i + " student:" + name[i]);
            System.out.println("Cgpa of " + i + " student:" + cgpa[i]);
            if (lowest > cgpa[i]) {
                lowest = cgpa[i];
                xname = name[i];
            }
        }
        System.out.println("Name of student optain Lowest cgpa: " + xname);
        System.out.println("Cgpa of student: " + lowest);
        sc.close();
    }

}
