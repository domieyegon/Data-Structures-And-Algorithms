package sorting.BubbleSort;

public class BubbleSort {

    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {//-------------------->O(N)
            for (int j = 0; j < n - i - 1; j++) {//------------>O(N)
                if ( arr[j] > arr[j+1]) {//-------------------->O(1)
                    int temp = arr[j];//-------------------->O(1)
                    arr[j] = arr[j+1];//-------------------->O(1)
                    arr[j+1] = temp;//-------------------->O(1)
                }
            }
        }
        //Time Complexity = O(N^2)
        //Space Complexity = O(1)
    }

    void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }
}
