//어느 방향에서 왔는지 까지 체크해야함!
//바로 위와 같이 7번처럼 방문이 안되야하는데 된걸로 되서 잘못풀었단거를 꺠달았습니다.



//그래서 어디서 어디로 왔는지 알아야했습니다. 이를 4차원 배열을 이용해서 풀었습니다. 1,2 차원 지점에서 3,4차원지점으로 이동했다는 것을 기록합니다.
//
//문제 풀이방법이 더 간단해졌습니다.
//참조 : https://youngest-programming.tistory.com/297
//
//class Solution {
//    private static int answer = 0;
//    private static boolean[][][][] isVisited = new boolean[11][11][11][11]; // (x,y) -> (x,y) 로 이동한 적 있는지
//    private static int x, y; //현재좌표
//    private static int x2, y2; //이동할좌표
//    private static int[] dx = {-1, 0, 1, 0};
//    private static int[] dy = {0, -1, 0, 1};
//
//    public int solution(String dirs) {
//        x = 5;
//        y = 5;
//        x2 = 5;
//        y2 = 5;
//        for (char move : dirs.toCharArray()) {
//            x = x2;
//            y = y2;
//            if (move == 'L') { //좌하우상
//                x2 = x + dx[0];
//                y2 = y + dy[0];
//            } else if (move == 'D') {
//                x2 = x + dx[1];
//                y2 = y + dy[1];
//            } else if (move == 'R') {
//                x2 = x + dx[2];
//                y2 = y + dy[2];
//            } else {
//                x2 = x + dx[3];
//                y2 = y + dy[3];
//            }
//
//            //범위벗어난거처리
//            if (x2 < 0 || x2 > 10 || y2 < 0 || y2 > 10) {
//                //이동하기 전 좌표로 바꿔줌
//                x2 = x;
//                y2 = y;
//                continue;
//            }
//
//            //이동가능한 좌표, 첫방문이면 답 +1
//            if (!isVisited[x][y][x2][y2]) {
//                isVisited[x][y][x2][y2] = true;
//                isVisited[x2][y2][x][y] = true;
//                answer++;
//            }
//        }
//
//        return answer;
//    }
//}
//

// 방문했던 점을 for 문안에서 언제 map에 넣어주는지

import java.util.*;

class Solution {
    public int check(int xPos, int yPos){
        if(xPos > 5 || xPos < -5 || yPos > 5 || yPos < -5)
            return 1;
        return 0;
    }
    public int solution(String dirs) {
        int answer = 0;
        int dirLen = dirs.length();
        int xPos = 0, yPos =0;
        Map<String, Integer> map = new HashMap<>();
        String str="00";        
            
        for(int i = 0; i < dirLen; i++){
            str = Integer.toString(xPos) + Integer.toString(yPos);            
            if(map.get(str) == null){                
                map.put(str, 1);
            }            
            
            switch(dirs.substring(i, i+1)){
                case "U":
                    if(xPos <= 5 && yPos <= 5 && xPos >= -5 && yPos >= -5){                        
                        //같은 지점을 방문하지 않았을 경우
                        if(map.get(str) == 1){
                            yPos++;
                            if(check(xPos,yPos)==1){
                                yPos--;
                                break;  
                            }
                            answer++;
                            map.put(str, 2);
                        }
                        else yPos++;
                    }                    
                    break;
                case "D":
                    if(xPos <= 5 && yPos <= 5 && xPos >= -5 && yPos >= -5){
                        //같은 지점을 방문하지 않았을 경우                                                
                        if(map.get(str) == 1){
                            yPos--;                            
                            if(check(xPos,yPos)==1) {
                                yPos++;
                                break;
                            }
                            answer++;                                                                
                            map.put(str, 2);
                        }
                        else yPos--;
                    }
                    break;                
                case "R":
                    if(xPos <= 5 && yPos <= 5 && xPos >= -5 && yPos >= -5){                        
                        //같은 지점을 방문하지 않았을 경우                                                
                        if(map.get(str) == 1){
                            xPos++;
                            if(check(xPos,yPos)==1){
                                xPos--;
                                break;  
                            } 
                            answer++;            
                            map.put(str, 2);
                        }
                        else xPos++;
                    }
                    break;
                case "L":
                    if(xPos <= 5 && yPos <= 5 && xPos >= -5 && yPos >= -5){                        
                        //같은 지점을 방문하지 않았을 경우                                                
                        if(map.get(str) == 1){
                            xPos--;
                            if(check(xPos,yPos)==1){
                                xPos++;
                                break;    
                            } 
                            answer++;                        
                            map.put(str, 2);
                        }
                        else xPos--;
                    }                    
                    break;
            }
            System.out.println("i: "+i+", str: "+str+", answer: "+ answer);
        }
        
        return answer;
    }
}
