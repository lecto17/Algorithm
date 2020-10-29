//문제에서 return type을 long으로 줬음을 가볍게 여기지 말기

class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long sum = 0;
        double W = w;
        double H = h;
        
        for(int i = 1 ; i <= w; i++){
            sum += (int)((-H * i / W)  + H);
        }
        answer = sum * 2;
        return answer;
    }
}
