class Solution {
    public int[] countBits(int n) {
        int res= 0;
        int [] count = new int [n+1];
        for(int i=0;i<=n;i++){
            int num = i;
            while(num>0){
                res = num%2;
                if(res==1){
                    count[i]++;
                }
                num = num/2;
            }
        }
        return count;
    }
}
