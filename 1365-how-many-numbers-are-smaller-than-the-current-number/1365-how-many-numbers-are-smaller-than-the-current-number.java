class Solution {
    public int[] smallerNumbersThanCurrent(int[] a) {
        int n=a.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(a[i]>a[j]){
                    c++;
                }
            }
            res[i]=c;
        }
        return res;
    }
}