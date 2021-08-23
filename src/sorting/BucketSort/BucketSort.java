package sorting.BucketSort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    int[] arr;

    public BucketSort(int[] arr) {
        this.arr = arr;
    }


    void bucketSort() {
        int noOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        //Create buckets
        ArrayList<Integer>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        //insert items to buckets
        for (int value : arr) {
            int bucketNumber = (int) Math.ceil(((float) value * noOfBuckets) / (float) maxValue);
            buckets[bucketNumber - 1].add(value);
        }

        System.out.println("\n\nPrint Buckets before sorting...");
        printBucket(buckets);

        //Sort buckets one by one
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);//-------------------->O(N Log N)
        }

        System.out.println("\n\nPrint Buckets after sorting...");
        printBucket(buckets);

        //Concatinate buckets
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index] = value;
                index++;
            }
        }

        System.out.println("\n");

        //Time Complexity = O(N Log N)
        //Space Complexity = O(N)
    }

    void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }

    //Print Buckets to console
    void printBucket(ArrayList<Integer>[] buckets) {

        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket #" + i + " : ");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
        }

    }
}
