import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //새
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 1, cnt = 1;
        while(n != 0){
            if(n < i){
                i = 1;
                n -= i;
            }
            else{
                n -= i;
            }
            if(n != 0)
                cnt++;
            i++;
        }
        System.out.println(cnt);
    }
}
