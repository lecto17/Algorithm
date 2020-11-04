//문제 
//Check whether N is prime number or not ?
//
//Ex, N = 13 -> True / N = 6 -> False


public class Test2 {

    public static void main(String[] args){
        int N = 6;
        int cnt = 0;

        for(int i = 2; i <= (int)Math.sqrt(N); i++){
            if(N % i == 0) cnt++;
            if(cnt >= 1) {
                System.out.println("false");
                return ;
            }

        }

        System.out.println("true");
    }
}
