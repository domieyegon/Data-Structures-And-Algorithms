package arrays.SingleDimension;

public class Main {
    public static void main(String[] args) {
        SingleDimensionalArray sda = new SingleDimensionalArray(6);//------>O(1) Time Complexity = O(1) Space Complexity == O(n)<----Memory is required
        sda.insert(0, 0);
        sda.insert(1, 3);
        sda.insert(2, 6);
        sda.insert(3, 9);
        sda.insert(1, 7);
        sda.insert(15, 5);

        //Access the first element
        int firstElement = sda.array[0 ]; //-------------> O(1)

        System.out.println("First element: "+firstElement);

        //Traverse the Array
        sda.traverseArray();
        System.out.println("");

        // Search for an element in the array
        sda.searchElement(6);

        //Delete array element
        sda.deleteValue(3);
    }
}
