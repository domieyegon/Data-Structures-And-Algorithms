package LinkedList.SingleLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        //Create
        singlyLinkedList.createSinglyLinkedList(5);
        System.out.println(singlyLinkedList.head.value);

        //Insert
        singlyLinkedList.insertInLinkedList(6,1);
        singlyLinkedList.insertInLinkedList(7,2);
        singlyLinkedList.insertInLinkedList(9,3);
        singlyLinkedList.insertInLinkedList(10,4);
        singlyLinkedList.insertInLinkedList(73,5);

        //Traverse
        singlyLinkedList.travers();

        //Search
        singlyLinkedList.search(73);

        //Delete one
        singlyLinkedList.delete(0);
        singlyLinkedList.travers();

        //Delete All
        singlyLinkedList.deleteAll();
    }
}
