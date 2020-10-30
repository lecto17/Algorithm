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
