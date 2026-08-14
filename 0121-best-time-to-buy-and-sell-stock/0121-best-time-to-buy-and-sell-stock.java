class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int min = prices[0];
        int profit = 0;

        int dp[] = new int[n];
        dp[0] = 0;
        
        for(int i = 1; i<n; i++){
            min = Math.min(min,prices[i]);
            profit = Math.max(profit,prices[i]-min);
            dp[i] = Math.max(profit,dp[i-1]);
        } 
        return dp[n-1];
    }
}