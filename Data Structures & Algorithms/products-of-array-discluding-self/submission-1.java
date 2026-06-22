class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int leftpdt = 1;
        for(int i = 0; i < nums.length; i++){
            output[i] = leftpdt;
            leftpdt *= nums[i];
        }
        int rightpdt = 1;
        for(int i = nums.length-1; i >= 0; i--){
            output[i] *= rightpdt;
            rightpdt *= nums[i];
        }
        return output;
    }
}  
