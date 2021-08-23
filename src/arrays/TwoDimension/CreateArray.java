package arrays.TwoDimension;

import java.util.Arrays;

public class CreateArray {

    public static void main(String[] args) {

        //1. Declare
        int[][] array;//---------------------------------------> O(1)

        //2. Instantiate
        array= new int[2][2];//--------------------------------> O(1)

        //3. Initialize //------------------------------------ALL init-----> O(mn) <----m=rows, n=columns
        array[0][0] = 1;//--------------------------------------> O(1)
        array[0][1] = 2;//--------------------------------------> O(1)
        array[1][0] = 3;//--------------------------------------> O(1)
        array[1][1] = 4;//--------------------------------------> O(1)
        System.out.println(Arrays.deepToString(array));

        //Combined
        String[][] arr = {{"a","b"}, {"c", "d"}};;//--------------------------------------> O(1)

        System.out.println(Arrays.deepToString(arr));

        //SpaceComplexity = O(mn)

    }
}
