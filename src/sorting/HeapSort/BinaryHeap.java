package sorting.HeapSort;

public class BinaryHeap {

    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size) {
        this.sizeOfTree = 0;
        arr = new int[size + 1];
        System.out.println("Array Binary Heap has been created with the size of: " + size + 1);

        //Time Complexity = O(1)
        //Space Complexity = O(N)
    }

    boolean isEmpty() {
        return sizeOfTree == 0;
    }


    //Size of heap.. the number of items in the heap
    int sizeOfHeap() {
        return sizeOfTree;
    }


    // Heapify or Insert
    void heapifyBottomToTop(int index) {
        int parent = index / 2;//----> O(1)
        if (index <= 1) {
            return;//----> O(1)
        }
        if (arr[index] < arr[parent]) {
            int temp = arr[index];//----> O(1)
            arr[index] = arr[parent];//----> O(1)
            arr[parent] = temp;//----> O(1)
        }

        heapifyBottomToTop(parent);//----> O(LogN)

        //Time Complexity = O(LogN)
        //Space Complexity = O(LogN)
    }

    void insert(int value) {
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree);
        System.out.println("Inserted: " + value + " is successfully inserted");

        //Time Complexity = O(LogN)
        //Space Complexity = O(LogN)
    }

    void heapifyTopToBottom(int index) {
        int left  = index*2;
        int right = (index*2)+1;
        int smallestChild = 0;

        if (sizeOfTree < left) { //If there is no child of this node, then nothing to do. Just return.
            return;
        }else if (sizeOfTree == left) { //If there is only left child of this node, then do a comparison and return.
            if(arr[index] > arr[left]) {
                int tmp = arr[index];
                arr[index] = arr[left];
                arr[left] = tmp;
            }
            return;
        }else { //If both children are there
            if(arr[left] < arr[right]) { //Find out the smallest child
                smallestChild = left;
            }else {
                smallestChild = right;
            }
            if(arr[index] > arr[smallestChild]) { //If Parent is greater than smallest child, then swap
                int tmp = arr[index];
                arr[index] = arr[smallestChild];
                arr[smallestChild] = tmp;
            }
        }

        heapifyTopToBottom(smallestChild);

        //Time Complexity = O(LogN)
        //Space Complexity = O(LogN)
    }


    int extractHeadOfHeap() {
        if (isEmpty()) {
            return -1;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1);
            return extractedValue;

            //Time Complexity = O(LogN)
            //Space Complexity = O(LogN)
        }
    }

    void delete() {
        arr = null;
        sizeOfTree = 0;
        System.out.println("Binary Heap deleted!!");
        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

}
