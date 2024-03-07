class Solution {
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i+1; j++) {
                int sq = j*j;
                if (i-sq < 0){
                    break;
                }
                dp[i] = Math.min(dp[i], dp[i-sq] + 1);
            }
        }
        return dp[n];
    }
}