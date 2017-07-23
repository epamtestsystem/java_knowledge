/**
 * test_system
 * Created on 05.07.17.
 */
public class Math {
    public static int fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
