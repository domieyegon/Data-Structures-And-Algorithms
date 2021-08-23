package Tree.BinaryTree.Array;

public class BinaryTree {

    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of size: " + size + " has been created!!");

        //Time Complexity = O(1)
        //Space Complexity = O(N)
    }

    //Left child = cell[2x]
    //Right child = cell[2x + 1]

    //isFull
    boolean isFull() {
        return arr.length - 1 == lastUsedIndex;
    }

    //Insert
    void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value; //---------------> O(1)
            lastUsedIndex++; //---------------> O(1)
            System.out.println("The value of " + value + " has been inserted"); //---------------> O(1)
        } else {

            System.out.println("The binary tree array is full!"); //---------------> O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //PreOrder Traversal
    void preorder(int index) {
        if (index > lastUsedIndex) {
            return;
        }

        System.out.print(arr[index] + " ");
        preorder(index * 2); //left child
        preorder(index * 2 + 1); //Right child

        //Time Complexity = O(N)
        //Space Complexity = O(N)
    }

    //InOrder Traversal
    void inOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);


        //Time Complexity = O(N)
        //Space Complexity = O(N)
    }

    //PostOrder Traversal
    void postOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");

        //Time Complexity = O(N)
        //Space Complexity = O(N)
    }

    //Level Order Traversal
    void levelOrder() {

        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }

        //Time Complexity = O(N)
        //Space Complexity = O(1)
    }


    //Search
    int search(String value) {
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (arr[i].equals(value)) {
                System.out.println("the value: " + value + " Has been found at index: " + i);
                return i;
            }
        }
        System.out.println("The value: " + value + " does not exist");

        return -1;
        //Time Complexity = O(N)
        //Space Complexity = O(1)
    }

    //deepest node
    String getDeepestNode() {

        return arr[lastUsedIndex];
    }

    //Delete Node
    void delete(String value) {
        int location = search(value);//-----------O(N)
        if (location != -1) {
            arr[location] = arr[lastUsedIndex];//--------- O(1)
            lastUsedIndex--;//--------- O(1)
            System.out.println("The node successfully deleted");//--------- O(1)
        }

        //Time Complexity = O(N)
        //Space Complexity = O(1)
    }

    void deleteBT() {
        try {
            arr = null;//--------- O(1)
            lastUsedIndex = 0;
            System.out.println("The tree successfully deleted");//--------- O(1)
        } catch (Exception e) {
            e.printStackTrace();//--------- O(1)
        }

        //Time Complexity = O(2)
        //Space Complexity = O(1)
    }
}
