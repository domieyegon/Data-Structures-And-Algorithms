package stack.Questions;

public class Main {

    public static void main(String[] args) {
        ThreeInOne threeInOne = new ThreeInOne(3);

        System.out.println("Is Full");
        boolean isFull = threeInOne.isFull(0);
        System.out.println("Is Full: " + isFull);
        System.out.println();


        System.out.println("Is Empty");
        boolean isEmpty = threeInOne.isEmpty(0);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println();


        System.out.println("Push to the stack");
        threeInOne.push(0, 7);
        threeInOne.push(0, 8);
        threeInOne.push(0, 9);
        threeInOne.push(1, 12);
        threeInOne.push(2, 45);
//        threeInOne.push(3, 78);
//        threeInOne.push(4, 98);
//        threeInOne.push(5, 78);
        System.out.println();


        System.out.println("Pop from the stack");
        int pop = threeInOne.pop(0);
        System.out.println(pop);
        System.out.println();


        System.out.println("Return first element");
        int peek = threeInOne.peek(0);
        System.out.println(peek);
        System.out.println();

//        FINDING THE MIN VALUE IN THE STACK
        MinValue minValue = new MinValue();
        minValue.push(3);
        minValue.push(2);
        minValue.push(4);
        minValue.push(1);
        System.out.println("Min value = "+ minValue.min());

        minValue.pop();
        System.out.println("Min value = "+ minValue.min());

        //PLate stack
        SetOfStacks setOfStacks = new SetOfStacks(3);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(7);
        setOfStacks.push(4);
        setOfStacks.push(9);
        System.out.println("Pop: "+setOfStacks.pop());
        System.out.println("Pop At: "+setOfStacks.popAt(0));
    }
}
