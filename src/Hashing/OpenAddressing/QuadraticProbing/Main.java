package Hashing.OpenAddressing.QuadraticProbing;

public class Main {
    public static void main(String[] args) {
        QuadraticProbing quadraticProbing = new QuadraticProbing(13);
        quadraticProbing.insertInHashTable("The");
        quadraticProbing.insertInHashTable("quick");
        quadraticProbing.insertInHashTable("brown");
        quadraticProbing.insertInHashTable("fox");
        quadraticProbing.insertInHashTable("jumped");
        quadraticProbing.insertInHashTable("over");
//
//        linearProbing.search("over");
//
//        linearProbing.deleteKeyHashTable("fox");
//
        quadraticProbing.displayHashTable();
    }
}
