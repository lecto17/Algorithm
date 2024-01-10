/**
 * 1541 번
 * [ 테스트 케이스 ]
 * 10+30
 * 10+30-20
 * 10-30+20
 * 10-30-20
 *
 * 10-20-30-40-50
 * 10-20+30-40+50
 * 0+3+20-30-10+50-35
 *
 * [ 풀이 방법 ]
 * 1. - 시작 + 인 숫자들은 하나의 괄호로 한다.
 * 2. - 으로 시작하고 +가 중간에 있다가 -를 다시 만나게 되면 괄호를 - 전에 닫고 새로운 괄호를 생성한다.
 */

function solution(num) {
  let answer = "";
  let total = num;

  for (const balance of balances) {
    answer += `${Math.floor(total / balance)} `;
    total -= Math.floor(total / balance) * balance;
  }
  return answer;
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
  const numbers = input[0].split();
  solution();
  process.exit();
});
