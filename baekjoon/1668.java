import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int big = 0, cnt = 0;
        int[] temp = new int[n];
        StringBuffer sb = new StringBuffer();
        for(int i=0; i < n; i++){
            temp[i] = Integer.parseInt(br.readLine());
            if(temp[i] > big){
                big = temp[i];
                cnt++;
            }
        }
        sb.append(cnt+"\n");
        cnt = 0; big = 0;
        for(int i=--n ; i >=0 ; i--){
            if(temp[i] > big){
                big = temp[i];
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb.toString());
    }
}
