class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int maxCount=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
            }
            else{
                maxCount=Math.max(count,maxCount);
                count=0;
            }
        }
        return Math.max(count,maxCount);
    }
}