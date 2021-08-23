package Hashing.OpenAddressing.QuadraticProbing;

import java.util.ArrayList;

public class QuadraticProbing {
    String[] hashTable;
    int usedCellNumber;

    public QuadraticProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String word, int noOfCells) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % noOfCells;
    }

    public double getLoadFunctor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }

    //Rehash
    public void rehashKeys(String word) {
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
        }

        data.add(word);
        hashTable = new String[hashTable.length * 2];

        for (String str : data) {
            //Insert in hash table
            insertInHashTable(str);
        }
    }

    void insertInHashTable(String word) {
        double loadFactor = getLoadFunctor();

        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCIIHashFunction(word, hashTable.length);

            int counter = 0;
            for (int i = index; i < index + hashTable.length; i++) {
                int newIndex = (index + (counter * counter)) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println("\n" + "\"" + word + "\"" + " has been inserted to HashTable at location: " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is already occupied. Trying next empty cell");
                }
                counter++;
            }
        }

        usedCellNumber++;
    }

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHashTable does not exists");
        } else {
            System.out.println("\n------------------HashTable---------------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key: " + hashTable[i]);
            }
        }
    }

    public boolean search(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);

        for (int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                System.out.println("'" + word + "' found ate location: " + newIndex);
                return true;
            }
        }

        System.out.println("'" + word + "' does not exist");
        return false;
    }

    void deleteKeyHashTable(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        for (int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                System.out.println("'" + word + "' Has been deleted");
                return;
            }
        }

        System.out.println("'" + word + "' Not found in hash table");
    }
}
