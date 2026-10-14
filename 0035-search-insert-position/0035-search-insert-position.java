class Solution {
    public int searchInsert(int[] a, int k){
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(a[m]==k){
                return m;
            }
            else if(a[m]<k){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return l;
    }
}