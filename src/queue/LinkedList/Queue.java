package queue.LinkedList;

public class Queue {

    LinkedList linkedList;

    public Queue() {
        linkedList = new LinkedList();
        System.out.println("The Queue has been Created");
    }

    //isEmpty
    boolean isEmpty() {
        return linkedList.head == null;//-----------> O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //enQueue
    void enQueue(int value) {
        linkedList.insertInLinkedList(value, linkedList.size);//-----------> O(1)
        System.out.println(value + " has been inserted to the queue");//---> O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //deQueue
    void deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");//---------------------------------> O(1)
        } else {
            int result = linkedList.head.value;//----------------------------------------> O(1)
            linkedList.delete(0);//---------------------------------------------> O(1)
            System.out.println(result + " has been deleted from the queue");//-----------> O(1)

        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //peek
    void peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty");//-------------------------------------------------> O(1)
        } else {
            System.out.println("The first element in the queue is: "+linkedList.head.value);//-----------> O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //delete
    void delete() {
        linkedList.head = null;//--------------------------------------> O(1)
        linkedList.tail = null;//--------------------------------------> O(1)
        linkedList.size = 0;//-----------------------------------------> O(1)
        System.out.println("The queue has been deleted!");//-----------> O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

}
