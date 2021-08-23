package queue.Questions;

public class Main {

    public static void main(String[] args) {

        TwoStackQueue twoStackQueue = new TwoStackQueue();
        twoStackQueue.enQueue(1);
        twoStackQueue.enQueue(2);
        twoStackQueue.enQueue(13);
        twoStackQueue.enQueue(4);
        System.out.println(twoStackQueue.peek());
        System.out.println(twoStackQueue.peek());

        AnimalQueue animal = new AnimalQueue();
        animal.enQueue(new Cat("Kiki")) ;
        animal.enQueue(new Dog("Jimmy")) ;
        animal.enQueue(new Cat("Kari")) ;
        animal.enQueue(new Dog("Beji")) ;
        animal.enQueue(new Dog("Dexter")) ;

        System.out.println(animal.dequeueAny().name);
        System.out.println(animal.dequeueCats().name);
        System.out.println(animal.dequeueAny().name);

    }
}
