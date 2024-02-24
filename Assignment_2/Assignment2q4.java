/*Write a java program that asks the user to fill an integer array's size and its
entries through the command line. Next, the program must find out the no. of
occurrences of each element in the user-entered array, followed by printing
each array entry along with the number of its occurrences in the array. */

import java.util.Scanner;
public class Assignment2q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr;
        arr=new int[5];
        System.out.println("Enter five integer:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            int count=0;
            for(int j=i+1;j<5;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println("Integer "+ arr[i] +" repeated "+ count +" times");
        }
        sc.close();
    }
}
