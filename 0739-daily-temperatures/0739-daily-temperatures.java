class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        Arrays.fill(res,0);
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&a[i]>a[s.peek()]){
                int idx = s.pop();
                res[idx] = i-idx;
            }
            s.push(i);
        }
        return res;
    }
}