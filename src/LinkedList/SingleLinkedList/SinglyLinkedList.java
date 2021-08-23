package LinkedList.SingleLinkedList;

public class SinglyLinkedList {

    public Node head;

    public Node tail;

    public int size;

    public Node createSinglyLinkedList(int nodeValue) {

        head = new Node(); //-------------> O(1)
        Node node = new Node(); //--------> O(1)
        node.next = null; //--------------> O(1)
        node.value = nodeValue; //--------> O(1)
        head = node; //-------------------> O(1)
        tail = node; //-------------------> O(1)
        size = 1; //----------------------> O(1)
        return head;

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();//--------------------> O(1)
        node.value = nodeValue;//--------------------> O(1)
        if (head == null) {
            //Create linked list
            createSinglyLinkedList(nodeValue);//-----> O(1)
            return;
        } else if (location == 0) {
            //insert the node to first position
            node.next = head;//----------------------> O(1)
            head = node;//---------------------------> O(1)
        } else if (location >= size) {
            //insert the node to last position
            node.next = null;//----------------------> O(1)
            tail.next = node;//----------------------> O(1)
            tail = node;//---------------------------> O(1)
        } else {
            //insert the node to any position
            Node tempNode = head;//-----------------> O(1)
            int index = 0;//------------------------> O(1)
            while (index < location - 1) {//--------> O(n)
                tempNode = tempNode.next;//---------> O(1)
                index++;//--------------------------> O(1)
            }

            Node nextNode = tempNode.next;//--------> O(1)
            tempNode.next = node;//-----------------> O(1)
            node.next = nextNode;//-----------------> O(1)
        }
        size++;//-----------------------------------> O(1)

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void travers() {
        if (head == null) {
            System.out.println("No elements in the list");//--------> O(1)
        } else {

            Node tempNode = head;//---------------------------------> O(1)
            for (int i = 0; i < size; i++) {//----------------------> O(n)
                System.out.print(tempNode.value);//-----------------> O(1)
                if (i != size - 1) {
                    System.out.print(" -> ");//---------------------> O(1)
                }
                tempNode = tempNode.next;//-------------------------> O(1)
            }
        }

        System.out.println("\n");//---------------------------------> O(1)

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public boolean search(int nodeValue) {
        if (head == null) {
            System.out.println("No elements in the list");//---------------------> O(1)
        } else {
            Node tempNode = head;//-----------------------------------------------> O(1)
            for (int i = 0; i < size; i++) {//------------------------------------> O(n)
                if (tempNode.value == nodeValue) {//------------------------------> O(1)
                    System.out.println("Node found at location: " + i);//---------> O(1)
                    return true;
                }
                tempNode = tempNode.next;//---------------------------------------> O(1)
            }
        }

        System.out.println("Node not found!");//-----------------------------------> O(1)
        return false;

        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void delete(int location) {
        if (head == null) {
            System.out.println("No elements in the list");//---------------------> O(1)
        } else if(location == 0) {
            head = head.next;//---------------------------------------------------> O(1)
            size--;//-------------------------------------------------------------> O(1)

            if (size == 0) {
                tail = null;//----------------------------------------------------> O(1)
            }
        } else if (location >= size) {
            Node tempNode= head;//-------------------------------------------------> O(1)
            for (int i=0; i< size-1; i++) {//--------------------------------------> O(n)
                tempNode = tempNode.next;//----------------------------------------> O(1)
            }
            if ( tempNode == head) {
                tail=head=null;//--------------------------------------------------> O(1)
                size--;//----------------------------------------------------------> O(1)
                return;
            }
            tempNode.next = null;//------------------------------------------------> O(1)
            tail = tempNode;//-----------------------------------------------------> O(1)
            size--;//--------------------------------------------------------------> O(1)
        } else  {
            Node tempNode = head;//------------------------------------------------> O(1)
            for (int i =0; i < location-1; i++) {//--------------------------------> O(n)
                tempNode = tempNode.next;//----------------------------------------> O(1)
            }
            tempNode.next = tempNode.next.next;//----------------------------------> O(1)
            size--;//--------------------------------------------------------------> O(1)
        }
        //Time Complexity = O(n)
        //Space Complexity = O(1)
    }

    public void deleteAll() {
        head = null;//------------------------------------------------------------------> O(1)
        tail = null;//------------------------------------------------------------------> O(1)
        System.out.println("All the nodes deleted successfully");//---------------------> O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }
}
