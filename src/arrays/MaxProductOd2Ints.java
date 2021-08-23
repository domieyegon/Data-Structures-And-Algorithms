package arrays;

public class MaxProductOd2Ints {

    static String maxProduct(int[] array) {
        int maxProduct = 0;
        String pairs = "";
        for (int i=0; i< array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
               if (array[i] * array[j] > maxProduct) {
                  maxProduct = array[i] * array[j];
                  pairs = array[i] + ", "+ array[j] + " = "+ maxProduct;
               }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {100,200,3000,400,500,600,700, 800,900};

        String result = maxProduct(arr);

        System.out.println(result);
    }
}
