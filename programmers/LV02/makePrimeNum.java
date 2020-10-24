//소수 만들기
//
//다른 사람 풀이
//
//class Solution {
//    public static int result = 0;
//    public int solution(int[] nums) {
//        int answer = 0;
//        int n = nums.length;
//        int r = 3;
//
//        int[] arr = new int[n];
//        combination(arr, 0, n, r, 0, nums);
//        answer = result;
//        //if(n == r || r == 0) 
//          //  return result = 1;
//        //else 
//            //result = combination2(n - 1, r - 1) + combination(n - 1, r);
//
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        //System.out.println("result : " + result);
//
//        return answer;
//    }
//
//    public int combination2(int n, int r) {
//
//        if(n == r || r == 0) 
//            return 1;
//        else 
//            return combination2(n - 1, r - 1) + combination2(n - 1, r);
//
//    }
//
//    public static void combination(int[] arr, int index, int n, int r, int target, int[] nums) { 
//        if (r == 0) 
//            print(arr, index); 
//        else if (target == n) 
//            return; 
//        else { 
//            arr[index] = nums[target]; 
//            combination(arr, index + 1, n, r - 1, target + 1, nums); 
//            combination(arr, index, n, r, target + 1, nums); 
//        } 
//    }//end combination() 
//    public static void print(int[] arr, int length) { 
//        int cnt = 0;
//        boolean isPrime = false;
//        for (int i = 0; i < length; i++) {
//            cnt += arr[i];
//            // System.out.print(arr[i]); 
//
//        }
//        System.out.println("cnt :" + cnt);
//         for (int i = 2; i < cnt; i++) {
//            // 1과 num 자신 외에 나누어지는 수가 있는지 검사할 조건문
//            if (cnt % i == 0) {
//                // 나누어지는 수가 있을 경우 isPrime의 값을 true로 바꾼다.
//                isPrime = true;
//                // 한 번이라도 이 조건문이 실행될 경우 num은 소수가 아니므로 반복문을 빠져나온다.
//                break;
//            }
//        }
//
//        if (!isPrime) {
//            result++;
//        }
//
//
//
//    }
//
//}
//
//
//import java.util.*;
//
//class Solution {
//    public int solution(int[] nums) {
//        int answer = 0, sum = 0;
//        int len = nums.length;        
//        
//        for(int i = 0; i < len; i++){
//            for(int j = i + 1; j < len; j++){
//                for(int k = j +1; k < len; k++){
//                    sum = nums[i] + nums[j] + nums[k];
//                    //System.out.println("sum : "+ sum+". answer: "+ answer);
//                    answer += findPrime(sum);
//                    //System.out.println("answer: "+ answer);
//                }
//            }
//        }
//        
//        return answer;
//    }
//    
//    public int findPrime(int num){
//        int cnt = 0;
//        for(int i = 2; i <= num; i++){
//            if(num % i == 0){
//               if(cnt >= 2)
//                    return 0;  
//                else if(num == i * i)
//                    cnt += 2;
//                else
//                    cnt++;
//            }  
//        }
//        return 1;
//    }
//}
//
//
//
//import java.util.*;
//
//class Solution {
//    public int solution(int[] nums) {
//        int answer = 0, sum = 0;
//        int len = nums.length;
//        int count = (len * (len-1) * (len - 2)) / (3 * 2 * 1);
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < nums; i++){
//            map.put(i, 0);
//        }
//
//        for(int i = 0; i < count; i++){
//            for(int j = 0;)
//        }
//
//        return answer;
//    }
//
//    public int findPrime(int num){
//        int cnt = 0;
//        for(int i = 2; i <= num; i++){
//            if(num % i == 0){
//               if(cnt >= 2)
//                    return 0;
//                else
//                    cnt++;
//            }
//        }
//        return 1;
//    }
//}
