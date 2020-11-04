//주석 친 부분으로 iterator를 사용하지 않고도 해결할 수 있다.
//
//문제
//Array that contains product's price 
//please select the most commonly used price as the output
//EX) Input : [500, 200, 300, 400, 500, 600, 400, 500] / Output : 500

import java.util.*;

public class Test1 {

    public static void main(String[] args){
	int[] input = {500, 200, 300, 400, 500, 600, 400, 500};
	int value = -1;
	Integer index = 0;
	int len = input.length;
	Map<Integer, Integer> map = new HashMap<>();
	//int big = N[0];
	//
	
	for(int i = 0; i < len; i++){
	    if(map.get(input[i]) == null)
		map.put(input[i], 1);
	    else
		map.put(input[i], map.get(input[i]) + 1);

//	    if(map.get(big) < map.get(input[i])){
//		big = input[i];
//	    }
	}

	//return map.get(big);
	
	Iterator<Integer> keys = map.keySet().iterator();

	for(Integer itr : keys){
	    if(value < map.get(itr){
		value = map.get(itr);
		index = itr;
	    }
	}
	
	return index;
    }
}
