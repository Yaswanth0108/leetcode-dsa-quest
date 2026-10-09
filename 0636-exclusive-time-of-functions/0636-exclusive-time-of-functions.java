import java.util.*;
/*
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;
        for(String log : logs){
            String[] details = log.split(":");
            int id = Integer.parseInt(details[0]);
            String status = details[1];
            int time = Integer.parseInt(details[2]);
            if(status.equals("start")){
                if(!stack.isEmpty()){
                    res[stack.peek()] += time-prevTime;
                }
                stack.push(id);
                prevTime = time;
            }
            else{
                res[stack.pop()] += time-prevTime+1;
                prevTime = time+1;
            }
        }
        return res;
    }
}*/
import java.util.*;

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Details> stack = new Stack<>();
        
        for (String log : logs) {
            Details details = new Details(log);
            
            if (details.status.equals("start")) {
                if (!stack.isEmpty()) {
                    // 1. Give the running function credit for the slice it just executed
                    Details running = stack.peek();
                    res[running.id] += details.time - running.time;
                }
                // 2. Push the new function onto the stack
                stack.add(details);
            } else { // "end"
                // 3. Pop the finished function and calculate its final slice
                Details finished = stack.pop();
                res[finished.id] += details.time - finished.time + 1;
                
                // 4. CRITICAL: If another function is waiting underneath, 
                // update its resume time to the next unit of time (details.time + 1)
                if (!stack.isEmpty()) {
                    stack.peek().time = details.time + 1;
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
            // Keeping your exact string-parsing logic layout
            int i = 0;
            while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                i++;
            }
            this.id = Integer.parseInt(s.substring(0, i + 1));
            i += 2;
            if (s.charAt(i) == 's') {
                this.status = "start";
                i += 6;
            } else {
                this.status = "end";
                i += 4;
            }
            int j = i;
            while (j + 1 < s.length() && Character.isDigit(s.charAt(j + 1))) {
                j++;
            }
            this.time = Integer.parseInt(s.substring(i, j + 1));
        }
    }
}

