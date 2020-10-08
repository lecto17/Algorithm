//직사각형 좌표구하기

import java.util.*;

class Solution {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        Map<Integer, Integer> mapX = new HashMap<>();
        Map<Integer, Integer> mapY = new HashMap<>();

        for(int i = 0; i < v.length; i++){
            for(int j = 0 ; j < 1; j++){
                if(mapX.get(v[i][j]) != null ) mapX.put(v[i][j], mapX.get(v[i][j])+1);
                else mapX.put(v[i][j], 1);
                if(mapY.get(v[i][j+1]) != null) mapY.put(v[i][j+1], mapY.get(v[i][j+1])+1);                
                else mapY.put(v[i][j+1], 1);
            }        
        }

        for(Map.Entry<Integer, Integer> entry : mapX.entrySet())
            if(mapX.get(entry.getKey()) != 2) answer[0] = entry.getKey();
        
        for(Map.Entry<Integer, Integer> entry : mapY.entrySet())
            if(mapY.get(entry.getKey()) != 2) answer[1] = entry.getKey();
        
        return answer;
    }
}
