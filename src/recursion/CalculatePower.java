package recursion;

public class CalculatePower {

    public static int power(int base, int exp) {

        if ( exp < 0) {
            return -1;
        }

        if (exp ==0 || exp == 1) {
            return base;
        }

        return base * power(base, exp -1);
    }

    public static void main(String[] args) {

        int result = power(2, -1);

        System.out.println(result);

    }
}
