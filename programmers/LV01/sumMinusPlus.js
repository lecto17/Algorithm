// reduce를 활용해서 풀 것!
//
function solution(absolutes, signs) {
    let answer = 0;
    
    for(let i=0; i<absolutes.length; i++) { 
        if (signs[i])
            answer += absolutes[i];
        else 
            answer += -1*absolutes[i];
    }
    return answer;
}
