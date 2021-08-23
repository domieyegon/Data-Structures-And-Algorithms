package recursion;

public class DecimalToBinary {

    //Step1: Divide a number by 2
    //Step2: Get the integer quotient for the next iteration.
    //Step3: Get the remainder for the binary digit.
    //Step4: Repeat the steps until the quotient is equal to 0.

    //13  to binary
    //13/2 6 rem 1
    //6/2  3 rem 0 110 * 10 + 1 ==1101
    //3/2  1 rem 1 11*10 +0 ==110
    //1/2  0 rem 1 1 * 10 +1 = 11

    static int decimalToBinary(int n) {

        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        return n%2 + 10 * decimalToBinary(n/2);
    }

    public static void main(String[] args) {
        int result = decimalToBinary(10);

        System.out.println(result);
    }
}
