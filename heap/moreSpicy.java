//더 맵게
//
//import java.util.*;

//class Solution {
//    public int solution(int[] scoville, int K) {
//        int answer = 0;
//        int newVal = 0;
//        PriorityQueue<Integer> heap = new PriorityQueue<>(scoville.length);
//        
//        for (int el : scoville)
//            heap.offer(el);
//        
//        while(heap.peek() <= K){
//            if(heap.size() == 1)
//                return -1;
//            
//            int first = heap.poll();
//            int second = heap.poll();
//            newVal = first + (second * 2);
//            
//            heap.offer(newVal);
//            answer++;
//               
//        }
//        
//        return answer;
//    }
//}
//
//
//
// 내 코드
// 뭐가 안되는 건지 모르겠다.
// import java.util.*;

//class Solution {
//    public int solution(int[] scoville, int K) {
//        int answer = 0;
//        int newVal = 0
//
//        while(true){
//            Arrays.sort(scoville);
//            if(scoville[0] == 0 && scoville[1] == 0)
//                return -1;
//
//            newVal = scoville[0] + (scoville[1] * 2);
//            answer++;
//            if(newVal >= K)
//                break;
//            else
//                scoville[0] = newVal;
//        }
//
//        return answer;
//    }
//}
