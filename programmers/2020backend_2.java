import java.util.*;

public class Solution {
    public String solution(String p, int n) {
        String answer = null;
        String[] temp = new String[2];
        String[] time = new String[3];
        temp = p.split("\\s");
        time = temp[1].split(":");
        int hour = 0, minute = 0, second = 0;
        int num = 0;
        int a;
        
        hour = n / 3600;
        minute = (n - hour*3600) / 60;
        second = (n - hour*3600) % 60;
              
        a = Integer.parseInt(time[2]) + second;
        if(a >= 60) {
            a -= 60;            
            num = 1;
        }
        time[2] = Integer.toString(a);
        
        a = Integer.parseInt(time[1]) + minute;
        a += num;
        num = 0;        
        if(a >= 60) {            
            a -= 60;            
            num = 1;
        }
        time[1] = Integer.toString(a);
        
        a = Integer.parseInt(time[0]) + hour;
        a += num;        
        time[0] = Integer.toString(a);
        
        if(temp[0].equals("PM")){
            if(time[0].equals("12") && temp[1].split(":")[0].equals("11")) answer = "00";                   
            else if(time[0].equals("12") && temp[1].split(":")[0].equals("12")) answer = "12";
            else answer = Integer.toString(12+Integer.parseInt(time[0]));
        } 
        else {
            if(time[0].equals("12")) answer = "00";
            else answer = "0"+time[0];
        }        
        
        if(Integer.parseInt(time[1]) < 10) answer += (":0"+time[1]);
        else answer += (":"+time[1]);
        if(Integer.parseInt(time[2]) < 10) answer += (":0"+time[2]);
        else answer += (":"+time[2]);
        
        return answer;
    }
}
