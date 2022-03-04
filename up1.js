function solution(k) {
	let answer = 0, delimeter = 0;

	for (let i=1; i<=k; i++) {
	   if (answer < k) {
		answer += i;
	   } else if (answer >= k) {
		if (answer > k) answer -= (i-1);
		delimeter = i - 1;
		break;
	   }
	}


	return k - answer === 0 ? delimeter : k - answer;
}
