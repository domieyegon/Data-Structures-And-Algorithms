package arrays;

public class CheckIfArrayIsUnique {

    static boolean unique(int[] array) {
//        boolean isUnique = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6, 8,9};

        boolean result = unique(arr);

        System.out.println(result);
    }
}
