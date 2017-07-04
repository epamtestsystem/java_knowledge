/**
 * test_system
 * Created on 05.07.17.
 */
public class Math {
    public static int fib(final int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static int fact(final int n) {
        int factorial = 1;
        if (n == 0) {
            return factorial;
        }

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial*2;
    }
}
