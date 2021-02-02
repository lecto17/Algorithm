import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());        
        int temp;
        StringBuffer sb = new StringBuffer();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(n-- > 0){
            temp = Integer.parseInt(br.readLine());
            if(temp == 0){
                if(pq.size() == 0)
                    sb.append("0\n");
                else
                    sb.append(pq.poll()+"\n");
            }
            else{
                pq.add(temp);
            }
        }
        System.out.println(sb.toString());
    }
}

//시간초에서 실패.. 
//시간 제한은 1초, 평균 채점 시간은 8초

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());        
        int temp, num;
        StringBuffer sb = new StringBuffer();

        Map<Integer, Integer> map = new TreeMap<>();

        for(int i=0; i < n; i++){
            temp = Integer.parseInt(br.readLine());
            if(temp == 0){
                if(map.size() != 0){                    
                    num = (int)map.keySet().toArray()[0];
                    sb.append(num+"\n");
                    map.put(num, map.get(num)-1);
                    if(map.get(num) <= 0)
                        map.remove(num);                    
                }
                else
                    sb.append("0\n");
            }
            else {
                if(map.get(temp) == null)
                    map.put(temp, 1);
                else
                    map.put(temp, map.get(temp) + 1);
            }
        }

        System.out.println(sb.toString());
    }
}
