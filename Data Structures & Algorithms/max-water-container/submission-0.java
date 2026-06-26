class Solution {
    public int maxArea(int[] heights) {
        int max = 0, curr = 0;
        for(int i = 0;i < heights.length; i++){
            for(int j = 1;j < heights.length; j++){
                curr  = (j-i)*(Math.min(heights[i],heights[j]));
                if(curr > max){
                    max = curr;
                }
            }
        }
        return max;
    }
}
