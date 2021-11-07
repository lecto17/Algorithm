function getRank(count) {
    if (count >= 6)
        return 1;
    else if (count === 5)
        return 2;
    else if (count === 4)
        return 3;
    else if (count === 3)
        return 4;
    else if (count === 2)
        return 5;
    else
        return 6;
}

function solution(lottos, win_nums) {
    var answer = [];
    let idx, count=0;
    let len = lottos.length;
    
    for (let i=0; i<len; i++) {
        idx = win_nums.indexOf(lottos[i]);
        if (idx !== -1) {
            count++;
            lottos.splice(i, 1, -1);
        }
    }
    
    let zeroCnt = lottos.filter(el => el === 0).length;
    
    answer.push(getRank(count));
    answer.push(getRank(count + zeroCnt));
    
    answer.sort()
    
    return answer;
}
