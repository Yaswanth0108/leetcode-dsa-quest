class Solution {
    public int[] smallerNumbersThanCurrent(int[] a) {
        int n=a.length;
        int[] res = new int[n];
        int[] freq = new int[max(a)+1];
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }
        for(int i=0;i<n;i++){
            if(a[i]==0){
                res[i]=0;
            }
            else{
                res[i]=freq[a[i]-1];
            }
        }
        return res;
    }
    static int max(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}