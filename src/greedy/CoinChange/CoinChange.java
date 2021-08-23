package greedy.CoinChange;

import java.util.Arrays;

public class CoinChange {
    static void coinChange(int[] coins, int N) {
        Arrays.sort(coins);//----------------O(NLogN)
        int index = coins.length -1;//----------------O(1)

         while (true) {//----------------O(N)
             int coinValue = coins[index];//----------------O(1)
             index--;//----------------O(1)
             int maxMount = (N/coinValue) * coinValue;//----------------O(1)
             if (maxMount > 0) {//----------------O(1)
                 System.out.println("Coin Value: "+coinValue+ " Taken count: "+N/coinValue);//----------------O(1)
                 N = N - maxMount;//----------------O(1)
             }

             if (N == 0) break;//----------------O(1)
         }

         //Time Complexity =O(NLogN)
        //Space Complexity =O(1)
    }
}
