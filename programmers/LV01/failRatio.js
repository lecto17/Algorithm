function solution(N, stages) {
    var answer = [];
    let ratio;
    let totalNum = stages.length;
    let cnt;
    
    for (let i=1; i<=N; i++) {
        cnt = stages.filter(el => el === i).length;
        ratio = cnt / totalNum;
        totalNum -= cnt;
        answer.push({idx: i, ratio: ratio});
    }
    
    answer.sort((a, b) => {
        if (a.ratio === b.ratio) {
            return a.idx - b.idx;
        } else {
            return b.ratio - a.ratio;
        }
    })
    
    return answer.map(el => el.idx);
}
