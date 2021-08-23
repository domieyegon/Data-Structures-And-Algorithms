package arrays;

public class SearchForAValue {

    static void search(int[] array, int value) {
        for (int i=0; i < array.length; i++) {
            if (array[i] == value){
                System.out.println("The value is found at the index of: "+i);
                return;
            }
        }

        System.out.println(value+ " is not found");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7, 8,9};
        search(arr, 9);


    }
}
