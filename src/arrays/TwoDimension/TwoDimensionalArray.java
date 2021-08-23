package arrays.TwoDimension;

import java.util.Arrays;

public class TwoDimensionalArray {
    int[][] array = null;

    public TwoDimensionalArray(int rowSize, int colSize) {
       this.array = new int[rowSize][colSize];
       for (int row =0; row < array.length; row++) {
           for (int col =0; col< array[0].length; col++) {
               array[row][col]= Integer.MIN_VALUE;
           }
       }
    }

    //Array insertion
    public void insert(int row, int col, int value) {
        try {
            if (array[row][col] == Integer.MIN_VALUE) {//-------------------> O(1)
                array[row][col]= value;//-----------------------------------> O(1)
                System.out.println("Value inserted successfully");//--------> O(1)
            } else {
                System.out.println("This cell is already occupied");//------> O(1)
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index not found in the 2D array");//--------> O(1)
        }
    }
    //Time Complexity = O(1)
    //Space Complexity = O(1)


    public void accessCell(int row, int col) {
        try {
            System.out.println("The element access in row: "+row+" ,column:  "+col+" is: "+array[row][col]);//----------> O (1)
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid Index in the 2D Array!");//-----------------------------------------------------> O (1)
        }
    }

    //Time complexity = O(1)
    //Space Complexity = O(1) <----no memory is required.


    //Array Traversal
    public void traverseArray() {
        for (int[] ints : array) {//----------> O (m)
            for (int col = 0; col < array[0].length; col++) {//----> O (n)
                System.out.print(ints[col] + " ");//--------> O (1)
            }
            System.out.println();//-------------------------------> O (1)
        }

    }

    //Time complexity = O(mn)
    //Space Complexity = O(1) <----no memory is required.


    //Search Array Element
    public void searchElement(int value) {

        for (int row=0; row < array.length; row++) {//------------------------------------------------------> O (m)
            for (int col=0; col < array[0].length; col++){//------------------------------------------------> O (n)
                if (array[row][col] == value){//------------------------------------------------------------> O (1)
                    System.out.println("The value: "+ value+" is found at row: "+row+" col: "+col);//-------> O (1)
                    return;
                }
            }
        }

        System.out.println("Value not found");//------------------------------------------------------------> O (1)

    }
    //Time complexity = O(MN)
    //Space Complexity = O(1) <----no extra memory is required.


    //Delete value from Array
    public void deleteValue(int rowIndex, int colIndex) {
        try {
            array[rowIndex][colIndex] = Integer.MIN_VALUE;//----------------------------------------------->O(1)
            System.out.println("Item deleted successfully!.. its now: "+array[rowIndex][colIndex]);//------>O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist!");//-------------------------------------------------> O(1)
            e.printStackTrace();
        }
    }
    //Time complexity = O(1)
    //Space Complexity = O(1) <----no extra memory is required.
}
