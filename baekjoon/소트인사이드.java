import java.util.*;

public class Test {            

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        String temp = Integer.toString(n);

        int len = temp.length();

        int[] arr = new int[len];
        
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(temp.substring(i, i+1));
        }

        temp = "";
        Arrays.sort(arr);

        for(int i = len-1; i >= 0; i--){
            temp += Integer.toString(arr[i]);
        }

       System.out.println(Integer.parseInt(temp));


        sc.close();
    }
}


import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n ;
        n = sc.nextLong();
        String temp = Long.toString(n);

        int len = temp.length();

        Integer[] arr = new Integer[len];

        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(temp.substring(i, i+1));
        }

        temp = "";
        Arrays.sort(arr, Collections.reverseOrder());

        for(Integer i : arr)
            temp += i;

        sc.close();

        System.out.println(temp);
    }
}

//Scanner 보다 BufferedReader를 사용하는 것이 빠르다.
//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
	
	Arrays.sort(arr);

        for(int i=arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}
