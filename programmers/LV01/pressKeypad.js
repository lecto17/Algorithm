function check(ld, rd, number, hand) {
    let result;
    let obj = {
        "1": {x: 0, y: 3},
        "2": {x: 1, y: 3},
        "3": {x: 2, y: 3},
        "4": {x: 0, y: 2},
        "5": {x: 1, y: 2},
        "6": {x: 2, y: 2},
        "7": {x: 0, y: 1},
        "8": {x: 1, y: 1},
        "9": {x: 2, y: 1},
        "*": {x: 0, y: 0},
        "0": {x: 1, y: 0},
        "#": {x: 2, y: 0},
    }
    let leftDiff = Math.abs(obj[number].x - obj[ld].x) + Math.abs(obj[number].y - obj[ld].y);
    let rightDiff = Math.abs(obj[number].x - obj[rd].x) + Math.abs(obj[number].y - obj[rd].y);
    
    if (leftDiff < rightDiff) result = 'L';
    else if (rightDiff < leftDiff) result = 'R';
    else if (rightDiff == leftDiff) {
        hand === "right" ? result = 'R' : result = 'L'
    }
    
    return result;
}

function solution(numbers, hand) {
    var answer = '';
    let ld="*", rd="#";
    
    numbers.map((number) => {
        switch (number) {
            case 1:
            case 4:
            case 7:
                ld = number;
                answer += 'L';
                break;
            case 3:
            case 6:
            case 9:
                rd = number;
                answer += 'R';
                break;
            default:
                let temp = check(ld, rd, number,  hand);
                answer += temp;
                temp === 'R' ? rd = number : ld = number;
                break;
        }
    })
    return answer;
}
