// 최적 풀이
//
//function solution(s) {
//    var answer = s;
//    let numbers = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    
//    for (let i=0; i<numbers.length; i++) {
//        answer = answer.split(numbers[i]);
//        answer = answer.join(i);
//    }
//    return Number(answer);
}

function check(str) {
    switch (str) {
        case "zero":
            return '0';
        case "one":
            return '1';
        case "two":
            return '2';
        case "three":
            return '3';
        case "four":
            return '4';
        case "five":
            return '5';
        case "six":
            return '6';
        case "seven":
            return '7';
        case "eight":
            return '8';
        case "nine":
            return '9';
        default:
            return "";

    }
}

function solution(s) {
    var answer = "";
    let temp = "";
    let tmp = "";

    for (let i=0; i<s.length; i++) {
        temp = s.slice(i, i+1);
        if (temp*1 >= 0) {
            answer += temp;

        } else {
            tmp += temp;
            if (check(tmp)) {
                answer += check(tmp);
                tmp = "";
            }
        }
    }

    return answer*1;
}
