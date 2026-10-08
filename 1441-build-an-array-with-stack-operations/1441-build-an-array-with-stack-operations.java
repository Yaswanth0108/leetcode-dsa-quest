class Solution {
    public List<String> buildArray(int[] a, int n) {
        List<String> res = new ArrayList<>();
        int i=0;
        int j=1;
        while(i<a.length){
            if(a[i]==j){
                res.add("Push");
                i++;
            }
            else{
                res.add("Push");
                res.add("Pop");
            }
            j++;
        }
        return res;
    }
}