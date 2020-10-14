//피보나치 수열 각각을 1234567으로 나누어  나머지 값을 구해 계산해야됨

class Solution {
    int[] arr ;
    int divisor = 1234567;
    
    public int solution(int n) {
        int answer = 0;
        arr = new int[n+1];    
        arr[0] = 0;
        arr[1] = 1;
        answer = fib(n);
        
        return answer;
    }
    
    public int fib(int num){
        if(num == 0) 
            return 0;
        else if(num == 1)
             return 1;
        else{
            for(int i = 2 ; i <= num; i++){
                arr[i] = arr[i-1] % divisor + arr[i-2] % divisor;
            }
            return arr[num] % divisor;
            //return arr[num] = fib(arr[num - 1]) % divisor+ fib(arr[num - 2]) % divisor;
            //return arr[num];
        }
    }
}
