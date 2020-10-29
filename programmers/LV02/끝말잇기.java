//20가지 중 6가지 경우 실패
import java.util.*;
    
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int len = -1;        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < words.length; i++){
            len = words[i].length();
            if(map.get(words[i]) == null)
                map.put(words[i], 1);
            else
                map.put(words[i], map.get(words[i])+1);   
            
            //다른 글자로 단어를 이을 경우
            if(i < words.length-1 && !words[i].substring(len-1, len).equals(words[i+1].substring(0,1))){
                //System.out.println("i: "+i+", n: "+ n);
                answer[0] = (++i % n) + 1;
                answer[1] = (++i / n) + 1;
                break;
            }
            //같은 단어를 했을 경우
            if(map.get(words[i]) != 1){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }                      
            //탈락자가 없을 경우
            if(i == words.length-1)
            {
                answer[0] = 0;
                answer[1] = 0;
                break;
            }
        }
        //map.forEach((key, value) -> System.out.println("key: "+ key+", value: "+ value));
        
        return answer;
    }
}
