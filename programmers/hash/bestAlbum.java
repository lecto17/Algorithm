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
//풀이(3)
//통과하는 경우는 많아졌지만, 런타임 에러와 통과 못하는 부분 수정해야함.
//import java.util.*;

class Element implements Comparable<Element> {
    int idx;
    int value;    
    
    public Element(int idx, int value){
        this.idx = idx;
        this.value = value;        
    }
    
    @Override
    public int compareTo(Element el){
        if(this.value > el.value)
            return -1;
        return 1;
    }
}

class Obj implements Comparable<Obj> {
    String genre = "";        
    List<Element> list = null;            
    int total = 0;
    
    public Obj(String genre, int idx, int value){
        Element el = new Element(idx, value);
        this.genre = genre;
        this.total += value;
        list = new ArrayList<Element>();
        list.add(el);                
    }
    
    @Override
    public int compareTo(Obj o){
        if(this.total > o.total)
            return -1;
        return 1;
    }
    
}
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = null;
        int len = genres.length;        
        List<Obj> list = new ArrayList<Obj>();
        int a = 0;
        int idx = -1;
        int LOOPCNT = 2;
        String gnre = "";
        
        for(int i = 0; i < len; i++){
            for(Obj obj : list){
                //genre에 해당하는 Object가 만들어졌을 경우
                if(genres[i].equals(obj.genre)){
                    obj.total += plays[i];
                    obj.list.add(new Element(i, plays[i]));
                    a = 1;
                    break;
                }   
            }
            //genre에 해당하는 Object가 만들어져 있지 않은 경우
            if(a == 0)
                list.add(new Obj(genres[i], i, plays[i]));
            a = 0;
        }                  
        
        Collections.sort(list);
        
        Obj tmpList = null;
        len = list.size();
        answer = new int[len * LOOPCNT];
        
        for(int i = 0; i < len; i++){
            tmpList = list.get(i);
            Collections.sort(tmpList.list);                        
            
            for(int j = 0; j < LOOPCNT; j++ ){
                answer[j + i*2] = tmpList.list.get(j).idx;
                // System.out.println("answer["+(j +i*2)+"]: "+answer[j + i*2] );
                // System.out.println("total: "+ tmpList.total);
            }
            //System.out.println("answer["+i+"]: "+ answer[i]);
        }    
        
        return answer;
    }
}
//내 풀이(2)
//
//import java.util.*;
//
//class Element implements Comparable<Element> {
//    int idx;
//    int value;    
//    
//    public Element(int idx, int value){
//        this.idx = idx;
//        this.value = value;        
//    }
//    
//    @Override
//    public int compareTo(Element el){
//        if(this.value > el.value)
//            return -1;
//        return 1;
//    }
//}
//
//class Obj implements Comparable<Obj> {
//    String genre = "";        
//    List<Element> list = null;            
//    int total = 0;
//    
//    public Obj(String genre, int idx, int value){
//        Element el = new Element(idx, value);
//        this.genre = genre;
//        list = new ArrayList<Element>();
//        list.add(el);                
//    }
//    
//    @Override
//    public int compareTo(Obj o){
//        if(this.total > o.total)
//            return -1;
//        return 1;
//    }
//    
//}
//
//class Solution {
//    public int[] solution(String[] genres, int[] plays) {
//        int[] answer = null;
//        int len = genres.length;        
//        List<Obj> list = new ArrayList<Obj>();
//        int a = 0;
//        int big = 0;
//        int idx = -1;
//        int LOOPCNT = 2;
//        String gnre = "";
//        
//        for(int i = 0; i < len; i++){
//            for(Obj obj : list){
//                //genre에 해당하는 Object가 만들어졌을 경우
//                if(genres[i].equals(obj.genre)){
//                    obj.total += plays[i];
//                    obj.list.add(new Element(i, plays[i]));
//                    a = 1;
//                    break;
//                }   
//            }
//            //genre에 해당하는 Object가 만들어져 있지 않은 경우
//            if(a == 0)
//                list.add(new Obj(genres[i], i, plays[i]));
//            a = 0;
//        }                  
//        
//        Collections.sort(list);
//        
//        Obj tmpList = null;
//        len = list.size();
//        answer = new int[len*LOOPCNT];        
//        
//        for(int i = 0; i < len; i++){
//            tmpList = list.get(i);
//            Collections.sort(tmpList.list);                        
//            
//            for(int j = 0; j < LOOPCNT; j++ ){
//                answer[j+i*2] = tmpList.list.get(j).idx;
//            }
//        }    
//        
//        return answer;
//    }
//}
//
//
//내 풀이 미완성(1)
//
//
//
// import java.util.*;
//
//class Element{
//    int value;
//    int idx;
//    
//    public Element(int value, int idx){
//        this.value = value;
//        this.idx = idx;
//    }
//}
//
//class Obj{
//    String genre = "";    
//    List<Element> list = null;    
//    Set<String> keys = null;
//    HashMap<String, List<Element>> hash = null;    
//    Iterator<String> itr = null;        
//    int a = 0;        
//    
//    public Obj(String genre, int idx, int value){
//        Element el = new Element(idx, value);
//        this.genre = genre;
//        
//        if(hash != null){
//            keys = hash.keySet();
//            itr = keys.iterator();
//            
//            while(itr.hasNext()){
//                if(genre.equals(itr)) {
//                    list.add(el);
//                    hash.put(itr.toString(), list);
//                    a = 1;
//                }              
//                itr.next();
//            }
//        }                
//                                
//        if(a == 0) {
//            hash = new HashMap<>();
//            list = new ArrayList<>();
//            list.add(el);
//            hash.put(genre, list);
//        }       
//        for(Element e : hash.get("classic"))
//            System.out.println("idx: "+e.idx +", "+e.value);
//    }
//    
//}
//
//class Solution {
//    public int[] solution(String[] genres, int[] plays) {
//        int[] answer = {};
//        int len = genres.length;        
//        Obj[] objArr = new Obj[len];
//        
//        for(int i = 0; i < len; i++){
//            objArr[i] = new Obj(genres[i], i, plays[i]);        
//            System.out.println();
//        }        
//        
//        return answer;
//    }
//}
