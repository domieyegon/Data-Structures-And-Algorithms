package bigO;

public class PairsOfUnOrderedArrayElements {

    static void pairs(int[] array) {

        for (int i = 0; i< array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                System.out.println(array[i] + "" + array[j]);
            }
        }
    }

    //Time Complexity = O(N^2)

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        pairs(arr);

    }
}
