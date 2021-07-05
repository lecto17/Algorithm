function solution(k, rates) {
    var answer = 0;
    let money = k;
    let dollar=0;
    
    for (let i=0; i<rates.length; i++) {
        if (i== rates.length-1) {
            if (dollar) {
                money += rates[i] * dollar;
            }
        }
        for (let j=i+1; j<rates.length; j++) {
            //살수 있는 돈이 있고, 훗날 환율이 지금 환율보다 비싸면 buy
            if (money >= rates[i] && rates[i] < rates[j]) {
                dollar = Math.floor(money / rates[i]);
                if (dollar>=1) dollar=1;
                money -= rates[i] * dollar;
                break;
            } else if (money >= rates[i] && rates[i] >= rates[j]) {
                break;
                //현재 money보다는 싸지만 그 이후에 떠 싼 것이 있다면 pass 
            } else if (money <= rates[i]) {
                //원화가 환율보다 싼경우
                //달러를 사들이지 않았다면
                if (!dollar) break;
                
                //현재 사들인 dollar가 있고 환율이 사들인 것보다 비싸고, 훗날의 환율보다 비싸면 sell
                if (dollar && rates[i] >= rates[i+1]) {
                    money += rates[i] * dollar;
                    dollar = 0;
                    break;
                }
                else if (dollar && rates[i] <= rates[i+1]) {
                    ;
                }
            }
        }
    }
    return money;
}
