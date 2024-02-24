/*Write a java program that asks the user to enter the size of an array. Next,
create an array of specific size input by the user, followed by asking the user
to input the array’s contents through the command line. Finally, the program
must sort the user-entered list of numbers and output the sorted array entries. */

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr;
        System.out.println("Enter a value for array size:");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the contents of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }

}
