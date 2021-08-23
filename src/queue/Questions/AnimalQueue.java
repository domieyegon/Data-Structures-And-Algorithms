package queue.Questions;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.LinkedList;

public class AnimalQueue {

    LinkedList<Dog> dogs = new LinkedList<>();

    LinkedList<Cat> cats = new LinkedList<>();

    private int order = 0;



    //EnQueue
    void enQueue(Animal a) {
        a.setOrder(order);
        order++;

        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }
    }

    public int size() {
        return dogs.size() + cats.size();
    }

    //DequeDogs
    Dog dequeueDogs() {
        return dogs.poll();//remove the first element
    }

    //PeekDogs
    Dog peekDogs() {
        return dogs.peek();
    }

    //peekCats
    Cat dequeueCats() {
        return cats.poll();//remove the first element
    }

    //peekCats
    Cat peekCats() {
        return cats.peek(); //Return the fist element
    }

    //Deque Any
    Animal dequeueAny() {
        if (dogs.size() ==0) {
            return dequeueCats();
        } else if (cats.size() == 0) {
            return dequeueDogs();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    //Peek
    Animal peek() {
        if (dogs.size() ==0) {
            return cats.peek();
        } else if (cats.size() ==0) {
            return dogs.peek();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        assert dog != null;
        if (dog.isOlderThan(cat)) {
            return dogs.peek();
        } else {
            return cats.peek();
        }
    }

}
