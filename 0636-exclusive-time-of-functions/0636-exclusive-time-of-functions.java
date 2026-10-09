class Solution { 
    public int[] exclusiveTime(int n, List<String> logs) { 
        int[] res = new int[n]; 
        if(n==1){ 
            Details details = new Details(logs.get(logs.size()-1)); 
            res[0] = details.time+1; 
        } 
        else{ 
            Stack<Details> stack = new Stack<>(); 
            for(String log : logs){ 
                Details details = new Details(log); 
                if(details.status.equals("end")){ 
                    res[details.id] += details.time-stack.pop().time+1;
                    if(!stack.isEmpty()){
                        stack.peek().time = details.time+1;
                    }
                } 
                else{ 
                    if(!stack.isEmpty()){
                        res[stack.peek().id] += details.time-stack.peek().time;
                    }
                    stack.add(details); 
                } 
            } 
        } 
        return res; 
    } 
    class Details{ 
        int id; 
        int time; 
        String status; 
        Details(String s){ 
            int i=0; 
            while(Character.isDigit(s.charAt(i+1))){ 
                i++; 
            } 
            this.id = Integer.parseInt(s.substring(0,i+1)); 
            i+=2; 
            if(s.charAt(i)=='s'){ 
                this.status = "start"; 
                i+=6; 
            } 
            else{ 
                this.status = "end"; 
                i+=4; 
            } 
            int j=i; 
            while(j<s.length()-1&&Character.isDigit(s.charAt(j+1))){ 
                j++; 
            } 
            this.time = Integer.parseInt(s.substring(i,j+1)); 
        } 
    } 
}
