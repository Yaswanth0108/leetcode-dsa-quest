class Solution {
    public int[] findErrorNums(int[] a) {
        int n=a.length;
        int missingNumber=-1;
        int repeatedNumber=-1;
        int[] hashTable = new int[n+1];
        for(int i=0;i<n;i++){
            hashTable[a[i]]++;
        }
        for(int i=1;i<n+1;i++){
            if(hashTable[i]==0){
                missingNumber=i;
            }
            if(hashTable[i]==2){
                repeatedNumber=i;
            }
        }
        return new int[]{repeatedNumber,missingNumber};
    }
}