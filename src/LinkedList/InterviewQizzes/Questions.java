package LinkedList.InterviewQizzes;

import java.util.HashSet;

public class Questions {

    //Remove duplicates
    void deleteDuplicates(LinkedList linkedList) {
        HashSet<Integer> hashSet = new HashSet<>();
        Node current = linkedList.head;
        Node prev = null;

        while (current != null) {//-----------------------> O (N)
            int currentValue = current.value;
            if (hashSet.contains(currentValue)) {
                prev.next = current.next;
                linkedList.size--;
            } else {
                hashSet.add(currentValue);
                prev = current;
            }
            current = current.next;
        }

        //Time Complexity = O(N)
        //Space Complexity = O(N)
    }

    //Return the nth element from the last element
    Node nthToLast(LinkedList linkedList, int location) {

        Node p1 = linkedList.head;

        Node p2 = linkedList.head;

        //1. Move p2 to to the target location
        for (int i = 0; i < location; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }

        //2. Move p1 and p2 at the same pace
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;

        //Time Complexity = O(N)
        //Space Complexity = O(1)
    }


    //Partition a linked list around a value X, such that all nodes less than X come before all nodes greater than X
    LinkedList partition(LinkedList linkedList, int x) {
        Node currentNode = linkedList.head;
        linkedList.tail = linkedList.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = linkedList.head;
                linkedList.head = currentNode;
            } else {
                linkedList.tail.next = currentNode;
                linkedList.tail = currentNode;
            }

            currentNode = next;
        }

        linkedList.tail.next = null;

        return linkedList;

        //Time Complexity = O(N)
        //Space Complexity = O(1)
    }

    //Sum of 2 number stored in reverse order in a linked list
    //e.g 234 = 4 -> 3 -> 2 && 876 = 6 -> 7 -> 8
    // SUM = 234 + 876 = 1110; outcome list will be 0 -> 1 -> 1 -> 1
    LinkedList sumList(LinkedList listA, LinkedList listB) {
        Node node1 = listA.head;
        Node node2 = listB.head;
        int carry = 0;

        LinkedList resultList = new LinkedList();

        while (node1 != null || node2 != null) {
            int result = carry;
            if (node1 != null) {
                result += node1.value;
                node1 = node1.next;
            }

            if (node2 != null) {
                result += node2.value;
                node2 = node2.next;
            }

            resultList.insertNode(result % 10); //insert the remainder
            carry = result / 10;
        }

        return resultList;
    }

    //Intersection
    //1. Get Kth Node
    Node getKthNode(Node head, int k) {
        Node current = head;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }

        return current;
    }

    //2. Intersection node
    Node findIntersection(LinkedList list1, LinkedList list2) {
        if (list1.head == null || list2.head == null) return null;
        if (list1.tail != list2.tail) return null;

        Node shorter = new Node();
        Node longer = new Node();
        if (list1.size > list2.size) {
            longer = list1.head;
            shorter = list2.head;
        } else {
            longer = list2.head;
            shorter = list1.head;
        }


        longer = getKthNode(longer, Math.abs(list1.size - list2.size));

        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }

        return longer;
    }

    //3. Add same node to 2 different nodes
    void addSameNode(LinkedList list1, LinkedList list2, int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        list1.tail.next = node;
        list1.tail = node;
        list2.tail.next = node;
        list2.tail = node;
        list1.size++;
        list2.size++;
    }


}
