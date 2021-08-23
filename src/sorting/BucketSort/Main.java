package sorting.BucketSort;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 3, 2, 5, 8, 4, 1, 7, 9, 6};
        BucketSort bucketSort = new BucketSort(arr);
        bucketSort.printArray(arr);
        bucketSort.bucketSort();
        bucketSort.printArray(arr);
    }
}
