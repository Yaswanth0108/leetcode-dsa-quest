class Solution {
    public int search(int[] a, int x) {
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(a[m]==x){
                return m;
            }
            else if(a[m]>=a[l]){
                if(x<a[m]&&x>=a[l]){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(x>a[m]&&x<=a[r]){
                    l=m+1;
                }
                else{
                    r=m-1;
                }
            }
        }
        return -1;
    }
}