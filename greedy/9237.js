function solution(initialValue, trees) {
  let minimum = initialValue + 1;
  let biggest = trees[0];
  let idxOfBiggest = 0;

  for (let idx = 0; idx < trees.length - 1; idx++) {
    if (biggest <= trees[idx + 1]) {
      idxOfBiggest = idx + 1;
    }
  }

  let answer = Math.max(minimum + (biggest - (idxOfBiggest + 1)), 0);

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
  let initialValue = parseInt(input[0]);

  let list = input[1]
    .split(" ")
    .map((el) => parseInt(el))
    .sort((a, b) => b - a);

  solution(initialValue, list);
});
