package LinkedList.CircularLinkedList;

public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node create(int nodeValue) {

        head = new Node();//-----------O(1)

        Node node = new Node();//------O(1)
        node.value = nodeValue;//------O(1)
        node.next = node;//------------O(1)
        head = node;//-----------------O(1)
        tail = node;//-----------------O(1)
        size = 1;//--------------------O(1)
        return head;//-----------------O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    public void insert(int nodeValue, int location) {

        Node node = new Node();//------>O(1)
        node.value = nodeValue;//------>O(1)

        //If head is null create
        if (head == null) {
            create(nodeValue);//------------->O(1)
        } else if (location == 0) {
            //insert at the beginning of the list
            node.next = head;//---------------->O(1)
            head = node;//--------------------->O(1)
            tail.next = node;//---------------->O(1)
        } else if (location >= size) {
            //insert at the end of the list
            tail.next = node;//---------------->O(1)
            tail = node;//--------------------->O(1)
            tail.next = head;//---------------->O(1)
        } else {
            Node tempNode = head;//------------->O(1)
            int index = 0;//-------------------->O(1)
            while (index < location - 1) {//------->O(n)
                tempNode = tempNode.next;//------>O(1)
                index++;//----------------------->O(1)
            }

            //new node points to current node.next
            node.next = tempNode.next;//---------->O(1)
            // current node points to the new node
            tempNode.next = node;//--------------->O(1)
        }

        size++;//--------------------------------->O(1)


        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void traverse() {
        if (head == null) {
            System.out.println("List does not exist");//------------------->O(1)
        } else {
            Node tempNode = head;//---------------------------------------->O(1)
            for (int i = 0; i < size; i++) {//-------------------------------->O(n)
                System.out.print(tempNode.value);//------------------------>O(1)
                if (i != size - 1) {
                    System.out.print(" -> ");//---------------------------->O(1)
                }
                tempNode = tempNode.next;//-------------------------------->O(1)
            }
        }
        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void search(int nodeValue) {
        if (head != null) {
            Node tempNode = head;//------------------------------------------->O(1)
            for (int i = 0; i < size; i++) {//----------------------------------->O(n)
                if (tempNode.value == nodeValue) {
                    System.out.println(nodeValue + " Found at index: " + i);//---->O(1)
                    return;
                }
                tempNode = tempNode.next;//----------------------------------->O(1)
            }
        }

        System.out.println("The node does not exist");//---------------------->O(1)

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void delete(int location) {

        if (head == null) {
            System.out.println("The List does not exist");//---------------------->O(1)
            return;
        } else if (location == 0) {
            head = head.next;//----------------------------------------------------->O(1)
            tail.next = head;//----------------------------------------------------->O(1)
            size--;//--------------------------------------------------------------->O(1)
            if (size == 0) {
                tail = null;//------------------------------------------------------->O(1)
                head.next = null;//-------------------------------------------------->O(1)
                head = null;//------------------------------------------------------->O(1)
            }
        } else if (location >= size) {
            Node tempNode = head;//--------------------------------------------------->O(1)
            for (int i = 0; i < size - 1; i++) {//------------------------------------>O(n)
                tempNode = tempNode.next;//------------------------------------------->O(1)
            }

            if (tempNode == head) {
                head.next = null;//--------------------------------------------------->O(1)
                tail = head = null;//------------------------------------------------->O(1)
                size--;//------------------------------------------------------------->O(1)
                return;
            }

            tempNode.next = head;//---------------------------------------------------->O(1)
            tail = tempNode;//--------------------------------------------------------->O(1)
            size--;//------------------------------------------------------------------->O(1)
        } else {
            Node tempNode = head;//------------------------------------------------------>O(1)

            for (int i = 0; i < location - 1; i++) {//--------------------------------------->O(n)
                tempNode = tempNode.next;//----------------------------------------------->O(1)
            }
            tempNode.next = tempNode.next.next;//------------------------------------------>O(1)
            size--;//---------------------------------------------------------------------->O(1)
        }

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void deleteAll() {
        if (head == null) {
            System.out.println("The List does not exist");//----------------------->O(1)
            return;
        } else {
            head = null;//---------------------------------------------------------->O(1)
            tail.next = null;//----------------------------------------------------->O(1)
            tail = null;//---------------------------------------------------------->O(1)

        }

        System.out.println("All nodes were deleted successfully!!!");

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

}
