class Solution {
    public int maxProfit(int[] prices) {
        int low = 0;
        int res = 0;
        for(int high = 0; high<prices.length ;high++){
            if(prices[low]>prices[high]){
                low=high;
            }
            int profit = prices[high]-prices[low];
            res = Math.max(res,profit);
        }
        return res;
       
    }
}
