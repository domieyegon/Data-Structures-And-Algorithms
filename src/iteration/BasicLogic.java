package iteration;

public class BasicLogic {

    static void iterativeMethod(int n) {
         while (n < 4) {
             System.out.println(n + " Is less than 4");
             n = n + 1;
         }

        System.out.println( n);

    }

    public static void main(String[] args) {
        iterativeMethod(1);
    }
}
