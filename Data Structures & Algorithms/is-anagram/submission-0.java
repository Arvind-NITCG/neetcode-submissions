class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> hash = new HashMap<>();
      if(s.length() != t.length()) return false;
      int count = 0;
      for(int i =0; i < s.length();i++){
        char ch = s.charAt(i);
        if(hash.containsKey(ch)){
            count = hash.get(ch);
            hash.put(ch,++count);
        }
        else{
            hash.put(ch,1);
        }
      }
     for(int i =0; i < t.length();i++){
        char ch = t.charAt(i);
        if(!hash.containsKey(ch)) return false;
        else{
            count = hash.get(ch);
            hash.put(ch,--count);
        }
     }
     for(int i = 0; i < s.length();i++){
        char ch = s.charAt(i);
        if(hash.get(ch) != 0) return false;
     }
     return true;
    }
}
