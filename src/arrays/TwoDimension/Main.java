package arrays.TwoDimension;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray sda = new TwoDimensionalArray(2, 2);//------>O(1) Time Complexity = O(1) Space Complexity == O(n)<----Memory is required
        sda.insert(0, 0, 10);
        sda.insert(0, 1, 23);
        sda.insert(1, 0, 12);
        sda.insert(1, 1, 78);
        sda.insert(1, 1, 65);
        sda.insert(2, 3, 90);

//        System.out.println(Arrays.deepToString(sda.array));


        //Access ant element
        sda.accessCell(1,3);

        //Traverse the Array
        sda.traverseArray();

       // Search for an element in the array
        sda.searchElement(78);
//
        //Delete array element
        sda.deleteValue(0,1);
    }
}
