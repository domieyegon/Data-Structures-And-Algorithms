package Tree.BinaryTree.Array;

public class Main {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(9);
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");
        System.out.println("\n");

        //PreOrder Traversal
        System.out.println("PreOrder Traversal");
        binaryTree.preorder(1);
        System.out.println("\n");

        //InOrder Traversal
        System.out.println("InOrder Traversal");
        binaryTree.inOrder(1);
        System.out.println("\n");

        //Post Order Traversal
        System.out.println("Post Order Traversal");
        binaryTree.postOrder(1);
        System.out.println("\n");

        //Post Order Traversal
        System.out.println("Level Order Traversal");
        binaryTree.levelOrder();
        System.out.println("\n");

        //Search for value
        System.out.println("Search for an item");
        binaryTree.search("N9");
        System.out.println("\n");


        //Deepest Node
        System.out.println("Deepest Node");
        System.out.println(binaryTree.getDeepestNode());
        System.out.println("\n");

        //Delete Node
        System.out.println("Delete Node");
        binaryTree.delete("N5");
        binaryTree.levelOrder();
        System.out.println("\n");

        //Delete Tree
        System.out.println("Delete Tree");
        binaryTree.deleteBT();
        System.out.println("\n");

    }
}
