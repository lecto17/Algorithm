import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        String temp;

        for(int i=0 ;i < n; i++){
            temp = br.readLine();
            if(map.get(temp) == null)
                map.put(temp, 1);
            else
                map.put(temp, map.get(temp)+1);
        }

        List<String> keySetList = new ArrayList<>(map.keySet());


        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        int big = map.get(keySetList.get(0));
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for(String key : keySetList){
            if(map.get(key) == big)
                list.add(key);
        }
        Collections.sort(list);
        for(String str : list)
            sb.append(str+"\n");
        System.out.println(sb.toString());
    }
}
