package Tree.BInaryHeap;

public class Main {

    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(7);
        binaryHeap.insert(10, "Min");
        binaryHeap.insert(5, "Min");
        binaryHeap.insert(15, "Min");
        binaryHeap.insert(1, "Min");

        System.out.println("Peek = " + binaryHeap.peek());
        binaryHeap.levelOrderTraversal();

        System.out.println(binaryHeap.extractHeadOfHeap("Min"));
        binaryHeap.levelOrderTraversal();

        binaryHeap.delete();
    }
}
