class Solution {
    public int heightChecker(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            b[i] = a[i];
        }
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        int c = 0;
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                c++;
            }
        }
        return c;
    }
}