class Solution {
    public int[] plusOne(int[] a) {
     int n = a.length;
     ArrayList<Integer> arr = new ArrayList<>();
     if(a[n-1]!=9){
        a[n-1] = a[n-1]+1;
        return a;
     }
     else{
        int i=n-1;
        a[i--] = 0;
        while(i>=0&&a[i]==9){
            a[i]=0;
            i--;
        }
        if(i==-1){
            int[] res = new int[n+1];
            res[0] = 1;
            for(i=1;i<n+1;i++){
                res[i] = a[i-1];
            }
            return res;
        }
        else{
            a[i] = a[i]+1;
            return a;
        }
     }
    }
}