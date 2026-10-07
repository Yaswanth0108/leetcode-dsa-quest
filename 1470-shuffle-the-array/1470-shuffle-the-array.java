class Solution {
    public int[] shuffle(int[] a, int n) {
        int[] ans = new int[2*n];
        int i=0;
        int j=0;
        while(i<2*n){
            ans[i++]=a[j];
            ans[i++]=a[j+n];
            j++;
        }
        return ans;
    }
}