package stack.Questions;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {

    ArrayList<PlateStack> stacks = new ArrayList<>();
    public int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    PlateStack getLastStack() {
        if (stacks.size()== 0) {
            return null;
        }

        return stacks.get(stacks.size()-1);
    }

    void push(int value) {
        PlateStack last = getLastStack();
        if (last !=null && !last.isFull()){
            last.push(value);
        } else {
            PlateStack plateStack = new PlateStack(capacity);
            plateStack.push(value);
            stacks.add(plateStack);
        }
    }

    int pop() {
       PlateStack last = getLastStack();
       if (last == null)  throw new EmptyStackException();

       int result = last.pop();

       if (last.size == 0) {
           stacks.remove(stacks.size()-1);
       }

       return result;
    }

    //Shift elements to the left stack
    int leftShift(int index, boolean removeTop) {
        PlateStack plateStack = stacks.get(index);
        int removeItem;
        if (removeTop) removeItem = plateStack.pop();
        else removeItem = plateStack.removeBottom();

        if (plateStack.size == 0) {
            stacks.remove(index);
        } else if (stacks.size() > index+1) {
            int value = leftShift(index+1, false);
            plateStack.push(value);
        }

        return removeItem;
    }

    int popAt(int index) {
        return leftShift(index, true);
    }

}
