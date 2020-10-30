import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;        
        int position = 0;
        
        ans = suit(n, position, ans);
        
        return ans;
    }
    public int suit(int n, int position, int ans){        
        position = n;
        
        while(position != 0){
            if(position % 2 == 0){
                position /= 2;
            }
            else{
                position -= 1;
                ans++;
            }
        }
        return ans;
    }
}
