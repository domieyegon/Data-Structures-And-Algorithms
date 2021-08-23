package recursion;

public class Fibonacci {

    private int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return n;
        }

        System.out.println("n = " + n + " call: " + fibonacci(n - 1) + " And: " + fibonacci(n - 2));

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        int rec = fibonacci.fibonacci(8);

        System.out.println(rec);

    }
}
