function solution(s) {
    let answer = 0;
    let left = '';
    let right = '';
    let result = [];
  
    for (let i = 1; i < Math.ceil(s.length / 2) + 1; i++) {
        result.push([]);
        // i = length
        let cnt = 1;
        for (let k = 0; k < s.length; k++) {
            left = s.substr(k * i, i);
            right = s.substr((k * i) + i, i);
            
            if (left === right) {
                cnt += 1;
            }
            else {
                if (cnt > 1) {
                    result[i - 1] += String(cnt) + left;
                }
                else {
                    result[i - 1] += left;
                }
                cnt = 1;
            }
        }
    }
    
    let min = result[0].length;
    for (let i in result) {
        if (min > result[i].length) {
            min = result[i].length;
        }
    }
    return min;
}
