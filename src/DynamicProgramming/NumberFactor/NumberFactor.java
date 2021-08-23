package DynamicProgramming.NumberFactor;

public class NumberFactor {
    //Top Down
    private int waysToGetNTopDown(int[] dp, int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }

        if (n == 3) {
            return 2;
        }

        if (dp[n] == 0) {
            int sb1 = waysToGetNTopDown(dp, n - 1);
            int sb2 = waysToGetNTopDown(dp, n - 3);
            int sb3 = waysToGetNTopDown(dp, n - 4);
            dp[n] = sb1 + sb2 + sb3;
        }

        return dp[n];
    }

    public int waysToGetNTopDown(int n) {
        int[] dp = new int[n + 1];
        return waysToGetNTopDown(dp, n);
    }

    //Bottom Up
    public int waysToGetNBottomUp(int n) {
        int[] dp = new int[n+1];
        dp[0] = dp[1] = dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];
        }
        return dp[n];
    }
}
