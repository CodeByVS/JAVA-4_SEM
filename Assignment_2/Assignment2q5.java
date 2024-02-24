
import java.util.*;

public class Assignment2q5 {
    public static void main(String args[]) {
        int array[][] = new int[3][3];
        System.out.println("Enter 9 elements of the 3*3 matrix:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int left = 0, right = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    left += array[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                if ((i == j) && (i != 0) && (i != 2) || (i - j) == 2 || (i - j) == -2) {
                    right += array[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal elements: " + left);
        System.out.println("Sum of right diagonal elements: " + right);
        sc.close();
    }
}
