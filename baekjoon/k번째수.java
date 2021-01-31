import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] temp = new int[n*n];
        int i,j;
        for(i=1;i <= n;i++){
            for(j=1; j<=n; j++){
                temp[3*(i-1)+(j-1)] = i*j;
            }
            if(3*(i-1)+(j-1) == k)
                break;
        }
        Arrays.sort(temp);
        System.out.println(temp[k]);
    }
}
