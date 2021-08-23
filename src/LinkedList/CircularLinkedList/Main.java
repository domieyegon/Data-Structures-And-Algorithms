package LinkedList.CircularLinkedList;

public class Main {

    public static void main(String[] args) {

        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        //Create
        System.out.println("Create CircularSinglyLinkedList");
        circularSinglyLinkedList.create(5);
        System.out.println(circularSinglyLinkedList.head.value);
        System.out.println();

        //Insert
        System.out.println("Insert nodes");
        circularSinglyLinkedList.insert(12, 1);
        circularSinglyLinkedList.insert(22, 2);
        circularSinglyLinkedList.insert(87, 3);
        circularSinglyLinkedList.insert(23, 6);
        System.out.println(circularSinglyLinkedList.head.value);
        System.out.println(circularSinglyLinkedList.head.next.value);
        System.out.println();

        //Traverse
        System.out.println("Traverse nodes");
        circularSinglyLinkedList.traverse();
        System.out.println("\n");

        //Search
        System.out.println("Search for a node");
        circularSinglyLinkedList.search(22);
        System.out.println();

        //Delete
        System.out.println("Delete a node");
        circularSinglyLinkedList.delete(23);
        circularSinglyLinkedList.traverse();
        System.out.println();


        //Delete
        System.out.println("Delete all nodes");
        circularSinglyLinkedList.deleteAll();
        circularSinglyLinkedList.traverse();
        System.out.println();

    }
}
