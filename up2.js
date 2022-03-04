function solution(n) {
    
    let answer = -2;
    let len = p.length;
    
    if (len > 1) {

	if (p[len-2] - p[len-1] < 0) {
	    //14-15
	    if (p[len-2] === 14) return 0;
	    answer = 1;
	} else {
	    //1-0
	    if (p[len-2] === 1) return 1;
	    answer = 0;
	}
    } else {
	answer = -1;
    }

    return answer;
}
