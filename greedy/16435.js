function solution(initialValue, foods) {
  let answer = initialValue;

  for (let idx = 0; idx < foods.length; idx++) {
    if (answer < foods[idx]) {
      console.log(answer);
      return;
    }

    answer++;
  }

  console.log(answer);
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
  let initialValue = parseInt(input[0].split(" ")[1]);

  let list = input[1]
    .split(" ")
    .map((el) => parseInt(el))
    .sort((a, b) => a - b);

  solution(initialValue, list);
});
