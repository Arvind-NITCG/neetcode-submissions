class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2) return false;
        int pt1 = 0 , pt2 = 1;
        for(;pt2 < nums.length;pt2++){
        if((nums[pt2]-nums[pt1++])==0) return true;
        }
        return false;
    }
}