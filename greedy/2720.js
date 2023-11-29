const balances = [25, 10, 5, 1];

function solution(money) {
  let answer = "";
  let total = money;

  console.log("mo: ", money);

  for (const balance of balances) {
    answer += `${Math.floor(total / balance)} `;
    total -= parseInt(total / balance) * balance;
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
  const answer = [];

  input.shift();

  for (const money of input) {
    answer.push(solution(Number(money)));
  }

  console.log(answer.join("\n"));
  return answer.join("\n");
  process.exit();
});
