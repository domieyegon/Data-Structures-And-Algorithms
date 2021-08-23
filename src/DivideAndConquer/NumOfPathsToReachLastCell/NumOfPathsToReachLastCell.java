package DivideAndConquer.NumOfPathsToReachLastCell;

public class NumOfPathsToReachLastCell {
    public int numOfPaths(int[][] array, int row, int col, int cost) {
        if (col < 0) {
            return 0;
        }
        if (row == 0 && col == 0) {
            return (array[0][0] - cost == 0) ? 1 : 0;
        }

        if (row == 0) {
            return numOfPaths(array, 0, col - 1, cost - array[row][col]);
        }

        if (col == 0) {
            return numOfPaths(array, row - 1, 0, cost - array[row][col]);
        }

        int noOfPathsFromPreviousRow = numOfPaths(array, row - 1, col, cost - array[row][col]);
        int noOfPathsFromPreviousCol = numOfPaths(array, row, col - 1, cost - array[row][col]);

        return noOfPathsFromPreviousRow + noOfPathsFromPreviousCol;
    }
}
