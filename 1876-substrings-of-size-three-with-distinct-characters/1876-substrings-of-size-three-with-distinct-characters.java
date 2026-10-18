class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()>=3){
            int count = 0;
        int n = s.length();
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<3;i++){
            h.put(ch[i],h.getOrDefault(ch[i],0)+1);
        }
        if(h.size()==3){
            count++;
        }
        for(int i=3;i<n;i++){
            h.put(ch[i-3],h.get(ch[i-3])-1);
            if(h.get(ch[i-3])==0){
                h.remove(ch[i-3]);
            }
            h.put(ch[i],h.getOrDefault(ch[i],0)+1);
            if(h.size()==3){
            count++;
        }
        }
        return count;
        }
        else{
            return 0;
        }
    }
}