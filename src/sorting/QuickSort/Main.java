package sorting.QuickSort;

public class Main {
    public static void main(String[] args) {


        int[] arr = {10, 3, 2, 5, 8, 4, 1, 7, 9, 6};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        QuickSort.printArray(arr);
    }
}
