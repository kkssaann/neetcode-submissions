class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        int count = 0;
        while(n>0){
            res = n%2;
            if(res==1){
                count++;
            }
            n= n/2;
        }
        return count;
    }
}
