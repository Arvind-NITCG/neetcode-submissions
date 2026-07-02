class Solution {
    public String minWindow(String s, String t) {
        if(s==null || t==null|| s.length()==0 || t.length()==0 || s.length() < t.length()){
            return "";
        }
        int totalcount[] = new int[128];
        int windowcount[] = new int[128];
        int left = 0;
        int right = 0;
        int minlen = Integer.MAX_VALUE;
        int best = 0;
        int matched = 0;
        char ch;

        for(char c: t.toCharArray()){
            totalcount[c]++;
        }

        while(right < s.length()){
            ch = s.charAt(right);
            windowcount[ch]++;
            if(totalcount[ch] > 0 && windowcount[ch] <= totalcount[ch]){
                matched++;
            }
            while(matched == t.length()){
                int currsize = right - left + 1;
                if(currsize < minlen){
                    minlen = currsize;
                    best = left;
                }
                ch = s.charAt(left);
                windowcount[ch]--;
                if(totalcount[ch] > 0 && windowcount[ch] < totalcount[ch]){
                    matched--;
                }
                left++;
            }
            right++;
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(best,best+minlen);
    }
}