package recursion;

public class SumOfDigitsOfPositiveInt {

    public static int sumOfDigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {

        int result = sumOfDigits(89);
        System.out.println(result);

    }
}
