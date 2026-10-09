class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Details> stack = new Stack<>();
        for(String log : logs){
            Details details = new Details(log);
            if(details.status.equals("start")){
                if(!stack.isEmpty()){
                    res[stack.peek().id] += details.time-stack.peek().time;
                }
                stack.add(details);
            }
            else{
                Details finished = stack.pop();
                res[finished.id] += details.time-finished.time+1;
                if(!stack.isEmpty()){
                    stack.peek().time = details.time+1;
                }
            }
        }
        return res;
    }

    class Details {
        int id;
        int time;
        String status;
        Details(String s) {
            int i = 0;
            while(i+1 < s.length() && Character.isDigit(s.charAt(i+1))){
                i++;
            }
            this.id = Integer.parseInt(s.substring(0, i+1));
            i += 2;
            if(s.charAt(i) == 's'){
                this.status = "start";
                i += 6;
            }
            else{
                this.status = "end";
                i += 4;
            }
            int j = i;
            while(j+1 < s.length() && Character.isDigit(s.charAt(j+1))){
                j++;
            }
            this.time = Integer.parseInt(s.substring(i, j+1));
        }
    }
}
