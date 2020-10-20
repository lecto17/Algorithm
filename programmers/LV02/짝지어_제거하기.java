//자료구조 Stack을 사용하여 푸는 문제
//표준 풀이
//
//import java.util.Stack;
//
//public class Solution {
//    public static int solution(String s) {
//        Stack<character> stack = new Stack<>();
//
//        for(char c : s.toCharArray())
//          if(!stack.isEmpty() && stack.peek() == c) stack.pop();
//          else stack.push(c);
//
//        return stack.isEmpty() ? 1 : 0;
//    }
//}
//
//
//
//내풀이
//
 //class Solution
 //{
 //    char[] chArr;
 //    String[] stArr;
 //    int len, cnt = 0;
 //
 //    public int solution(String s) {
 //        int answer = 0;
 //        answer = recursive(s);
 //        // if(s.substring(0 ,0).equals(""))
 //        //     System.out.print("yes");
 //
 //        return answer;
 //    }
 //
 //    public int recursive(String s){
 //        String tmp;
 //
 //        len = s.length();
 //        stArr = new String[len];
 //
 //        if(s.equals(""))
 //            return 1;
 //        if(len % 2 == 1)
 //            return 0;
 //
 //        for(int i = 0; i < len; i++){
 //            stArr[i] = s.substring(i, i+1);
 //        }
 //
 //        for(int i = 0; i < s.length()-1; i++){
 //            tmp = s.substring(i, i+1);
 //            for(int j = i+1; j < s.length(); j++){
 //                if(tmp.equals(stArr[j])){
 //                    tmp = s.substring(0, i) + s.substring(i+2, s.length());
 //                    recursive(tmp);
 //                }
 //                else
 //                    break;
 //            }
 //        }
 //
 //        return 0;
 //    }
 //}
