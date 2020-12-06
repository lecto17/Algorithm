import java.util.*;

public class Dijkstra{

    public void dijkstra(int n, int[][] W, List<String> f){
        int i, vnear=0, cnt = 0, min;
        String edge;
        int[] touch = new int[n];
        int[] length = new int[n];

        for(i = 1; i < touch.length; i++){
            touch[i] = 0;
            length[i] = W[0][i];
        }

        while(cnt++ < n-1){
            min = 9999;
            for(i = 1; i < n; i++){
                if(0 <= length[i] && length[i] < min){
                    min = length[i];
                    vnear = i;
                }
            }
            edge = ((touch[vnear] + 1)+" "+(    vnear+1)).toString();
            f.add(edge);
            for(i = 1; i < n; i++){
                if(length[vnear] + W[vnear][i] < length[i]){
                    length[i] = length[vnear] + W[vnear][i];
                    touch[i] = vnear;
                }
            }
            length[vnear] = -1;                
        }        
    }

    public static void main(String[] args){ 
        int n = 6;
        List<String> list = new ArrayList<>();
        int[][] W = {{0, 9999, 3, 9999, 1, 2}, {9999, 0, 7, 9999, 9999, 9999}, 
        {9999, 9999, 0, 5, 9999, 9999}, {9999, 1, 2, 0, 9999, 9999}, 
        {9999, 6, 3, 9999, 0, 9999}, {3, 9999,9999,9999,9999,0}};
        
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(n, W, list);
        for(String str: list)
            System.out.println(str);
    }
}