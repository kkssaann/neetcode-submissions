class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i <nums.length ; i++){
            map.put(nums[i],1);
        }

        int len = 0;

        for(int num: map.keySet()){

            if(!map.containsKey(num-1)){
                int current = num;
                int count = 1;

                while(map.containsKey(current+1)){
                    current++;
                    count++;
                }

                len = Math.max(len,count);
            }

        }
        return len;

    }
}
