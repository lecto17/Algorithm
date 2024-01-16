/**
 * 1541 번
 * [ 테스트 케이스 ]
 * 10+30 => 40
 * 10+30-20 => 20
 * 10-30+20 => -40
 * 10-30+20+10 => -50
 * 10-30-20 => -40
 *
 * 10-20-30-40-50 => -130
 * 10-20+30-40+50 => -130
 * 0+3+20-30-10+50-35 => -102
 * 0+3+20-30-10+20+50-35 => -122
 *
 * [ 풀이 방법 ]
 * 1. - 시작 + 인 숫자들은 하나의 괄호로 한다.
 * 2. - 으로 시작하고 +가 중간에 있다가 -를 다시 만나게 되면 괄호를 - 전에 닫고 새로운 괄호를 생성한다.
 */

function solution(numbers, chars) {
  let alreadyMeetMinusFlag = false;
  let sum = 0,
    sumOfBracket = 0;

  sum += parseInt(numbers.shift());
  for (let i = 0; i < chars.length; i++) {
    if (chars.charAt(i) === "+") {
      if (alreadyMeetMinusFlag) {
        sumOfBracket += parseInt(numbers.shift());

        if (chars.charAt(i + 1) === "+") {
          continue;
        }
        sum -= sumOfBracket;
        sumOfBracket = 0;
        alreadyMeetMinusFlag = false;
        continue;
      }

      sum += parseInt(numbers.shift());
      continue;
    }

    // char is '-'
    alreadyMeetMinusFlag = true;
    sumOfBracket += parseInt(numbers.shift());
  }

  console.log(sum - sumOfBracket);
}

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
rl.on("line", function (line) {
  //여러줄 입력
  input.push(line);
}).on("close", function () {
  // 숫자, 문자 배열을 각각 갖고 있는게 좋을까?
  const numbers = input[0].split(/[+,-]/);
  const chars = input[0].replace(/\d/g, "");
  solution(numbers, chars);
  process.exit();
});
