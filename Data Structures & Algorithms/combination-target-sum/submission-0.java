class Solution {

    public void fun(int[] nums,int i ,int target,List<Integer> temp, List<List<Integer>> res,int sum ){
        
        if(sum==target){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(i==nums.length || sum>target){
            return;
        }
        fun(nums,i+1,target,temp,res,sum);
        
        temp.add(nums[i]);
        fun(nums,i,target,temp,res,sum+nums[i]);
        temp.remove(temp.size()-1);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        fun(nums,0,target,temp,res,0);
        return res;
    }
}
