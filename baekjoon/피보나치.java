import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] temp = new int[n+1];
        temp[0] = 0;
        temp[1] = 1;
	//i를 0대신 2부터 시작! 그러면 temp[i+2]도 temp[i]로 가능
        for(int i=0;i <= n-2; i++){
            temp[i+2] = temp[i] + temp[i+1];
        }
        System.out.println(temp[n]);        
    }
}
