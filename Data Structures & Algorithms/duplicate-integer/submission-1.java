class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> hmap = new Hashtable<>();
        for(int num:nums){
            if(hmap.containsKey(num)) return true;
            else hmap.put(num,1);
        }
        return false;
    }
}