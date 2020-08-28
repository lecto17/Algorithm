/**
 *시간 효율성 체크하면서 문제 풀기
 */

/**표준 풀이
 * import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
 *
 */

/*
 *import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
       
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i]))
                return participant[i];
        }        
        return participant[i];               
    }
}
 *
 * */

/*
 * import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();        
        String answer = "";
        
        for(String com : completion){
            if(hm.get(com) == null)
                hm.put(com, 1);
            else
                hm.put(com, hm.get(com)+1);
        }
        
        for(String part : participant){
            if(hm.get(part) != null)  
                hm.put(part, hm.get(part) - 1);
            else  
                return part;
        }                
        
        for(String part : participant)
            if(hm.get(part) != 0)
                return part;
        return answer;
    }
}
 * */
