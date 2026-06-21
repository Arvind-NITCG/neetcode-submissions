class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pdt = 1,idx=0,occurence=0;
        int[] output = new int[nums.length];
        for(int i =0; i<nums.length;i++){
         if(nums[i]==0){
            idx = i;
            occurence++;
         }
         if(occurence > 1){
            Arrays.fill(output,0);
            return output;
            }
         pdt *= nums[i];
        }
        if(pdt == 0){
            pdt = 1;
        for(int i =0; i<nums.length;i++){
          if(i == idx) continue;
          pdt *= nums[i];
        }
        Arrays.fill(output,0);
        output[idx] = pdt;
        }
        else{
            for(int i = 0; i<nums.length;i++){
                output[i]=pdt/nums[i];
            }
        }
        return output;
    }
}  
