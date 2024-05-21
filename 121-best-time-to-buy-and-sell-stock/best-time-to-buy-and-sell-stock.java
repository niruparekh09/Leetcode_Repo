class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0 ;
        for(int i=0; i<prices.length;i++){
            if(buyPrice<prices[i]){
                int maxProfit = prices[i] - buyPrice;
                profit = Math.max(profit,maxProfit);  
            }
            else{
                buyPrice = prices[i];
            }
        }
        if(profit == 0)
        return 0;
        else
        return profit;
    }
}