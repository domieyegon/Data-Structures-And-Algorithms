package queue.CircularQueue;

public class Main {

    public static void main(String[] args) {
        //Create a queue
        Queue queue = new Queue(4);
        System.out.println();

        //Is empty
        System.out.println("Is Empty");
        System.out.println("Is Empty: "+ queue.isEmpty());
        System.out.println();

        //Is empty
        System.out.println("Is Full");
        System.out.println("Is Full: "+ queue.isFull());
        System.out.println();

        //enQueue
        System.out.println("enQueue");
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(7);
        System.out.println();

        //deQueue
        System.out.println("deQueue");
        queue.deQueue();
        System.out.println();

        //Peek
        System.out.println("Peek");
        queue.peek();
        System.out.println();

        //delete
        System.out.println("delete");
        queue.delete();
        System.out.println();

    }
}
