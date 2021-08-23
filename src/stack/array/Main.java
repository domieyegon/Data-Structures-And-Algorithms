package stack.array;

public class Main {

    public static void main(String[] args) {
        //Create stack
        Stack stack = new Stack(6);
        System.out.println();

        //Is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Empty: "+isEmpty);
        System.out.println();

        //Is Full
        boolean isFull = stack.isFull();
        System.out.println("Is Full: "+isFull);
        System.out.println();

        //Push
        System.out.println("PUSH TO STACK");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println();

        //Pop
        System.out.println("POP FROM STACK");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();

        //Peek
        System.out.println("Peek: Return the top element from stack");
        stack.peek();
        System.out.println();

        //Delete
        System.out.println("DELETE STACK");
        stack.delete();
        System.out.println();
    }
}
