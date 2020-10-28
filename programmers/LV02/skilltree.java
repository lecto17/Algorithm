// 정확도 50 퍼센트
// 어떤 케이스를 다루지 못하는지는 좀 더 고민해봐야겠다.

class Solution {
    public int solution(String skill, String[] skill_trees) {
        
        int skillTreeLen = skill_trees.length;
        int skillLen = skill.length();
        int answer = skillTreeLen;
        int temp = -3;
        
        String[] skillArr = new String[skillLen];
        int[] index = new int[skillLen];
        
        for(int i = 0; i < skillLen; i++){
            skillArr[i] = skill.substring(i, i+1);            
        }
        
        for(int i = 0; i < skillTreeLen; i++){
            for(int j = 0; j < skillLen; j++){
                index[j] = skill_trees[i].indexOf(skillArr[j]);
            }
            temp = index[0];
            for(int j = 1; j < skillLen ; j++){
                
                if(temp > index[j] || (temp == -1) && index[j] != -1){
                    if(index[j] == -1) continue;                
                    temp = index[j];
                    answer--;
                    break;
                }                
                temp = index[j];
                
                if(i == skillTreeLen - 1)
                    return answer;
            }            
        }        
        
        return answer;
    }
}
