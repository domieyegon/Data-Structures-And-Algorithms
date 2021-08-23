package arrays;

import java.util.Arrays;

public class PairsOfIntegersWhoseSumEqualsTarget {

    static int[] integerPairs(int[] array, int target) {

        for (int i=0; i< array.length; i++) {
            for (int j=i+1; j < array.length; j++){
                if (array[i]+ array[j]== target){
                    return new int[] {array[i], array[j]};
                }
            }
        }
       throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7, 8,9};

        int[] pairs = integerPairs(arr, 10);

        System.out.println(Arrays.toString(pairs));

    }
}
