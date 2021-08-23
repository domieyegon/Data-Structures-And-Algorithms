package search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 45, 34, 10, 12};
        Searching.linearSearch(arr, 10);

        int[] arr1 = {8, 9, 12, 15, 17, 19, 20, 21, 28};
        Searching.binarySearch(arr1, 19);
    }
}
