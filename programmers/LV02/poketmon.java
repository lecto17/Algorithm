//import java.util.*;
//
//class Solution {
//    public int solution(int[] nums) {
//        int answer = 0;
//        int len = nums.length;
//        int limitNum = nums.length / 2;
//        int cnt = 0;
//        int[] arr;
//        
//        Arrays.sort(nums);
//        
//        arr = new int[nums[len-1]];                       
//        
//        for(int i = 0; i < len; i++){            
//            arr[nums[i] - 1] = 1;            
//        }
//        
//        for(int el : arr)        
//            if(el == 1) cnt++;
//        
//        if(cnt >= limitNum) answer = limitNum;
//        else answer = cnt;
//        
//        return answer;
//    }
//}
