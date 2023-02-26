class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                diff=prices[j]-prices[i];
                if(diff>maxprofit){
                    maxprofit=diff;
                }
            }
        }
        return maxprofit;    
	}
}