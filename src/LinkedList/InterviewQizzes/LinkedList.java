package LinkedList.InterviewQizzes;

public class LinkedList {

    public Node head;

    public Node tail;

    public int size;


    public void createLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        }
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        tail.next= node;
        tail = node;
        size++;
    }

    public void traverse() {
        Node  tempNode = head;
        for (int i=0; i< size; i++) {
            System.out.print(tempNode.value);
            if (i != size-1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }

        System.out.println("\n");
    }


}
