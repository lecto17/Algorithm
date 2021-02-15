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



import java.util.*;

class Result {

    /*
     * Complete the 'funWithAnagrams' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY text as parameter.
     */

    public static List<String> funWithAnagrams(List<String> text) {
    // Write your code here
        List<String> list = new ArrayList<String>();
        
        int len = text.size();
        
        String temp1, temp2, res1="", res2="";
        char[] ctemp1, ctemp2;
        Map<String, Integer> map= new HashMap<>();
        for(int i=0; i < len-1; i++){
            for(int j =i+1; j <len; j++){
                temp1 = text.get(i);
                temp2 = text.get(j);
                
                ctemp1 = new char[temp1.length()]; ctemp1 = temp1.toCharArray();
                ctemp2 = new char[temp2.length()]; ctemp2 = temp2.toCharArray();
                
                Arrays.sort(ctemp1);
                Arrays.sort(ctemp2);
                
                res1 = new String(ctemp1);
                res2 = new String(ctemp2);
                if(res1.equals(res2)){
                    if(map.get(res1) == null) {
                        list.add(temp1);
                        map.put(res1, 1);
                    }
                }
            }
            if(map.get(res1) == null){
                list.add(res1);
            }
        }
        if(map.get(res2) == null)
            list.add(res2);
    
        Collections.sort(list);
        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int textCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> text = IntStream.range(0, textCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.funWithAnagrams(text);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

