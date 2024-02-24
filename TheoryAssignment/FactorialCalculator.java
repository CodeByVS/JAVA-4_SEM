package factorial;

public class FactorialCalculator {

    public static long fact(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else {
            return n * fact(n - 1);
        }
    }
}

