package Tree.BinaryTree.LinkedList;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        System.out.println("Insert a Node");
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


        //Preorder Traversal
        System.out.println("Preorder Traversal");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("\n");


        //Inorder Traversal
        System.out.println("Inorder Traversal");
        binaryTree.inorder(binaryTree.root);
        System.out.println("\n");

        //Post Order Traversal
        System.out.println("Post Order Traversal");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("\n");

        //Level Order Traversal
        System.out.println("Level Order Traversal");
        binaryTree.levelOrder();
        System.out.println("\n");

        //Search
        System.out.println("Search");
        binaryTree.search("N5");
        System.out.println("\n");

        //Deepest Node
        System.out.println("Deepest Node");
        System.out.println("Deepest Node = "+binaryTree.getDeepestNode().value);
        System.out.println("\n");

        //Delete Deepest Node
        System.out.println("Delete Deepest Node");
        binaryTree.deleteDeepestNode();
        binaryTree.levelOrder();
        System.out.println("\n");

        //Delete Specific Node Node
        System.out.println("Delete specific Node Node");
        binaryTree.deleteGivenNode("N3");
        binaryTree.levelOrder();
        System.out.println("\n");


        //Delete Binary Tree
        System.out.println("Delete Binary Tree");
        binaryTree.deleteBinaryTree();
        System.out.println("\n");





    }
}
