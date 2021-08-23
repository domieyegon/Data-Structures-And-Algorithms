package arrays;

public class MissingNumber {

    static void missingNumber(int[] array) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i: array){
            sum1 +=i;
        }

        int lastItem = array[array.length-1];
        System.out.println("Last Item: "+lastItem);
        //sum2 = n(n+1)/2
        sum2 = (lastItem*(lastItem+1)/2);

        System.out.println("Sum of the total items in the array: "+ sum1);
        System.out.println("Sum for the numbers from 0 to "+lastItem+" = "+ sum2);

        //missing item = sum2- sum1;

        int difference = sum2 - sum1;

        System.out.println("Missing Item = "+difference);


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};

        missingNumber(arr);
    }
}
