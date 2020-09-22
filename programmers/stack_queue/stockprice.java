//주식 가격
//
// 실행만 맞고 나머지 케이스는 다 틀림
// 10가지 이상 넣은 test case는 실행되는데, 실제 제출시에는 실패함..
// 문제를 잘 못이해하고 있어서 그랬음,, **입출력 예 설명 해주는 부분을 꼼꼼이 읽을 것!!!!**
//
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
//
// 문제 제대로 이해한 후 풀이..
//class Solution {
//    public int[] solution(int[] prices) {
//        int len = prices.length;
//        int[] answer = new int[len];
//        int cnt = 0;
//
//        for(int i = 0; i < len; i++){
//            for(int j = i+1; j < len; j++){
//                cnt++;
//                if(prices[i] > prices[j]){
//                    answer[i] = cnt;
//                    cnt = 0;
//                    break;
//                }
//                if(j == len - 1) {
//                    answer[i] = cnt;
//                    cnt = 0;
//                }
//            }
//        }
//        return answer;
//    }
//}
//
//다른 사람 풀이
//class Solution {
//    public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//
//        for(int i = 0; i < prices.length; i++)
//        {
//            for(int j=i+1; j < prices.length; j++)
//            {
//                if(prices[i] > prices[j])
//                {
//                    answer[i] = j-i;
//                    break;
//                }
//                else
//                    answer[i] = j-i;
//            }
//        }
//
//        //System.out.println(Arrays.toString(answer));
//
//        return answer;
//    }
//}

