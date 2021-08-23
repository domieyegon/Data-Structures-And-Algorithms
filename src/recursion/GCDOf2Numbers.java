package recursion;

public class GCDOf2Numbers {

    //CGD is the largest positive number  without a remainder
    //Euclidean algorithm

    public static int gcd(int a,int b) {

        if (a < 0 || b < 0) {
            return -1;
        }

        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) {

        int result = gcd(2,-1);
        System.out.println(result);
    }
}
