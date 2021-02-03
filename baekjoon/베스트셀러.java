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

        int big = 0;
        for(String s : keySetList){
            big = Math.max(big, map.get(s));
        }
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        Collections.sort(keySetList);
        for(String str : keySetList){
            if(map.get(str) == big){
                sb.append(str+"\n");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}



//출력 초과, Collections.sort() time complexity가 nlog(n)이기에 n보다 안좋음.
//
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


        //value를 기준으로 내림차순 정렬
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
