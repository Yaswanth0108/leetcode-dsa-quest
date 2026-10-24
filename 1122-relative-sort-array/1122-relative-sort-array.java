class Solution {
    public int[] relativeSortArray(int[] a, int[] b) {
        int res[] = new int[a.length];
        int p = 0;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]==b[i]){
                    res[p++] = a[j];
                    a[j] = -1;
                }
            }
        }
        int rem[] = new int[a.length-p];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1){
                rem[k++] = a[i];
            }
        }
        for(int i=0;i<rem.length;i++){
            for(int j=0;j<rem.length-i-1;j++){
                if(rem[j]>rem[j+1]){
                    int temp = rem[j];
                    rem[j] = rem[j+1];
                    rem[j+1] = temp;
                }
            }
        }
        for(int i=0;i<rem.length;i++){
            res[p++] = rem[i];
        }
        return res;
    }
}