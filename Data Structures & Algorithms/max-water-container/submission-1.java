class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int res = 0;
        int vol = 0;
        while(left<right){
            int height = Math.min(heights[left],heights[right]);
            int width = right-left;
            int area = height*width;

            vol = Math.max(vol,area);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return vol;
    }
}
