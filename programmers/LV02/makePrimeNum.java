//소수 만들기
//
//풀이 참고
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
