package arrays.SingleDimension;

import java.util.Arrays;

public class SingleDimensionalArray {
    int[] array = null;

    public SingleDimensionalArray(int size) {
        array = new int[size];

        Arrays.fill(array, Integer.MIN_VALUE);
    }

    //Array insertion
    public void insert(int location, int value) {

        try {
            if (array[location] == Integer.MIN_VALUE) { //------------O(1)
                array[location] = value; //---------------------------O(1)
                System.out.println("Successfully Inserted!"); //------O(1)
            } else  {
                System.out.println("The cell is already occupied!");//-O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!"); //----O(1)
        }
    }
    //Time Complexity = O(1)
    //Space Complexity = O(1)

    //Array Traversal
    public void traverseArray() {
        try {
            for (int value : array) { //-------------------> O(n)
                System.out.print(value + ", ");//----------> O(1)
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");//-> O(1)
        }
    }

    //Time complexity = O(n)
    //Space Complexity = O(1) <----no memory is required.


    //Search Array Element

    public void searchElement(int value) {
        for (int i=0; i < array.length; i++) { //----------------------------------------------> O(N)
            if (array[i] == value ) {//--------------------------------------------------------> O(1)
                System.out.println("The value :"+ value +" is found at the index of: "+ i);//--> O(1)
                return;
            }
        }

        System.out.println(value+ "is not found!");
    }
    //Time complexity = O(N)
    //Space Complexity = O(1) <----no memory is required.


    //Delete value from Array
    public void deleteValue(int valueIndex) {
        try {
            array[valueIndex] = Integer.MIN_VALUE;//-----------------------------------> O(1)
            System.out.println("The value has been deleted successfully!");//----------> O(1)

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index does not exist!");//-----------------------------> O(1)
        }
    }
    //Time complexity = O(1)
    //Space Complexity = O(1) <----no memory is required.
}
