package stack.LinkedList;

public class Stack {

    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    //Push Method
    void push(int value) {
        linkedList.insertInLinkedList(value, 0); //---------------> O(1)
        System.out.println("Inserted " + value + " into stack"); //----------> O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Is Empty Method
    boolean isEmpty() {
        return linkedList.head == null; //---------------> O(1)

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Pop Method
    void pop() {
        int result = -1;//--------------------------------------------------> O(1)
        if (isEmpty()) {
            System.out.println("Stack is Empty");//--------------------------> O(1)
        } else {
            result = linkedList.head.value;//--------------------------------> O(1)
            linkedList.delete(0);//---------------------------------> O(1)
            System.out.println(result + " Has been Deleted");//---------------> O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Peek Method
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");//---------------------------------------------------------> O(1)
        } else {
            System.out.println("The top element in the stack is: " + linkedList.head.value);//---------------> O(1)
        }

        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    //Delete
    void delete() {
        linkedList.head = null; //----------------------------------> O(1)
        System.out.println("Stack Deleted successfully");//---------> O(1)


        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }
}
