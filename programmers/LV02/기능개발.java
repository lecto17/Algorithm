import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int cnt = 0, loop = 1, num, idx=0;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=0; i<progresses.length; i++) {
            queue.add(progresses[i]);
        }
        
        while (!queue.isEmpty()) {
            cnt = 0;
            num = queue.peek();
            
            if (num + speeds[idx] * loop >= 100) {
                queue.poll();
                cnt++;
                for (int i=idx+1; i<speeds.length; i++){
                    if (progresses[i] + speeds[i] * loop >= 100) {
                        queue.poll();
                        cnt++;
                        idx++;
                    } else {
                        break;
                    }
                }
                list.add(cnt);
                idx++;
                loop++;
            } else {
                loop++;
            }
        }
        
        answer = new int[list.size()];
        int d = 0;
        
        for(Integer it: list) {
            answer[d++] = it;
        }
        
        return answer;
    }
}
