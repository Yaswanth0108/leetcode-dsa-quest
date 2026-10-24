class Solution {
    public void sortColors(int[] a) {
        int n = a.length;
        int i = 0;
        int j = n-1;
        int k = 0;
        while(k<=j){
            if(a[k]==0){
                a[k]=a[i];
                a[i]=0;
                i++;
                k++;
            }
            else if(a[k]==1){
                k++;
            }
            else{
                a[k]=a[j];
                a[j]=2;
                j--;
            }
        }
    }
}