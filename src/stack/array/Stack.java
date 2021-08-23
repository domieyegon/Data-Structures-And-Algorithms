package stack.array;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size]; //--------------------------------------------------->O(1)
        this.topOfStack = -1; //------------------------------------------------------->O(1)
        System.out.println("The Stack is created with size of: " + size); //----------->O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(N)
    }

    //Is Empty Method
    boolean isEmpty() {
        return topOfStack == -1;//------------O(1);

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Is Full Method
    boolean isFull() {
        return topOfStack == arr.length - 1;//------------O(1);

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Push Method
    void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full!"); //--------------------------------->O(1)
        } else {
            arr[topOfStack + 1] = value;//------------------------------------------------->O(1)
            topOfStack++;//-------------------------------------------------------------->O(1)
            System.out.println("Value is Successfully Inserted");//----------------------->O(1)
        }
        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Pop Method
    void pop() {
        if (isEmpty()) {
            System.out.println("The Stack is empty");//------------------------------------------------>O(1)
        } else {
            int topStack = arr[topOfStack]; //--------------------------------------------------------->O(1)
            topOfStack--;//---------------------------------------------------------------------------->O(1)
            System.out.println(topStack + " has been removed from the stack");//----------------------->O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Peek Method
    void peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");//------------------------------------>O(1)
        } else  {
            System.out.println("The Top item is: "+arr[topOfStack]);//----------------------->O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Delete Method
    void delete() {
        arr = null;//------------------------------------------------------------->O(1)
        topOfStack = -1;//-------------------------------------------------------->O(1)
        System.out.println("The Stack has been deleted");//----------------------->O(1)
    }
}
