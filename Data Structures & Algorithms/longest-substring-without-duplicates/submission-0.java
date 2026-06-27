class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashSet<Character> h = new HashSet<>();
        int max = 0, left = 0;
        for(int right=0; right<s.length();right++){
          char ch = s.charAt(right);
          while(h.contains(ch)){
            h.remove(s.charAt(left));
            left++;
          }
          h.add(ch);
          max = Math.max(max,right-left+1);
        }
        return max;
    }
}