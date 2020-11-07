class Solution {
    public int solution(long n) {
        int answer = 0;
        
        int len = Long.toString(n).length();
        long same = n;
        int div =1;
        int[] arr = new int[len];
        int[] checkArr = new int[10];
        
        for(int i = len-1; i >= 0 ; i--){
            div = 1;
            for(int j =0; j <i; j++){
                div *= 10;
            }
            arr[i] = (int)(n / div);            
            n -= div * arr[i];
        }
        
        for(int i = 0; i < arr.length; i++){
            if(checkArr[(int)arr[i]] != 1){
                checkArr[(int)arr[i]] = 1;
                if(same % (int)arr[i] == 0){
                    answer++;                                        
                }
            }            
        }

        return answer;
    }
}
