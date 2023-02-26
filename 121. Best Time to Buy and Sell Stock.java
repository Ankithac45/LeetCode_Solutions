class Solution {
    public int maxProfit(int[] prices) {
        int min=10000;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-min);
        }
        return maxprofit;
    }
}
