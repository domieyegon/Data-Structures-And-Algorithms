package bigO;

import java.util.Arrays;

public class ReverseArray {

    static void reverse(int[] array) {
        for (int i=0; i < array.length/2; i++) { //----> O(n/2) ----> O(n)

            int lastIndex = array.length-i-1;//--------> O(1)

            int temp = array[i];//---------------------> O(1)

            array[i] = array[lastIndex];//-------------> O(1)

            array[lastIndex] = temp;//-----------------> O(1)

        }

        System.out.println(Arrays.toString(array));//---> O(1)
    }

    //Time Complex = O(N)

    public static void main(String[] args) {


        int[] arr = {100,200,300,400,500};

        reverse(arr);

    }
}
