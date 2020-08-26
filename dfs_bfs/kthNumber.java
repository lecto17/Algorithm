import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {        
        int[] answer = new int[commands.length];
        System.out.println("length: " + commands.length);
        int i, j, k = 0;                                
                
        //배열 안에 배열이 몇개있는지 확인
        for(i = 0; i < commands.length; i++){
            int[] copyArr = new int[commands[i][1] - commands[i][0] + 1];
                
            //배열 안에 배열 1개씩 정렬하기 위해 배열마다 필요한 반복 횟수를 구한다.
            for(j = commands[i][0] - 1; j <= commands[i][1] - 1; j++){    
                copyArr[k++] = array[j];
            }            
            
            Arrays.sort(copyArr);                        
            answer[i] = copyArr[commands[i][2] - 1];                        
            k = 0;
        }                        
        return answer;
    }
}
