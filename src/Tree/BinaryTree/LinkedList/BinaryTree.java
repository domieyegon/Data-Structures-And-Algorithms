package Tree.BinaryTree.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    BinaryNode root;

    public BinaryTree() {
        this.root = null;
        //Space and Time complexity = O(1)
    }

    //Traverse Binary Tree
    //Preorder Traversal
    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");

        preOrder(node.left);// -------> O(N/2)
        preOrder(node.right);// -------> O(N/2)
        //Space and Time complexity = O(N)
    }


    //Preorder Traversal
    void inorder(BinaryNode node) {
        if (node == null) {
            return;// -------> O(1)
        }
        inorder(node.left);// -------> O(N/2)
        System.out.print(node.value + " ");// -------> O(1)
        inorder(node.right);// -------> O(N/2)

        //Space and Time complexity = O(N)
    }

    //Post Traversal
    void postOrder(BinaryNode node) {
        if (node == null) {
            return;// -------> O(1)
        }

        postOrder(node.left);// -------> O(N/2)
        postOrder(node.right);// -------> O(N/2)
        System.out.print(node.value + " ");// -------> O(1)

        //Space and Time complexity = O(N)
    }

    //Level order Traversal
    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();// -------> O(1)
        queue.add(root);// -------> O(1)
        while (!queue.isEmpty()) {// -------> O(N)
            BinaryNode presentNode = queue.remove();// -------> O(1)
            System.out.print(presentNode.value + " ");// -------> O(1)
            if (presentNode.left != null) {
                queue.add(presentNode.left);// -------> O(1)
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);// -------> O(1)
            }
        }

        //Space and Time complexity = O(N)
    }

    //Search
    void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();// -------> O(1)
        queue.add(root);// -------> O(1)
        while (!queue.isEmpty()) {// -------> O(N)
            BinaryNode presentNode = queue.remove();// -------> O(1)
            if (presentNode.value.equals(value)) {
                System.out.println("The value: " + value + " is found in the tree");// -------> O(1)
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);// -------> O(1)
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);// -------> O(1)
                }
            }
        }
        System.out.println("The value: " + value + " does not exist in the tree");// -------> O(1)

        //Space and Time complexity = O(N)
    }

    //Insert a node to the tree
    void insert(String value) {
        BinaryNode newNode = new BinaryNode();// -------> O(1)
        newNode.value = value;// -------> O(1)
        if (root == null) {
            root = newNode;// -------> O(1)
            System.out.println("Inserted a new Node to Root");// -------> O(1)
            return;// -------> O(1)
        }

        Queue<BinaryNode> queue = new LinkedList<>();// -------> O(1)
        queue.add(root);// -------> O(1)

        while (!queue.isEmpty()) {// -------> O(N)
            BinaryNode presentNode = queue.remove();// -------> O(1)
            if (presentNode.left == null) {
                presentNode.left = newNode;// -------> O(1)
                System.out.println("Inserted a new Node to the left child");// -------> O(1)
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;// -------> O(1)
                System.out.println("Inserted a new Node to the right child");// -------> O(1)
                break;
            } else {
                queue.add(presentNode.left);// -------> O(1)
                queue.add(presentNode.right);// -------> O(1)
            }
        }

        //Space and Time complexity = O(N)
    }

    //Delete a node
    //Get the deepest Node
    BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presetNode = root;
        while (!queue.isEmpty()) {
            presetNode = queue.remove();
            if (presetNode.left != null) {
                queue.add(presetNode.left);
            }
            if (presetNode.right != null) {
                queue.add(presetNode.right);
            }
        }

        return presetNode;
    }

    void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }

            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    void deleteGivenNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();// -------> O(1)
        queue.add(root);// -------> O(1)
        while (!queue.isEmpty()) {// -------> O(N)
            BinaryNode presentNode = queue.remove();// -------> O(1)
            if (presentNode.value.equals(value)) {// -------> O(1)
                presentNode.value = getDeepestNode().value;// -------> O(N)
                deleteDeepestNode();// -------> O(N)
                System.out.println("The Node: "+value+" has been deleted!!");// -------> O(1)
                return;
            } else  {
                if (presentNode.left !=null) queue.add(presentNode.left);// -------> O(1)
                if (presentNode.right !=null) queue.add(presentNode.right);// -------> O(1)
            }
        }

        System.out.println("The node: "+value+ " does not exits in the tree");// -------> O(1)

        //Space and Time complexity = O(N)
    }

    void deleteBinaryTree() {
        root = null;
        System.out.println("Binary Tree deleted!!");
    }

}
