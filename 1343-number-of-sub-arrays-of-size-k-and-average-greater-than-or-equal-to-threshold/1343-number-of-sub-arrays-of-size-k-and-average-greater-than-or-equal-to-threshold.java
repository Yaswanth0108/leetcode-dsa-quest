class Solution {
    public int numOfSubarrays(int[] a, int k, int limit) {
        int n = a.length;
        int c = 0;
        int p=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        if((sum/k)>=limit){
            c++;
        }
        for(int i=1;i<=n-k;i++){
            sum -= a[i-1];
            sum += a[i+k-1];
            if((sum/k)>=limit){
            c++;
        }
        }
        return c;
    }
}