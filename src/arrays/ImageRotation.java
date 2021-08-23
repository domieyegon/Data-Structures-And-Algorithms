package arrays;

import java.util.Arrays;

public class ImageRotation {

    static boolean rotation(int[][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length; // to find the number of layers
        for (int layer =0; layer < n/2; layer++) {
            int first = layer;
            int last = n-1-layer;

            for (int i= first; i < last; i++) {
                int offset = i -first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        boolean result = rotation(arr);

        System.out.println(result);

        System.out.println(Arrays.deepToString(arr));
    }
}
