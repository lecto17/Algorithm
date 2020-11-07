import java.util.*;

class Solution {
    String getScoreToAlpha(int score){
        String str = "";
        switch(score) {
            case 100:
                str = "A+";
                break;
            case 95:
                str = "A0";
                break;
            case 90:
                str = "A-";
                break;
            case 85:
                str = "B+";
                break;
            case 80:
                str = "B0";
                break;
            case 75:
                str = "B-";
                break;
            case 70:
                str = "C+";
                break;
            case 65:
                str = "C0";
                break;
            case 60:
                str = "C-";
                break;
            case 55:
                str = "D+";
                break;
            case 50:
                str = "D0";
                break;
            case 45:
                str = "D-";
                break;
            case 0:
                str = "F";
                break;
       }
        return str;
    }
    
    int getScore(String score){
        int sc = -1;
        switch(score) {
            case "A+":
                sc = 100;
                break;
            case "A0":
                sc = 95;
                break;
            case "A-":
                sc = 90;
                break;
            case "B+":
                sc = 85;
                break;
            case "B0":
                sc = 80;
                break;
            case "B-":
                sc = 75;
                break;
            case "C+":
                sc = 70;
                break;
            case "C0":
                sc = 65;
                break;
            case "C-":
                sc = 60;
                break;
            case "D+":
                sc = 55;
                break;
            case "D0":
                sc = 50;
                break;
            case "D-":
                sc = 45;
                break;
            case "F":
                sc = 0;
                break;
       }
        return sc;
    }
    
    public String[] solution(String[] grades) {
        String[] answer ;
        Map<String, Integer> map = new HashMap<>();
        String subject;
        String score;
        
        for(String str: grades){
            subject = str.split(" ")[0];
            score = str.split(" ")[1];
            
            if(map.get(subject) == null){
                map.put(subject, getScore(score));
            }
            else{
                if(getScore(score) > map.get(subject)){
                    map.put(subject, getScore(score));
                }
            }            
        }
        
        answer = new String[map.size()];
        int i = 0;
        
        for(String key : map.keySet()){
            // answer[i++] = key+" "+getScoreToAlpha(map.get(key));
            answer[i++] = key+" "+map.get(key).toString();
        }
        
        Arrays.sort(answer, (o1, o2) -> {
            return Integer.parseInt(o2.split(" ")[1]) - Integer.parseInt(o1.split(" ")[1]);            
        });
        
        i = 0;
        for(String str : answer){
            subject = str.split(" ")[0];
            score = str.split(" ")[1];
            answer[i++] = subject+" "+getScoreToAlpha(Integer.parseInt(score));
        }
        
        
        return answer;
    }
}
