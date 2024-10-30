let INFORMATION = [];

function initialize(input) {
  for (let i = 0; i < input.length; i++) {
    const [w, v] = input[i].split(" ").map((el) => Number(el));
    INFORMATION.push({ w, v });
  }
}

function getAnswer(weights) {
  let answer = 0;

  for (let i = 0; i < weights.length; i++) {
    const weight = weights[i];

    const temp = INFORMATION.filter(({ w }) => weight >= w).map(({ v }) => v);
    const max = Math.max(...temp);

    answer += max;
    const index = INFORMATION.findIndex(({ w, v }) => weight >= w && v === max);
    INFORMATION = INFORMATION.filter((_, i) => i !== index);
  }
  return answer;
}

function solution(input) {
  const [N, _] = input[0].split(" ").map((el) => Number(el));
  const info = input.slice(1, N + 1);
  const weight = input
    .slice(N + 1)
    .map((el) => Number(el))
    .sort((a, b) => b - a);

  initialize(info);
  console.log(getAnswer(weight));
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
  return solution(input);
});
