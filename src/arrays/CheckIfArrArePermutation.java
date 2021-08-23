package arrays;

public class CheckIfArrArePermutation {

    static boolean permutation(int[] array , int[] array2) {

        //Check if both arrays have same length
        if (array.length != array2.length) {
            return false;
        }

        int sum1 = 0, sum2 = 0;
        int mul1=1, mul2 = 1;

        for (int i=0; i< array.length; i++) {
            sum1 +=array[i];
            mul1 *=array[i];

            sum2 +=array2[i];
            mul2 *=array2[i];
        }

        System.out.println(sum1+ " "+sum2);
        System.out.println(mul1+ " "+mul2);

        return sum1 == sum2 && mul1 == mul2;

    }

    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {9,8,7,6,5,4,3,2,1};

        boolean result = permutation(arr, arr2);

        System.out.println(result);
    }
}
