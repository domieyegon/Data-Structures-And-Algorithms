package greedy.CoinChange;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,1000};
        int amount = 2035;
        System.out.println("Coins Available: "+ Arrays.toString(coins));
        System.out.println("Target amount: "+ amount);
        CoinChange.coinChange(coins, amount);
    }
}
