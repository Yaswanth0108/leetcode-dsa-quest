
class Solution {
    public String sortSentence(String s) {
        String words[] = s.split(" ");
        String res[] = new String[words.length];
        for(int i=0;i<words.length;i++){
            int p = words[i].charAt(words[i].length()-1)-'1';
            res[p] = words[i].substring(0,words[i].length()-1);
        }
        return String.join(" ",res);
    }
}
