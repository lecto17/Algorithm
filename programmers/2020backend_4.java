// 시간 모자라서 못 품

import java.util.*;

class Solution {
    public String solution(String[] votes, int k) {
        String answer = "";        
        Map<String, Integer> map = new HashMap<>();        
        List<Map.Entry<String, Integer>> entries ;        
        int len = votes.length;
        
        for(int i = 0 ; i < len; i++) {
            if(map.get(votes[i]) != null){
                map.put(votes[i], map.get(votes[i]) + 1);
            }
            else{
                map.put(votes[i], 1);
            }
        }
        
        entries = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println("Key: "+ entry.getKey()+", value: "+ entry.getValue());
        }
        
        return answer;
    }
}
