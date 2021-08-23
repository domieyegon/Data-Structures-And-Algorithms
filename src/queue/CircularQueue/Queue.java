package queue.CircularQueue;

public class Queue {

    int[] arr;
    int beginningOfQueue;
    int topOfQueue;
    int size;

    public Queue(int size) {
        this.arr = new int[size];//------------------------------------------------------------------>O(1)
        this.size = size;//-------------------------------------------------------------------------->O(1)
        this.topOfQueue = -1;//---------------------------------------------------------------------->O(1)
        this.beginningOfQueue = -1;//---------------------------------------------------------------->O(1)
        System.out.println("A circular queue has been created with the size of: " + size);//---------->O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(N)
    }

    //Is empty
    boolean isEmpty() {
        return beginningOfQueue == -1;//---------->O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Is Full
    boolean isFull() {
        return topOfQueue + 1 == beginningOfQueue || beginningOfQueue == 0 && topOfQueue + 1 == size;//---------->O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Enqueue
    void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full!");//---------->O(1)
        } else if (isEmpty()) {
            beginningOfQueue = 0;//---------->O(1)
            topOfQueue++;//---------->O(1)
            arr[topOfQueue] = value;//---------->O(1)
            System.out.println(value + " has been inserted to the queue");//---------->O(1)
        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;//---------->O(1)
            } else {
                topOfQueue++;//---------->O(1)
            }

            arr[topOfQueue] = value;//---------->O(1)
            System.out.println(value + " has been inserted to the queue");//---------->O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //deQueue
    void deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!!");//---------->O(1)
        } else {
            int result = arr[beginningOfQueue];//---------->O(1)
            arr[beginningOfQueue] = 0;//---------->O(1)
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;//---------->O(1)
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;//---------->O(1)
            } else {
                beginningOfQueue++;//---------->O(1)
            }

            System.out.println(result + " has been removed from the queue");//---------->O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Peek
    void peek() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!!");//---------->O(1)
        } else {
            System.out.println("The first item in the queue is: " + arr[beginningOfQueue]);//---------->O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    void delete() {
        arr = null;//---------->O(1)
        topOfQueue = -1;
        beginningOfQueue = -1;//---------->O(1)
        System.out.println("The Queue has been deleted!!");//---------->O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
        //Space Complexity = O(1)
    }
}
