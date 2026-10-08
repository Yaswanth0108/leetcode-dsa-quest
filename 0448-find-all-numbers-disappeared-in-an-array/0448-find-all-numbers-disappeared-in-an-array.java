class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        int n=a.length;
        List<Integer> res = new ArrayList<>();
        int[] freq = new int[n+1];
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        for(int i=1;i<n+1;i++){
            if(freq[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}