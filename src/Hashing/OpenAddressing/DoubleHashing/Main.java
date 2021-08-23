package Hashing.OpenAddressing.DoubleHashing;

public class Main {
    public static void main(String[] args) {
        DoubleHashing doubleHashing = new DoubleHashing(13);
        doubleHashing.insertInHashTable("The");
        doubleHashing.insertInHashTable("quick");
        doubleHashing.insertInHashTable("brown");
        doubleHashing.insertInHashTable("fox");
        doubleHashing.insertInHashTable("jumped");
        doubleHashing.insertInHashTable("over");

//        doubleHashing.search("over");

//        doubleHashing.deleteKeyHashTable("fox");

        doubleHashing.displayHashTable();
    }
}
