package bigO;

public class SumAndProductOfArrayE {


    static void sumProductOfArray(int[] array) {

        int sum = 0; //------------------------------->O(1)
        int product = 1; //--------------------------->O(1)

        for (int value : array) { //------------------>O(n)
            sum += value;//--------------------------->O(1)
            product *=value;//------------------------>O(1)
        }
        System.out.println("Sum = "+ sum);//---------->O(1)
        System.out.println("Product = "+ product);//-->O(1)
    }

    // Time complexity: O(N)

    public static void main(String[] args) {

        int[] arr = {1,3,4,5};

        sumProductOfArray(arr);

    }
}
