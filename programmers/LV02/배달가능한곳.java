class Solution {
    public String solution(int n, int[][] delivery) {
        String answer = "";
        int[] arr = new int[n];        
        
        Arrays.sort(delivery, (o1, o2) ->{
            return Integer.compare(o2[2], o1[2]);
        });
        
        for(int i = 0; i < delivery.length; i++){
            
            if(delivery[i][2] == 1){
                arr[delivery[i][0] - 1] = 1;
                arr[delivery[i][1] - 1] = 1;
            }
            else{
                if(arr[delivery[i][0] -1] == 1)
                    arr[delivery[i][1] -1] = -1;
                else if(arr[delivery[i][1] -1] == 1)
                    arr[delivery[i][0] -1] = -1;
            }            
        }                
        
        for(int i =0; i < n; i++){
            switch(arr[i]){
                case 1:
                    answer += "O";
                    break;
                case -1:
                    answer += "X";
                    break;
                case 0:
                    answer += "?";
                    break;
            }
        }
        
        return answer;
    }
}


