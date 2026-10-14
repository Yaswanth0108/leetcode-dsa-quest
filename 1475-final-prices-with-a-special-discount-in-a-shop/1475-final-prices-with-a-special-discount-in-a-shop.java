class Solution {
    public int[] finalPrices(int[] a) {
        Stack<Integer> s = new Stack<>();
        s.push(a[a.length-1]);
        int[] res = new int[a.length];
        for(int i=a.length-2;i>=0;i--){
            int val = a[i];
            for(int j=i+1;j<a.length;j++){
                if(a[j]<=a[i]){
                    val = a[i]-a[j];
                    break;
                }
            }
            s.push(val);
        }
        for(int i=0;i<a.length;i++){
            a[i] = s.pop();
        }
        return a;
    }
}