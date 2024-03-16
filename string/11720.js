function solution(numbers) {
  console.log(numbers.reduce((acc, prev) => (acc += prev)));
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
  solution(input[1].split("").map((el) => parseInt(el)));
  process.exit();
});
