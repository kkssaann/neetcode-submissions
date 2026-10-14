class Solution {
    public int fun(int i , int [] prices, int n,int k){
        if(i==n){
            return 0;
        }
        if(k==0){
            return 0;
        }
        if(k==2){
            int c1 = fun(i+1,prices,n,k-1)-prices[i];
            int c2 = fun(i+1,prices,n,k);
            return Math.max(c1,c2);
        }
        else{
            int c1 = fun(i+1,prices,n,k-1)+prices[i];
            int c2 = fun(i+1,prices,n,k);
            return Math.max(c1,c2);
        }
        
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int k = 2;
        return fun(0,prices,n,k);
       
    }
}
