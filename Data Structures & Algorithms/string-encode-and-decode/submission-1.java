class Solution {

    public String encode(List<String> strs) {
      if(strs == null || strs.size() == 0) return null;
      StringBuilder sb = new StringBuilder();
      for(String s : strs){
        sb.append(s.length()).append("#").append(s);
      }
      return sb.toString();
    }

    public List<String> decode(String str) {
     List<String> fin = new ArrayList<>();
     if(str == null) return fin;
     int i = 0,j=0,length=0;
     while(i<str.length()){
        j = str.indexOf("#",i);
        length = Integer.parseInt(str.substring(i,j));
        int start = j+1;
        int end = start+length;
        fin.add(str.substring(start,end));
        i = end;
     }
     return fin;
    }
}
