package sorting.SelectionSort;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {//-------------------->O(N)
            int minIndex = j;//------------------------------------->O(1)
            for (int i = j+1; i < arr.length; i++) {//--------------->O(N)
                if (arr[i] < arr[minIndex]) {//---------------------->O(1)
                    minIndex = i;//---------------------------------->O(1)
                }
            }
            if (minIndex !=j) {
                int temp = arr[j];//---------------------------------->O(1)
                arr[j] = arr[minIndex];//----------------------------->O(1)
                arr[minIndex] = temp;//------------------------------->O(1)
            }
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
