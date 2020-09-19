package DynamicProgramming;

import java.util.Arrays;

public class ThreeTwoTwo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2};
        int result = solution.coinChange(arr, 5);
        System.out.print(result);
    }
}

class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 100;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}


