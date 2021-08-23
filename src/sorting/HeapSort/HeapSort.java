package sorting.HeapSort;

public class HeapSort {

    int[] arr = null;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    void sort() {
        BinaryHeap binaryHeap = new BinaryHeap(arr.length);//----------> O(1)
        for (int value : arr) {//--------------------------------------> O(N)
            binaryHeap.insert(value);//--------------------------------> O(Log N)
        }

        for (int i = 0; i < arr.length; i++) {//------------------------> O(N)
            arr[i] = binaryHeap.extractHeadOfHeap();//--------------------------------------> O(Log N)
        }

        //Time Complexity = O(N Log N)
        //Space Complexity = O(N)
    }

    void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }
}
