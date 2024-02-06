/*Write a program in Java that asks the user to enter ten numbers from the
command line and print both the count and corresponding numbers from each
bracket (even and odd) among the input numbers. The program should handle
the conditions where the user may input any non-integer input. */

import java.util.*;
public class Assignment2q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0;
        int odd=0;
        int[] arr;
        arr = new int[10];
        String[] brr;
        brr = new String[10];
        for(int i=0;i<10;i++){
            brr[i]=sc.nextLine();
            arr[i]=Integer.parseInt(brr[i]);
            try {
                Integer.parseInt(brr[i]);
                System.out.println(brr[i] + " is a valid integer");
            } catch (NumberFormatException e) {
                System.out.println(brr[i] + "is not a valid integer");
            }
            if(arr[i] % 2==0){
                even++;
            }else{
                odd++;
            }

        }
        System.out.println("EVEN: " +even );
        System.out.println("ODD: "+ odd);
        sc.close();
    }
    
}
