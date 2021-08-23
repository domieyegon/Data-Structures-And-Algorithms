package LinkedList.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        //Create
        System.out.println("Create doublyLinkedList");
        doublyLinkedList.create(5);
        System.out.println(doublyLinkedList.head.value);
        System.out.println();

        //Insert
        System.out.println("Insert nodes");
        doublyLinkedList.insert(12, 1);
        doublyLinkedList.insert(22, 2);
        doublyLinkedList.insert(87, 3);
        doublyLinkedList.insert(23, 6);
        System.out.println(doublyLinkedList.head.value);
        System.out.println(doublyLinkedList.head.next.value);
        System.out.println();

        //Traverse
        System.out.println("Traverse nodes");
        doublyLinkedList.traverse();
        System.out.println("\n");


        //Traverse
        System.out.println("Reverse Traverse nodes");
        doublyLinkedList.reverseTraverse();
        System.out.println("\n");

        //Search
        System.out.println("Search for a node");
        doublyLinkedList.search(23);
        System.out.println();

        //Delete
        System.out.println("Delete a node");
        doublyLinkedList.delete(34);
        doublyLinkedList.traverse();
        System.out.println();


        //Delete
        System.out.println("Delete all nodes");
        doublyLinkedList.deleteAll();
        doublyLinkedList.traverse();
        System.out.println();

    }
}
