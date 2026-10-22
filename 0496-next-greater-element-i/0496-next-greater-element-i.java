class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {
        int[] res = new int[b.length];
        Arrays.fill(res,-1);
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<b.length;i++){
            while(!s.isEmpty()&&b[i]>b[s.peek()]){
                int idx = s.pop();
                res[idx] = b[i];
            }
            s.push(i);
        }
        HashMap<Integer,Integer> idx = new HashMap<>();
        for(int i=0;i<b.length;i++){
            idx.put(b[i],i);
        }
        int[] ans = new int[a.length];
        for(int i=0;i<a.length;i++){
            ans[i] = res[idx.get(a[i])];
        }
        return ans;
    }
}