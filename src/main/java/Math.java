/**
 * test_system
 * Created on 05.07.17.
 */
public class Math {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        return (n <= 2) ? 1 : (fib(n - 1) + fib(n - 2));
    }

    public static int fact(int n) {
        return (n != 0) ? (n * fact(n-1)) : 1;
    }
}
