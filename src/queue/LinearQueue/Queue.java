package queue.LinearQueue;

public class Queue {
    int[] arr;
    int beginningOfQueue;
    int topOfQueue;

    public Queue(int size) {
        this.arr = new int[size];//-------------------------------------------------->O(1)
        this.beginningOfQueue = -1;//------------------------------------------------>O(1)
        this.topOfQueue = -1;//--------------------------------------------------- -->O(1)
        System.out.println("Queue has been created with the size of: "+size);//------>O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(N)
    }


    boolean isFull() {
        return topOfQueue == arr.length-1;//------>O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }


    boolean isEmpty() {
        return beginningOfQueue == arr.length || beginningOfQueue == -1;//------>O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Add value to the queue
    void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");//---------------------------------------------------------------------------------->O(1)
        } else if (isEmpty()){
            beginningOfQueue = 0;//-------------------------------------------------------------------------------------------------->O(1)
            topOfQueue++;//---------------------------------------------------------------------------------------------------------->O(1)
            arr[topOfQueue] = value;//----------------------------------------------------------------------------------------------->O(1)
            System.out.println("Successfully inserted "+ value+ " to the queue to position: "+topOfQueue+ " |first element");//------>O(1)
        } else {
            topOfQueue++;//----------------------------------------------------------------------------------------------------------->O(1)
            arr[topOfQueue] = value;//------------------------------------------------------------------------------------------------>O(1)
            System.out.println("Successfully inserted "+ value+ " to the queue to position: "+topOfQueue);//-------------------------->O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Remove first item from the queue
    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");//--------------------------------->O(1)
        } else {
            int firstElement = arr[beginningOfQueue];//------------------------------>O(1)
            beginningOfQueue++;//---------------------------------------------------->O(1)
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = -1;//---------------------------------------------->O(1)
                topOfQueue = -1;//---------------------------------------------------->O(1)
            }

            System.out.println(firstElement+ " has be removed from the queue");//------>O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Peek-  Return the first element in  the queue
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");//---------------------------------------------------->O(1)
        } else {
            System.out.println(arr[beginningOfQueue]+ " is the first element in the queue");//---------->O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Delete item from the queue
    void deleteQueue() {
        arr = null;//------------------------------------------------------>O(1)
        topOfQueue = -1;//------------------------------------------------->O(1)
        beginningOfQueue = -1;//-------------------------------------------->O(1)
        System.out.println("The queue is successfully deleted");//---------->O(1)


        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }
}
