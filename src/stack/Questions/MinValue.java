package stack.Questions;

public class MinValue {

    int[] arr;

    Node top;
    Node min;

    public MinValue() {
        top = null;
        min = null;
    }

    public int min() {
        return min.value;
        //Time Complexity = O(1)
    }

    public void push(int value) {
        if (min == null) {
            min = new Node(value, min);
        } else if(min.value < value) {
            min = new Node(min.value, min);
        } else {
            min = new Node(value, min);
        }

        top= new Node(value, top);

        //Time Complexity = O(1)
    }

    public int pop() {
        min = min.next;
        int result = top.value;
        top = top.next;
        return result;
        //Time Complexity = O(1)
    }
}
