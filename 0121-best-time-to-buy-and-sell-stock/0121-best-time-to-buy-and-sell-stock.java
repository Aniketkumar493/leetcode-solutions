class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int maxm = Integer.MIN_VALUE;
        int minm = Integer.MAX_VALUE;

        int ans = 0;
        for(int i=0;i<n;i++){
            minm = Math.min(minm, prices[i]);

            ans = prices[i]-minm;

            maxm = Math.max(maxm, ans);
        }

        return maxm;
        
    }
}