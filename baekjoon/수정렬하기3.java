//처음 코드 (출력에서 시간을 많이 소요함)
//import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] temp = new int[n];

        for(int i=0; i < n; i++)
	    temp[i] = Integer.parseInt(br.readLine());
	Arrays.sort(temp);
        for(int i : temp)
	    System.out.println(i);
    }
}

//시간 줄인 코드 (StringBuffer를 활용해 출력하는 시간을 줄여야 한다!)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());        
        int[] temp = new int[n];

        while(n != 0)
            temp[--n] = Integer.parseInt(br.readLine());
        Arrays.sort(temp);
        for(int i : temp)
            sb.append(Integer.toString(i)+"\n");

        System.out.println(sb.toString());
    }
}
