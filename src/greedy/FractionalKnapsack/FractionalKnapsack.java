package greedy.FractionalKnapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FractionalKnapsack {

    static void knapsack(ArrayList<KnapsackItem> items, int capacity) {
        Comparator<KnapsackItem> comparator = new Comparator<KnapsackItem>() { //----------------O(1)
            @Override
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                if (o2.getRatio() > o1.getRatio()) {
                    return 1;
                }  else {
                    return -1;
                }
            }
        };

        Collections.sort(items, comparator);//----------------O(NLogN)
        int usedCapacity =0; //----------------O(1)
        double totalValue = 0; //----------------O(1)
        for (KnapsackItem item: items) { //----------------O(N)
            if (usedCapacity + item.getWeight() <= capacity) { //----------------O(1)
                usedCapacity += item.getWeight(); //----------------O(1)
                System.out.println("Taken: "+ item); //----------------O(1)
                totalValue +=item.getValue(); //----------------O(1)
            } else  {
                int usedWeight = capacity -usedCapacity; //----------------O(1)
                double value = item.getRatio() * usedWeight; //----------------O(1)
                System.out.println("Taken: item index = "+item.getIndex()+ " |Obtained Value = "+value+ " |Used weight = "+usedWeight+" |Ratio = "+item.getRatio()); //----------------O(1)
                usedCapacity += usedWeight; //----------------O(1)
                totalValue += value; //----------------O(1)
            }
            if (usedCapacity == capacity) break; //----------------O(1)
        }

        System.out.println("\nTotal value obtained: "+totalValue); //----------------O(1)

        //Time Complexity = O(NLogN)
        //Space Complexity = O(1)
    }
}
