
import java.util.Scanner;

public class Assignment2q4x {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER TOTAL NUMBERS TO BE CHECKED -->");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("ENTER NUMBER LIST -->");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    i = j;
                }
            }
            System.out.println("OCCURENCE OF " + arr[i] + " IN THE GIVEN NUMBER LIST --> " + count);
        }

        in.close();
    }
}
