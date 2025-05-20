function solution(ingredient) {
    var answer = 0;
    let stack = [];
    
    for (let i = 0; i < ingredient.length; i++) {
        stack.push(ingredient[i]);
        
        if (stack.length >= 4) {
            const last = stack.slice(-4).join("");
            
            if (last === "1231") {
                answer++;
                stack.splice(-4, 4);
            }
        }
    }
    
    return answer;
}