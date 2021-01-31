import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb =new StringBuffer();
        int[] temp = new int[n];
        for(int i=0; i<n; i++)
            temp[i] = Integer.parseInt(br.readLine());
        Arrays.sort(temp);
        for(int i: temp)
            sb.append(Integer.toString(i)+"\n");
        System.out.println(sb.toString());
    }
}
