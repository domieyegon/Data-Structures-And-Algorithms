package stack.Questions;

import java.util.EmptyStackException;

public class PlateStack {
    private int capacity;
    public Node top;
    public Node bottom;
    public int size = 0;

    public PlateStack(int capacity) {
        this.capacity = capacity;
    }

    //isFull
    boolean isFull() {
        return capacity == size;
    }

    //Join below and above nodes together
    void join(Node above, Node below) {
        if (below != null) below.above = above;

        if (above != null) above.below = below;
    }

    //Push
    boolean push(int value) {
        if (size >= capacity) return false;
        size++;

        Node newNode = new Node(value);
        if (size == 1) bottom = newNode;
        join(newNode, top);
        top = newNode;
        return true;
    }

    //Pop
    int pop() {
        if (top == null) throw new EmptyStackException();
        int result = top.value;
        top = top.below;
        size--;
        return result;
    }

    int removeBottom() {
        Node b = bottom;
        bottom = bottom.above;
        if (bottom != null) bottom.below = null;
        size--;
        return b.value;
    }


}
