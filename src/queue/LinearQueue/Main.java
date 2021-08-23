package queue.LinearQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Create Queue");
        Queue queue = new Queue(5);
        System.out.println();

        //Is full
        System.out.println("Is Full");
        System.out.println("Is Full: "+queue.isFull());
        System.out.println();

        //Is Empty
        System.out.println("Is Empty");
        System.out.println("Is Empty: "+queue.isEmpty());
        System.out.println();

        //Enqueue -- Insert elements to the queue
        System.out.println(" Insert elements to the queue");
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        System.out.println();

        //Dequeue- Remove the first element from the queue
        System.out.println("Remove the first element from the queue");
        queue.deQueue();
        queue.deQueue();
        System.out.println();

        //Peek- Return the first element
        System.out.println("Return the first element");
        queue.peek();
        System.out.println();

        //DeleteQueue- Delete the entire queue
        System.out.println("Delete the entire queue");
        queue.deleteQueue();
        System.out.println();
    }
}
