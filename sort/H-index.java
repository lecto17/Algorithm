/* 표준 풀이
 * import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = (int)Math.min(citations[i], citations.length - i);
            if(max < min) max = min;
        }

        return max;
    }
}

 * 
 * */

/* 작동 시간 단축하는 것을 고려하지 않고 풀었다.
 * 
 * class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        answer = findHindex(answer, citations);
        return answer;
    }
    
    public int findHindex(int answer, int[] citations){
        int arrLen = citations.length;
        int temp = 0;
        int big = 0;
        int cnt;
        for(int i = 0; i < arrLen; i++){
            temp = citations[i];
            cnt = 0;
            for(int j = 0; j < arrLen ; j++){                
                if(temp <= citations[j])
                    cnt++;
            }
            if(cnt >= temp){
                if(big < temp){                    
                    big = temp;
                }                              
            }            
        }
        answer = big;
        return answer;
    }
}

*/
