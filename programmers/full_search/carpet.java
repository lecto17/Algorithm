import java.util.*;

class Solution {
    int[] answer = new int[2];
    
    public int[] solution(int brown, int yellow) {    
        List<Integer> list = new ArrayList<>();
        int cnt = 0;                
        
        for(int i = 1; i <= yellow; i++){
            if(yellow % i == 0) {
                list.add(i);
                cnt++;   
            }                
        }                        
        
        if(cnt % 2 != 0)
            cnt = (int)Math.ceil(cnt / 2) + 1;
        else
            cnt = (int)Math.ceil(cnt / 2);
        
        for(int i = 0; i < cnt; i++){
            getWidHeight(brown, yellow, list.get(i));
        }
        
        return answer;
    }
    
    public void getWidHeight(int brown, int yellow, int num){ 
        int width = yellow / num;
        
        if(width * 2 + num * 2 + 4 == brown){            
            answer[0] = width+2;
            answer[1] = num+2;
            return ;
        } 
        if(yellow == 1) {            
            answer[0] = width+2;
            answer[1] = num+2;
            return ;
        }
    }
}
