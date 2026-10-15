class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int n= s.length();
        int res = 0;
        int len=0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int high = 0; high<n; high++){
            char c = s.charAt(high);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char ch = s.charAt(low);
                map.put(ch,map.get(ch)-1);
                low++;
            }
            len = high-low+1;
            res=Math.max(res,len);
        }
        return res;
    }
}
