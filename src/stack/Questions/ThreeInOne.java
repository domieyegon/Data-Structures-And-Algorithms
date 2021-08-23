package stack.Questions;

public class ThreeInOne {

    int[] arr;
    private int numberOfStacks = 3;
    private final int stackCapacity;
    private int[] sizes;

    public ThreeInOne(int stackSize) {
        stackCapacity = stackSize;
        this.arr = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    //Q1. Create 3 stacks using one array
    //Q1. Beginning

    // isFull
    boolean isFull(int stackIndex) {
        return sizes[stackIndex] == stackCapacity;
    }

    // is Empty
    boolean isEmpty(int stackIndex) {
        return sizes[stackIndex] == 0;
    }

    //Return index of top element
    int indexOfTop(int stackIndex) {
        int offset = stackIndex * stackCapacity;
        int size = sizes[stackIndex];

        return offset+size -1;
    }

    //Push to the stack
    void push(int stackIndex, int value) {
        if (isFull(stackIndex)) {
            System.out.println("Stack is full!!");
        } else  {
            sizes[stackIndex]++;
            arr[indexOfTop(stackIndex)] = value;
        }
    }

    //Pop
    int pop(int stackIndex) {
        if (isEmpty(stackIndex)) {
            System.out.println("The stack is Empty!!");
            return -1;
        } else  {
            int topIndex = indexOfTop(stackIndex);
            int value = arr[topIndex];
            arr[topIndex] = 0;
            sizes[stackIndex]--;
            return value;
        }
    }

    int peek(int stackIndex) {
        if (isEmpty(stackIndex)) {
            System.out.println("The stack is Empty!!");
            return -1;
        } else  {
            return arr[indexOfTop(stackIndex)];
        }
    }

    //Q1 End
}
