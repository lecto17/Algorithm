//표준 풀이
//
//import java.util.*;
//class Solution {
//    public int[] solution(String[] genres, int[] plays) {
//        int[] answer;
//		
//		List<Integer> answerlist = new ArrayList<Integer>();
//		HashMap<String, Integer> genrePlayHashMap = new HashMap<String, Integer>();
//		
//		for(int i =0; i<genres.length; i++) {
//			genrePlayHashMap.put(genres[i], genrePlayHashMap.getOrDefault(genres[i], 0)+plays[i]);
//		}
//		Set<String> key = genrePlayHashMap.keySet();
//		//플레이수 : 장르 를 담을 해쉬맵
//		HashMap<Integer, String> playGenreHashMap = new HashMap<Integer, String>();
//		for(String k : key) {
//			playGenreHashMap.put(genrePlayHashMap.get(k), k);
//		}
//		
//		//플레이수 : 장르  오름차순
//		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(playGenreHashMap);
//		
//		int treeMapSize = treeMap.size();
//		for(int i =0; i<treeMapSize; i++) {
//			String genre = treeMap.lastEntry().getValue();
//			int deleteKey = treeMap.lastEntry().getKey(); // TreeMap 지울때 사용.
//			int max = -1, nextmax = -1;
//			int maxIndex = -1, nextmaxIndex = -1;
//
//			//해당 장르에서 가장 큰놈. 둘째놈 list에 넣기
//			for(int g =0; g<genres.length; g++) {
//				if(genres[g].equals(genre)) {
//                    //check 는 1,2 번째 수가 같은 경우.
//                    // 같지 않아야 true
//					boolean check = max != plays[g];
//					max = Math.max(max, plays[g]);
//					if(plays[g] == max && check) {
//						maxIndex = g;
//					}
//				}
//			}
//			plays[maxIndex] = -1;
//			genres[maxIndex] = "-1";
//			answerlist.add(maxIndex);
//			
//			for(int g =0; g<genres.length; g++) {
//				if(genres[g].equals(genre)) {
//					nextmax = Math.max(nextmax, plays[g]);
//					if(plays[g] == nextmax) {
//						nextmaxIndex = g;
//					}
//				}
//			}
//            // 곡이 하나인 경우 -1 로 계속남게됨
//			if(nextmaxIndex != -1) { 
//				plays[nextmaxIndex] = -1;
//				genres[nextmaxIndex] = "-1";
//				answerlist.add(nextmaxIndex);
//			}
//            //삭제해주어야 lastEntry 할때 차수의 장르가 나오게 됨.
//			treeMap.remove(deleteKey); 
//		}
//		answer = new int[answerlist.size()];
//		for(int i = 0; i<answerlist.size(); i++) {
//			answer[i]= answerlist.get(i);
//		}
//		
//		return answer;
//    }
//}
//
//
//내 풀이 미완성
//
//import java.util.*;

 //class Obj{
 //    String genre;    
 //    int idx ;
 //    int value ;    
 //    
 //    public Obj(String genre, int idx, int value){
 //        this.genre = genre;
 //        this.idx = idx;;
 //        this.value = value;        
 //        
 //    }
 //    
 //}
 //
 //class Solution {
 //    public int[] solution(String[] genres, int[] plays) {
 //        int[] answer = {};
 //        int len = genres.length;        
 //        Obj[] objArr = new Obj[len];
 //        int i, j;
 //        
 //        for(i = 0; i < len; i++)
 //            objArr[i] = new Obj(genres[i], i, plays[i], plays[i]);                
 //                    
 //        for(i = 0; i < len; i++) {
 //            for(j = i+1; j < len; j++) {             
 //                //같은 장르일 경우
 //                if(objArr[i].genre.equals(genres[j])){
 //                                        
 //                }                 
 //                //다른 장르일 경우
 //                if(i == len -1){
 //                    
 //                }
 //            }
 //        }
 //        
 //        // i = 0;
 //        // for(Obj o : objArr){
 //        //     System.out.print("genre: "+ o.genre + ", ");
 //        //     System.out.print("idx: "+ o.idx.get(i) + ", ");
 //        //     System.out.print("value: "+ o.value.get(i) + ", ");
 //        //     System.out.print("total: "+ o.total+"\n");
 //        //     i++;
 //        // }            
 //        
 //        return answer;
 //    }
 //}
