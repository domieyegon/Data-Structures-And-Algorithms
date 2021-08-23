package search;

public class Searching {

    //Linear search
    static int linearSearch(int[] arr, int value) {
        int i = 0;
        for (int item : arr) {//--------------------------------------------------> O(N)
            if (item == value) {
                System.out.println("Element found at the index of: " + i);//-------> O(1)
                return i;
            }
            i++;
        }

        System.out.println("The element " + value + " not found");//--------------------> O(1)
        return -1;


        //Time Complexity = O(N)
        //Space Complexity = O(1 )
    }

    //Binary Search
    static int binarySearch(int[] arr, int value) {

        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;

        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle - 1;//------------------------------------------------------> O(1)
            } else {
                start = middle + 1;//-----------------------------------------------------> O(1)
            }
            middle = (start + end) / 2;//-------------------------------------------------> O(1)

        }

        if (arr[middle] == value) {
            System.out.println("Element found at the index of: " + middle);//--------------> O(1)
            return middle;//----------------------------------------------------------------> O(1)
        } else {
            System.out.println("The element " + value + " not found");//--------------------> O(1)
            return -1;
        }


        //Time Complexity:
                //Worst and Average Case = O(Log N)
                //Best Case = O(1)
        //Space Complexity = O(1)
    }
}
