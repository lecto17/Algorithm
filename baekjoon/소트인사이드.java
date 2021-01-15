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
