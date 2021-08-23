package Tree.BInaryHeap;

public class BinaryHeap {

    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size) {
        this.sizeOfTree = 0;
        arr = new int[size + 1];
        System.out.println("Array Binary Heap has been created wti the size of: " + size + 1);

        //Time Complexity = O(1)
        //Space Complexity = O(N)
    }

    boolean isEmpty() {
        return sizeOfTree == 0;
    }

    //Peek of Heap root
    Integer peek() {
        if (isEmpty()) {
            System.out.println("Binary heap is empty");
            return null;
        }

        return arr[1];

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Size of heap.. the number of items in the heap
    int sizeOfHeap() {
        return sizeOfTree;
    }

    //Level order Traversal
    void levelOrderTraversal() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        //Time Complexity = O(N)
        //Space Complexity = O(1)
    }

    // Heapify or Insert
    void heapifyBottomToTop(int index, String heapType) {
        int parent = index / 2;//----> O(1)
        if (index <= 1) {
            return;//----> O(1)
        }
        if (heapType.equals("Min")) {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];//----> O(1)
                arr[index] = arr[parent];//----> O(1)
                arr[parent] = temp;//----> O(1)
            }
        } else if (heapType.equals("Max")) {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];//----> O(1)
                arr[index] = arr[parent];//----> O(1)
                arr[parent] = temp;//----> O(1)
            }
        }

        heapifyBottomToTop(parent, heapType);//----> O(LogN)

        //Time Complexity = O(LogN)
        //Space Complexity = O(LogN)
    }

    void insert(int value, String heapType) {
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, heapType);
        System.out.println("Inserted: " + value + " is successfully inserted");

        //Time Complexity = O(LogN)
        //Space Complexity = O(LogN)
    }

    void heapifyTopToBottom(int index, String heapType) {
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {
            return;
        }
        if (heapType.equals("Max")) {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }

                if (arr[index] < arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        } else if (heapType.equals("Min")) {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
            } else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }

                if (arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }

        heapifyTopToBottom(swapChild, heapType);

        //Time Complexity = O(LogN)
        //Space Complexity = O(LogN)
    }

    int extractHeadOfHeap(String heapType) {
        if (isEmpty()) {
            return -1;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
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
