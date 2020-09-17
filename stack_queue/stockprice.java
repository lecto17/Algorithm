//주식 가격
//
// 실행만 맞고 나머지 케이스는 다 틀림
// import java.util.*;
//
//class Solution {
//    public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//        int cnt = 0;
//
//        for(int i = 0; i < prices.length; i++){
//            for(int j = i+1; j < prices.length; j++){
//                if(prices[i] <= prices[j]) {
//                    cnt++;
//
//                    if(j == prices.length-1){
//                        answer[i] = cnt;
//                        cnt = 0;
//                    }
//                }
//                else {
//                    if(j == prices.length-1){
//                        answer[i] = cnt;
//                        cnt = 0;
//                    }
//                }
//            }
//        }
//
//        return answer;
//    }
//}
