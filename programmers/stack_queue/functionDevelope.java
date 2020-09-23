//기능개발
//
//
//class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = null;
        int done = 100;
        int[] remain = new int[progresses.length];
        int check = (int)Math.ceil((done - progress[0]) / speeds[0]);
        int cnt = 0;

        while(true){
            for(int i = 0; i < processes.length; i++){
                remain[i] = done - progresses[i];
                if(remain[0] - speeds[0]*(i+1) <= 0){

                }
                if(remain[i] - speeds[i] * (i+1) == 0)
                    cnt++;
            }
        }

        return answer;
    }
}
