function solution(money, cost) {
    var answer = 0;
    let m = money;
    let level = -99;
    
    for (let i=0; i<cost.length; i++) {
        level = 0;
        for (let j=i; j<cost.length; j++) {
            if (m >= cost[j]) {
                console.log("1")
                m -= cost[j];
                level++;
            } else if (level != 0) {
                console.log("2")
                level = 0;
            }
            if (answer <= level) {
                answer = level;
            }
        }
    }
    return answer;
}
