import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

[2;2R[>77;30100;0c]10;rgb:bfbf/bfbf/bfbf\]11;rgb:0000/0000/0000\public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        String[] temp;

        for(int i=0; i < n; i++){
            temp = br.readLine().split(" ");
            for(int j=0; j < 2; j++){
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }

        Arrays.sort(arr, (o1, o2) -> {
           if(o1[0] == o2[0]) {
              return Integer.compare(o1[1], o2[1]);
           }
           else
              return Integer.compare(o1[0], o2[0]);
        });

        for(int i=0; i < n; i++){
            for(int j=0; j < 2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
