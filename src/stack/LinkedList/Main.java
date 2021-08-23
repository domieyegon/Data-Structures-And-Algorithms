package stack.LinkedList;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        //Push
        System.out.println("Push to stack");
        stack.push(1);
        stack.push(3);
        stack.push(5);
        System.out.println();

        System.out.println("Is Empty");
        boolean result = stack.isEmpty();
        System.out.println("Is Empty: "+ result);
        System.out.println();

        System.out.println("Pop from stack");
        stack.pop();
        System.out.println();

        System.out.println("Peek");
        stack.peek();
        System.out.println();


        System.out.println("Delete");
        stack.delete();
        System.out.println();


    }
}
