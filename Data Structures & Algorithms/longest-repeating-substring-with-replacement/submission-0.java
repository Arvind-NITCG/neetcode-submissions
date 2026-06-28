class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxLen = 0, maxfreq = 0;
        for(int right = 0; right < s.length(); right++){
            int rightchar = s.charAt(right) - 'A';
            count[rightchar]++;
            maxfreq = Math.max(maxfreq,count[rightchar]);

            if((right - left + 1) - maxfreq > k){
              int leftchar = s.charAt(left) - 'A';
              count[leftchar]--;
              left++;
            }

            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
