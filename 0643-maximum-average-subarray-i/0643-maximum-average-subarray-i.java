class Solution {
    public double findMaxAverage(int[] a, int k) {
        double max = 0;
        int p=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        max = sum/k;
        for(int i=1;i<=a.length-k;i++){
            sum -= a[i-1];
            sum += a[i+k-1];
            max = Math.max(max,sum/k);
        }
        return max;
    }
}