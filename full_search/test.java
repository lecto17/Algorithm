//모의고사
//
import java.util.*;

class Solution {
    public Integer[] solution(int[] answers) {
        Integer[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        
        int score1 = 0; int score2 = 0; int score3 = 0;        
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == student1[i % 5])
                score1++;
            if(answers[i] == student2[i % 8])
                score2++;
            if(answers[i] == student3[i % 10])
                score3++;
        }
        
        // switch - case 문에서 case에 들어가는 자리에는 constant만 들어갈 수 있다.
        // int a1, a2, a3;
        // for (int i = 0; i < answers.length; i++){
        //     const a1 = student1[i % 5];
        //     const a2 = student2[i % 8];
        //     const a3 = student3[i % 10];
        //     switch (answers[i]) {
        //         case a1:
        //             score1++;
        //         case a2:
        //             score2++;
        //         case a3:
        //             score3++;                    
        //     }
        // }
        
        //1이 가장 큰경우
        if(score1 >= score2 && score1 >= score3){
            list.add(1);
            if(score2 == score1){
                list.add(2);                
            }
            if(score3 == score1){
                list.add(3);                
            }
        } 
        //2가 가장 큰경우
        else if(score1 <= score2 && score2 >= score3){
            if(score1 == score2){
                list.add(1);
                list.add(2);
            }             
            else
                list.add(2);
            if(score2 == score3){
                list.add(3);
            }   
        }
        //3이 가장 큰 경우
        else if(score1 <= score3 && score2 <= score3){
            if(score1 == score3){
                list.add(1);
                if(score2 == score3){
                    list.add(2);
                    list.add(3);
                }
                else
                    list.add(3);
            }
            else{
                if(score2 == score3){
                    list.add(2);
                    list.add(3);                   
                }               
                else
                    list.add(3);                
            }
        }
        answer = (Integer[])list.toArray(new Integer[list.size()]);
        return answer;
    }
}

//표준 풀이
//import java.util.ArrayList;
//class Solution {
//    public int[] solution(int[] answer) {
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
//        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//        int[] score = new int[3];
//        for(int i=0; i<answer.length; i++) {
//            if(answer[i] == a[i%a.length]) {score[0]++;}
//            if(answer[i] == b[i%b.length]) {score[1]++;}
//            if(answer[i] == c[i%c.length]) {score[2]++;}
//        }
//        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
//        ArrayList<Integer> list = new ArrayList<>();
//        if(maxScore == score[0]) {list.add(1);}
//        if(maxScore == score[1]) {list.add(2);}
//        if(maxScore == score[2]) {list.add(3);}
//        return list.stream().mapToInt(i->i.intValue()).toArray();
//    }
//}
