//주어진 범위 내에 있는 소수의 갯수 구하기
class Solution {
    public int solution(int n) {
        int answer = 0;
        int divCnt= 0;
        int sqrt = 0;
        
        for(int i = 2; i <= n; i++){
            sqrt = (int)Math.sqrt(i);            
            for(int j = 1; j <= sqrt; j++){
                if(i % j == 0){
                    divCnt += 1;
                    if(divCnt >= 2 || i < j)
                        break;
                }
            }
            if(divCnt == 1) answer++;
            divCnt = 0;
        }        
        return answer;
    }
}
