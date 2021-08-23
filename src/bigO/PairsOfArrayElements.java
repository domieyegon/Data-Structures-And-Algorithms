package bigO;

public class PairsOfArrayElements {

    static void pairs(int[] array) {

        for (int item : array) { //-----------------------------> O(n)

            for (int value : array) { //------------------------> O(n)
                System.out.println(item + "" + value); //-------> O(1)
            }
        }
    }

    //Time Complexity = O(N^2)

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        pairs(arr);

    }
}
