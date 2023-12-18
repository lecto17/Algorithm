const balances = [25, 10, 5, 1];
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
  console.log("shi: ", input.shift());
  const answer = [];

  for (const money of input) {
    answer.push(solution(Number(money)));
  }

  console.log(answer.join("\n"));
  return answer.join("\n");
  process.exit();
});
