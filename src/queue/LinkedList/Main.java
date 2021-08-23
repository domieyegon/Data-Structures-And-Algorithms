package queue.LinkedList;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();

        //Is Empty
        System.out.println("IS EMPTY");
        System.out.println("Is Empty: "+ queue.isEmpty());;
        System.out.println();

        //enQueue
        System.out.println("enQueue");
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        System.out.println();

        //deQueue
        System.out.println("deQueue");
        queue.deQueue();
        System.out.println();

        //peek
        System.out.println("peek");
        queue.peek();
        System.out.println();

        //delete
        System.out.println("delete");
        queue.delete();
        System.out.println();
    }
}
