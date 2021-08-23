package LinkedList.CircularDoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        //Create
        System.out.println("Create circularDoublyLinkedList");
        circularDoublyLinkedList.create(5);
        System.out.println(circularDoublyLinkedList.head.value);
        System.out.println();

        //Insert
        System.out.println("Insert nodes");
        circularDoublyLinkedList.insert(12, 1);
        circularDoublyLinkedList.insert(22, 2);
        circularDoublyLinkedList.insert(87, 3);
        circularDoublyLinkedList.insert(23, 6);
        System.out.println(circularDoublyLinkedList.head.value);
        System.out.println(circularDoublyLinkedList.head.next.value);
        System.out.println();

        //Traverse
        System.out.println("Traverse nodes");
        circularDoublyLinkedList.traverse();
        System.out.println("\n");


        //Reverse Traverse
        System.out.println("Reverse Traverse nodes");
        circularDoublyLinkedList.reverseTraverse();
        System.out.println("\n");

        //Search
        System.out.println("Search for a node");
        circularDoublyLinkedList.search(23);
        System.out.println();

        //Delete
        System.out.println("Delete a node");
        circularDoublyLinkedList.delete(3);
        circularDoublyLinkedList.traverse();
        System.out.println();


        //Delete
        System.out.println("Delete all nodes");
        circularDoublyLinkedList.deleteAll();
        circularDoublyLinkedList.traverse();
        System.out.println();

    }
}
