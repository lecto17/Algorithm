import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int m = Integer.parseInt(str.split(" ")[1]);
        int nCnt = 0, mCnt = 0;
        char[][] temp = new char[n][m];
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < n; i++){
            //trim은 문자열의 앞, 뒤의 공백만을 제거해준다. 문자열 내에 있는 가운데의 공백은 replace를 통해 제거한다.
            //temp[i] = br.readLine().trim().toCharArray();
            temp[i] = br.readLine().replace(" ", "").toCharArray();
        }

        System.out.println();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(temp[i][j] == 'X' || temp[i][j] == 'x'){
                    if(list.indexOf(j) == -1){
                        list.add(j);
                        mCnt++;
                    }
                }
            }
        }

        list.clear();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(temp[j][i] == 'X' || temp[j][i] == 'x'){
                    if(list.indexOf(j) == -1){
                        list.add(j);
                        nCnt++;
                    }
                }
            }
        }

        if(mCnt == 0 && nCnt == 0) System.out.println(Math.max(m, n));
        else System.out.println(Math.max(n - nCnt, m - mCnt));
        
    }
}


// 입력으로 . 혹은 X를 받아들여야 한다는 것을 놓쳤다, 만약 . X를 입력으로 받아들이지 않는 거였다면 아래처럼 풀어도 가능했을 것이지만, 입력을 받아야 한다. 그리고 입력을 받을 때, 행 혹은 열이 겹친 상황일 수도 있으므로 각 행과 열에 없는 경비원의 숫자를 각각 구해 더 큰쪽을 택하면 된다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int m = Integer.parseInt(str.split(" ")[1]);

        int min = Math.min(n, m);
        System.out.println(min);
        
    }
}
