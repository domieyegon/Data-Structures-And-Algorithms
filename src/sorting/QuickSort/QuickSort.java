package sorting.QuickSort;

public class QuickSort {


    static int partition(int[] array, int start, int end) {
        int pivot = end;//---------------------------------O(1)
        int i= start -1;//---------------------------------O(1)
        for (int j = start; j <= end; j++) {//---------------------------------O(N)
            if (array[j] <= array[pivot]) {//---------------------------------O(1)
                i++;
                int temp = array[i];//---------------------------------O(1)
                array[i] = array[j];//---------------------------------O(1)
                array[j] = temp;//---------------------------------O(1)
            }
        }

        return i;//---------------------------------O(1)

        //Time Complexity = O(N)
    }

    static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);//----------------O(N)
            quickSort(array, start, pivot-1);//----------------O(N/2)
            quickSort(array, pivot+1, end);//----------------O(N/2)
        }

        //Time Complexity = O(N Log N)
        //Space Complexity = O(N)
    }

    static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }
}
