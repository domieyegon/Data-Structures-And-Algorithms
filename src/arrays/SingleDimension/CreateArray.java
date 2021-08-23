package arrays.SingleDimension;

import java.util.Arrays;

public class CreateArray {

    public static void main(String[] args) {

        int[] arr; //declare
        arr = new int[3]; //instantiate with a size 3
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));

        //All together
        String[] array = {"a", "b", "c"};
        System.out.println(Arrays.toString(array));
    }
}
