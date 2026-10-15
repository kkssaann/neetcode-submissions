class Solution {

    public int maxCount(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }
    public int characterReplacement(String s, int k) {
        int low = 0;
        int n = s.length();
        int res = 0;
        int len=0;
        int maxcount=0;
        int [] arr = new int[256] ;

        for(int high = 0; high<n ; high++){

            char ch = s.charAt(high);
            arr[ch]++;
            len = high-low+1;
            maxcount = maxCount(arr);
            int diff = len-maxcount;

            while(diff>k){
                char left = s.charAt(low);
                arr[left]--;
                low++;
                maxcount = maxCount(arr);
                len = high-low+1;
                diff = len-maxcount;
            }
            
            len = high - low+1;
            res = Math.max(len,res);
        }
        return res;
    }
}
