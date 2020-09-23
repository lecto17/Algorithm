//기능개발
//
//
//
//import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = null;
        int done = 100;
        int len = progresses.length;
        int[] remainTotal = new int[len];
        int[] remainDays = new int[len];
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
                
        for(int i = 0; i < len; i++){
            remainTotal[i] = done - progresses[i];
            remainDays[i] = (int)Math.ceil(remainTotal[i] / speeds[i]);
        }
        
        Arrays.sort(remainDays);
        
        for(int i = 0; i < remainDays[len - 1]; i++) {
            for(int j = 0; j < len; j++){                                
                if(remainTotal[j] - speeds[j]*(i+1) <= 0)
                    cnt++;                                 
            }   
            if(remainTotal[0] - speeds[0]*(i+1) <= 0)
                    list.add(cnt);                                
            cnt = 0;
        }        
        
        len = list.size();
        
        answer = new int[len];
        for(int i = 0; i < len; i++)
            answer[i] = list.get(i);
            
        return answer;
    }
}
