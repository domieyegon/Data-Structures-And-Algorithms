package sorting.HeapSort;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 3, 2, 5, 8, 4, 1, 7, 9, 6};
        HeapSort heapSort = new HeapSort(arr);
        heapSort.sort();
        heapSort.printArray(arr);

    }
}
