class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int p = 0;
        int c = 0;
        char[] ch = s.toCharArray();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i=0;i<k;i++){
            if(vowels.contains(ch[i])){
                c++;
            }
        }
        max = c;
        for(int i=k;i<ch.length;i++){
            if(vowels.contains(ch[i])){
                c++;
            }
            if(vowels.contains(ch[i-k])){
                c--;
            }
            if(c>max){
            max = c;
            }
        }
        return max;
    }
}