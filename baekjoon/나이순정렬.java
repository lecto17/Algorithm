import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int age;
        String name;
        String[] temp ;
        Queue<String> queue = null;
        Map<Integer, Queue<String>> map = new TreeMap<>();

        for (int i=0; i < n; i++){            
            temp = br.readLine().split(" ");
            age = Integer.parseInt(temp[0]);
            name = temp[1];
            if(map.get(age) == null){
                queue = new LinkedList<>();
                queue.add(name);
                map.put(age, queue);
            }
            else{
                map.get(age).add(name);
                map.put(age, map.get(age));
            }                        
        }

        for(Integer i : map.keySet()){
            for(String str: map.get(i)){
                System.out.println(i +" "+ str);
            }
        }
            
                
    }
}
