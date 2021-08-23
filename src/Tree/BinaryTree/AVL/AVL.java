package Tree.BinaryTree.AVL;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {

    BinaryNode root;

    public AVL() {
        this.root = null;
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
    void search(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();// -------> O(1)
        queue.add(root);// -------> O(1)
        while (!queue.isEmpty()) {// -------> O(N)
            BinaryNode presentNode = queue.remove();// -------> O(1)
            if (presentNode.value == value) {
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

    //getHeight
    int getHeight(BinaryNode node) {

        if (node == null) {
            return 0;
        }

        return node.height;
    }

    private BinaryNode rotateRight(BinaryNode disBalanceNode) {
        BinaryNode newRootNode = disBalanceNode.left;
        disBalanceNode.left = disBalanceNode.left.right;
        newRootNode.right = disBalanceNode;
        disBalanceNode.height = 1 + Math.max(getHeight(disBalanceNode.left), getHeight(disBalanceNode.right));
        newRootNode.height = 1 + Math.max(getHeight(newRootNode.left), getHeight(newRootNode.right));
        return newRootNode;
    }

    private BinaryNode rotateLeft(BinaryNode disBalanceNode) {
        BinaryNode newRootNode = disBalanceNode.right;
        disBalanceNode.right = disBalanceNode.right.left;
        newRootNode.left = disBalanceNode;
        disBalanceNode.height = 1 + Math.max(getHeight(disBalanceNode.left), getHeight(disBalanceNode.right));
        newRootNode.height = 1 + Math.max(getHeight(newRootNode.left), getHeight(newRootNode.right));
        return newRootNode;
    }

    //getBalance
    int getBalance(BinaryNode node) {
        if (node == null) {
            return 0;
        }

        return getHeight(node.left) - getHeight(node.right);
    }

    //Insert node
    private BinaryNode insertNode(BinaryNode node, int nodeValue) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (nodeValue < node.value) {
            node.left = insertNode(node.left, nodeValue);
        } else {
            node.right = insertNode(node.right, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        if (balance > 1 && nodeValue < node.left.value) {
            return rotateRight(node);
        }

        if (balance > 1 && nodeValue > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && nodeValue > node.right.value) {
            return rotateLeft(node);
        }

        if (balance < -1 && nodeValue < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    void insert(int value) {
        root = insertNode(root, value);
    }

    //Minimum node
    private BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        }
        return minimumNode(root.left);
    }

    //delete Node
    BinaryNode deleteNode(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value not found in AVL");
            return null;
        }

        if (value < node.value) {
            node.left = deleteNode(node.left, value);
        }else if (value > node.value) {
            node.right = deleteNode(node.right, value);
        }else {
            if (node.left !=null && node.right != null) {
                BinaryNode temp = node;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right, minNodeForRight.value);
            } else if (node.left != null) {
                node = node.left;
            }else if (node.right != null) {
                node = node.right;
            } else {
                node = null;
            }
        }

        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateRight(node);
        }

        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return  rotateRight(node);
        }

        if (balance < -1 && getBalance(node.right) <= 0) {
            return  rotateLeft(node);
        }

        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return  rotateLeft(node);
        }

        return node;

    }

    void delete(int value) {
        root = deleteNode(root, value);
    }

    void deleteAVL() {
        root = null;
        System.out.println("AVL Tree Deleted!!");
    }

}

