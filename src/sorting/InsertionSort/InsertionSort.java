package sorting.InsertionSort;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { //-------------------->O(N)
            int temp = arr[i], j = i;//------------------------------>O(1)
            while (j > 0 && arr[j - 1] > temp) {//------------------->O(N)
                arr[j] = arr[j - 1];//------------------------------->O(1)
                j--;//----------------------------------------------->O(1)
            }

            arr[j] = temp;//--------------------------------->O(1)
        }

        //Time Complexity = O(N^2)
        //Space Complexity = O(1)
    }

    static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }
}
