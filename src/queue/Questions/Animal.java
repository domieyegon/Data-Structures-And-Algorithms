package queue.Questions;

public abstract class Animal {

    private int order;

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String name();

    void setOrder(int ord) {
        order = ord;
    }

    int getOrder() {
        return order;
    }

    boolean isOlderThan(Animal a) {
        return  this.order < a.getOrder();
    }

}
