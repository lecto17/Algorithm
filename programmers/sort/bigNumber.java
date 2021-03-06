//가장큰수

//정답 풀이
//import java.util.Arrays;
//import java.util.Comparator;
//
//class Solution {
//    public String solution(int[] numbers) {
//        String answer = "";
//
//        //int 배열을 String 배열로 변환
//        String[] arr = new String[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            arr[i] = (String.valueOf(numbers[i]));
//        }
//
//        //배열 정렬, 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return (s2+s1).compareTo(s1+s2);
//            }
//        });
//
//        //0000 처럼 0으로만 구성되어있으면 0 return
//        if (arr[0].equals("0")) return "0";
//
//        //그 외의 경우 순차적으로 연결하여 answer return
//        for (int i = 0; i < arr.length; i++) {
//            answer+=arr[i];
//        }
//        return answer;
//    }
//}


//재풀이
//
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    List<Integer> list = new ArrayList<Integer>();
//
//    public String solution(int[] numbers) {
//        String answer = null;
//        //findBiggestNum(numbers, answer);
//        answer = findBiggestNum(numbers);
//        return answer;
//    }
//
//    public String[] intToStrArr(List<Integer> list){
//        int size = list.size();
//        String[] strArr = new String[size];
//        for(int i = 0; i < size; i++)
//            strArr[i] = Integer.toString(list.get(i));
//
//        return strArr;
//    }
//
//    public String findBiggestNum(int[] numbers){
//        StringBuffer sb = new StringBuffer();
//        String[] arr = new String[numbers.length];
//        String[] temp = new String[numbers.length];
//        int[] visited = new int[numbers.length];
//        int i = 0;
//        int num =  9;
//        String exchange;
//        for(Integer el : numbers)
//            arr[i++] = el.toString();
//
//        i = 0;
//        while(true){
//            if(i >= numbers.length ) {
//                if(list.size() != 0) {
//                    //arr = list.toArray(new String[list.size()]);
//                    temp = intToStrArr(list);
//                    // Arrays.sort(arr, Collections.reverseOrder());
//
//                    Arrays.sort(temp);
//
//                    // for(String el : temp)
//                    //     System.out.print(el+"\t");
//                    // System.out.println();
//                    for(int q = 0; q < temp.length; q++){
//                        if(!temp[0].contains("0") && temp.length >= 2){
//                            exchange = temp[0];
//                            // System.out.print("q: "+q+", temp[q]: "+ exchange+", ");
//                            for(int k=1; k < temp.length; k++){
//                                temp[k-1] = temp[k];
//                            }
//                            temp[temp.length-1] = exchange;
//
//                            // System.out.println("\ntemp");
//                            // for(String el : temp)
//                            //     System.out.print(el+"\t");
//                            // System.out.println();
//                        }
//                    }
//
//                    // System.out.println();
//                    // for(String el : temp)
//                    //     System.out.print(el+"\t");
//
//                    for(int j = temp.length - 1; j >= 0; j--){
//                        sb.append(temp[j]);
//                    }
//                    list.clear();
//                }
//                num--;
//                i = 0;
//            }
//            if(num == 0)
//                break;
//            if(visited[i] != 1 && arr[i].contains(Integer.toString(num))){
//                list.add(numbers[i]);
//                visited[i] = 1;
//            }
//            i++;
//        }
//
//
//
//        return sb.toString();
//    }
//}


// 내풀이
// 위 풀이에서의 comparator 개념과 0000처럼 0으로만 구성되어 있는 숫자들에 대해서는 고려했다고 생각함
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;

//class Solution {
//    List<Integer> list = new ArrayList<Integer>(); 
//    
//    public String solution(int[] numbers) {
//        String answer = null;
//        //findBiggestNum(numbers, answer);
//        answer = findBiggestNum(numbers);
//        return answer;
//    }
//    
//    public String findBiggestNum(int[] numbers){
//        String answer = null;
//        String[] arr = null;
//        int num = 9;
//        int i = 0;
//        
//        while(true){
//            if(numbers[i] % num == 0){
//                list.add(numbers[i]);
//            }
//            if(i == numbers.length) {
//                if(list.size() != 0) {          
//                    arr = list.toArray(new String[list.size()]);
//                    // Arrays.sort(arr, Collections.reverseOrder());
//                    Arrays.sort(arr);
//                    for(int j = arr.length - 1; j >= 0; j--){
//                        answer += arr[j].toString();
//                        System.out.println("answer: "+ answer);
//                    }
//                    list.clear();
//                    num--;   
//                    i = 0;
//                }
//            }                
//            if(num == 0)
//                break;
//            i++;
//        }
//        return answer;
//    }
//}
