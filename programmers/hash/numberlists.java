//내 풀이

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int arrLen = phone_book.length;        
        Arrays.sort(phone_book);
        for (int i = 0; i < arrLen; i++){            
            for(int j = i+1; j < arrLen; j++){                
                if(phone_book[j].startsWith(phone_book[i])){
                    answer = false;
                    return answer;
                }
            }
        }                        

        return answer;
    }
}

//다른 사람 풀이
class Solution {
    public boolean solution(String[] phoneBook) {
       for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
		//배열에서 첫번째 이후의 요소로 첫번째를 검사하는
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
    }
}
