package LinkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node create(int nodeValue) {

        head = new Node();//-----------O(1)

        Node node = new Node();//------O(1)
        node.value = nodeValue;//------O(1)
        head = node;//-----------------O(1)
        tail = node;//-----------------O(1)
        node.next = node;//------------O(1)
        node.prev = node;//------------O(1)
        size = 1;//--------------------O(1)
        return head;//-----------------O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    public void insert(int nodeValue, int location) {

        Node node = new Node(); //-------------------> O(1)
        node.value = nodeValue; //-------------------> O(1)

        if (head == null) {
            create(nodeValue); //-------------------> O(1)
        } else if (location == 0) {
            node.prev = tail; //-------------------> O(1)
            node.next = head; //-------------------> O(1)
            head.prev = node; //-------------------> O(1)
            head = node; //-------------------> O(1)
            tail.next = node; //-------------------> O(1)
            size++; //-------------------> O(1)
        } else if (location >= size) {
            node.next = head; //-------------------> O(1)
            node.prev = tail; //-------------------> O(1)
            head.prev = node; //-------------------> O(1)
            tail.next = node; //-------------------> O(1)
            tail = node; //-------------------> O(1)
            size++; //-------------------> O(1)
        } else {
            Node tempNode = head; //-------------------> O(1)
            int index = 0; //-------------------> O(1)
            while (index < location - 1) { //-------------------> O(n)
                tempNode = tempNode.next; //-------------------> O(1)
                index++; //-------------------> O(1)
            }
            node.prev = tempNode; //-------------------> O(1)
            node.next = tempNode.next; //-------------------> O(1)
            tempNode.next = node; //-------------------> O(1)
            node.next.prev = node; //-------------------> O(1)
            size++; //-------------------> O(1)
        }

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void traverse() {
        if (head != null) {//-------------------> O(1)
            Node tempNode = head;//--------------> O(1)
            for (int i = 0; i < size; i++) {//-------------------> O(n)
                System.out.print(tempNode.value);//-------------------> O(1)
                if (i < size - 1) {//-------------------> O(1)
                    System.out.print(" -> ");//-------------------> O(1)
                }
                tempNode = tempNode.next;//-------------------> O(1)
            }
        } else {
            System.out.println("The DLL does not exist!");
        }

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void reverseTraverse() {

        if (head == null) {
            System.out.println("The DLL does not exist!");//-------------------> O(1)
        } else {
            Node tempNode = tail;//-------------------> O(1)
            for (int i = 0; i < size; i++) {//-------------------> O(n)
                System.out.print(tempNode.value);//-------------------> O(1)
                if (i != size - 1) {//-------------------> O(1)
                    System.out.print(" <- ");//-------------------> O(1)
                }
                tempNode = tempNode.prev;//-------------------> O(1)
            }
        }

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void search(int nodeValue) {
        if (head == null) {
            System.out.println("The DLL does not exist!");//-------------------> O(1)
            return;
        } else {
            Node tempNode = head;//-------------------> O(1)
            for (int i = 0; i < size; i++) {//-------------------> O(n)
                if (tempNode.value == nodeValue) {
                    System.out.println(nodeValue + " was found at the index of: " + i);//-------------------> O(1)
                    return;//-------------------> O(1)
                }
                tempNode = tempNode.next;//-------------------> O(1)
            }
        }

        System.out.println("This value does not exist in the list");//-------------------> O(1)

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void delete(int location) {

        if (head == null) {
            System.out.println("The DLL does not exist!");//-------------------> O(1)
        } else if (location == 0) {
            if (size == 1) {
                head.prev = null;//-------------------> O(1)
                head.next = null;//-------------------> O(1)
                head = null;//-------------------> O(1)
                tail = null;//-------------------> O(1)
                size--;//-------------------> O(1)
                return;
            }
            head = head.next;//-------------------> O(1)
            head.prev = tail;//-------------------> O(1)
            tail.next = head;
            size--;//-------------------> O(1)
        } else if (location >= size) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = null;//-------------------> O(1)
                tail = null;//-------------------> O(1)
                size--;//-------------------> O(1)
                return;
            }
            tail = tail.prev;//-------------------> O(1)
            tail.next = head;//-------------------> O(1)
            head.prev = tail;//-------------------> O(1)
            size--;//-------------------> O(1)
        } else {
            Node tempNode = head;//-------------------> O(1)
            for (int i = 0; i < location-1 ; i++) {//-------------------> O(n)
                tempNode = tempNode.next;//-------------------> O(1)
            }
            tempNode.next = tempNode.next.next;//-------------------> O(1)
            tempNode.next.prev = tempNode;//-------------------> O(1)
            size--;//-------------------> O(1)
        }

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void deleteAll() {
        if (head == null) {
            System.out.println("The DLL does not exist!");//-------------------> O(1)
        } else  {
            Node tempNode = head;//-------------------> O(1)
            for (int i =0; i< size; i++) {//-------------------> O(n)
                tempNode.prev = null;//-------------------> O(1)
                tempNode = tempNode.next;//-------------------> O(1)
            }
            head = null;//-------------------> O(1)
            tail = null;//-------------------> O(1)
            size = 0;//-------------------> O(1)
            System.out.println("The DLL has be deleted!");//-------------------> O(1)
        }

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

}
