class Solution {
    public int[] nextGreaterElements(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&a[i]>a[s.peek()]){
                int idx = s.pop();
                res[idx] = a[i];
            }
            s.push(i);
        }
        for(int i=0;i<n-1;i++){
            while(!s.isEmpty()&&a[i]>a[s.peek()]){
                int idx = s.pop();
                res[idx] = a[i];
            }
            s.push(i);
        }
        return res;
    }
}