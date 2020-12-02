//TC12번 실패

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){                
                if((lost[i] != -1 && reserve[j] != -1) && 
                        ((int)Math.abs(lost[i] - reserve[j]) == 1 || (int)Math.abs(lost[i] - reserve[j]) == 0) ){
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for(int el : lost){
            if(el != -1) answer++;
        }
        return n - answer;
    }
}
