package _00509_fibonacci_number;

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    public static int fib(int N) {
        if (N <= 1) return N;

        int a = 0;
        int b = 1;
        while (--N > 0) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}
