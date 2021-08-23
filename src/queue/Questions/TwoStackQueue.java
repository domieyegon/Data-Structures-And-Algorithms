package queue.Questions;

import java.util.Stack;

public class TwoStackQueue {
    Stack<Integer> stackNewest, stackOldest;

    public TwoStackQueue() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }

    int size() {
        return stackNewest.size() + stackOldest.size();
    }

    void enQueue(int value) {
        stackNewest.push(value);
    }

    private void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                int poppedOut = stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    int deQueue() {
        shiftStacks();
        return stackOldest.pop();
    }


    int peek() {
        shiftStacks();
        return stackOldest.peek();
    }
}
