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


//test case 2개가 time limit에 걸림..
class Result {

    /*
     * Complete the 'maxInversions' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long maxInversions(List<Integer> arr) {
    // Write your code here
        long ans = 0;
        int len = arr.size();
        int I,J,K;
        int[] temp = new int[len];
        int idx=0;
        for(Integer it : arr)
            temp[idx++] = it;
            
        for(int i=0; i < len-2; i++){
            for(int j=i+1; j < len-1; j++){
                for(int k=j+1; k < len; k++){
                    I = temp[i]; J = temp[j]; K = temp[k];
                    if(K < J && J < I) 
                        if(i < j && j < k) 
                            ans++;
                }
            }
        }
        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.maxInversions(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

