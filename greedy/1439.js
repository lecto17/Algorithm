function solution(numbers) {
  let countOfGroupOne = 0,
    countOfGroupZero = 0;
  let current = numbers.charAt(0);

  current == 0 ? countOfGroupZero++ : countOfGroupOne++;

  for (let i = 1; i < numbers.length; i++) {
    if (current == 1) {
      if (numbers.charAt(i) != current) {
        countOfGroupZero++;
        current = 0;
      }
    } else {
      if (numbers.charAt(i) != current) {
        countOfGroupOne++;
        current = 1;
      }
    }
  }

  console.log(Math.min(countOfGroupZero, countOfGroupOne));
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
  solution(input[0]);
  process.exit();
});
