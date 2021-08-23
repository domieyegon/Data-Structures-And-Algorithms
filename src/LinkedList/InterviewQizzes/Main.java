package LinkedList.InterviewQizzes;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(89);
        linkedList.insertNode(43);
        linkedList.insertNode(12);
        linkedList.insertNode(76);
        linkedList.insertNode(12);
        linkedList.insertNode(98);
        linkedList.traverse();

        //InterView Questions
        Questions questions = new Questions();

        //Delete duplicates
        System.out.println("Delete duplicates");
        questions.deleteDuplicates(linkedList);
        linkedList.traverse();

        //Return the nth element from the last element
        System.out.println("nth to element");
        Node node = questions.nthToLast(linkedList, 4);
        System.out.println(node.value);
        System.out.println();

        //Partition
        System.out.println("Partition");
        LinkedList list = questions.partition(linkedList, 76);
        list.traverse();

        //Sum
        LinkedList llA = new LinkedList();
        llA.insertNode(7);
        llA.insertNode(1);
        llA.insertNode(6);

        LinkedList llB = new LinkedList();
        llB.insertNode(5);
        llB.insertNode(9);
        llB.insertNode(2);

        System.out.println("Sum");
        LinkedList resultList = questions.sumList(llA, llB);
        resultList.traverse();

        //Intersection
        System.out.println("Intersection");
        questions.addSameNode(llA, llB, 7);
        questions.addSameNode(llA, llB, 2);
        questions.addSameNode(llA, llB, 1);
        llA.traverse();
//        llB.traverse();
        Node intersectionNode = questions.findIntersection(llA, llB);
        System.out.println(intersectionNode.value);

    }

}
