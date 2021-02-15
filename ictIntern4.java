import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


//time limit에 걸림
class Result {

    /*
     * Complete the 'perfectSubstring' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static int perfectSubstring(String s, int k) {
    // Write your code here
        int len = s.length();
        int ans = 0, a=0;
        String temp ;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0 ; i < len; i++){
            for(int j = i+1; j <= len; j++){
                temp = s.substring(i, j);
                for(char c : temp.toCharArray()){
                    if(map.get(c) == null) map.put(c, 1);
                    else map.put(c, map.get(c)+1);
                }
                for(char c : map.keySet()){
                    if(map.get(c) != k) {
                        a = 1;
                        break;
                    }
                }
                if(a == 0)
                    ans++;
                System.out.println();
                map.clear();
                a = 0;
            }
        }
        
        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.perfectSubstring(s, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

