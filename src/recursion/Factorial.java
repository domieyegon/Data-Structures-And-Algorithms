package recursion;

public class Factorial {

    public static int factorial(int n) {

        if (n < 0) {
            return -1;
        }

        if(n ==0 || n == 1) {
            return 1;
        } else {
            System.out.println(n);
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        int factorial = factorial(7);
        System.out.println("Factorial = " + factorial);
    }
}
