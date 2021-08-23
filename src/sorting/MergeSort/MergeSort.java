package sorting.MergeSort;

public class MergeSort {

    //Merge Method
    static void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex) {
        int[] leftTempArr = new int[middleIndex - leftIndex + 2];
        int[] rightTempArr = new int[rightIndex - middleIndex + 1];

        //Copy elements from arr to leftTempArr;
        for (int i = 0; i <= middleIndex - leftIndex; i++) {
            leftTempArr[i] = arr[leftIndex + i];
        }


        //Copy elements from arr to rightTempArr;
        for (int i = 0; i < rightIndex - middleIndex; i++) {
            rightTempArr[i] = arr[middleIndex + 1 + i];
        }

        leftTempArr[middleIndex - leftIndex + 1] = Integer.MAX_VALUE;
        rightTempArr[rightIndex - middleIndex] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = leftIndex; k <= rightIndex; k++) {
            if (leftTempArr[i] < rightTempArr[j]) {
                arr[k] = leftTempArr[i];
                i++;
            } else {
                arr[k] = rightTempArr[j];
                j++;
            }

        }
    }

    static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (rightIndex > leftIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(arr, leftIndex, middleIndex);
            mergeSort(arr, middleIndex + 1, rightIndex);

            merge(arr, leftIndex, middleIndex, rightIndex);
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
