import java.util.Scanner;
import factorial.FactorialCalculator;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            long factorial = FactorialCalculator.fact(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        scanner.close();
    }
}
