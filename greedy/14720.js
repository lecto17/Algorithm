const DRINKS = [0, 1, 2];

function solution(milkStores) {
  let answer = 0;
  let drinkIdx = 0;

  for (let idx = 0; idx < milkStores.length; idx++) {
    if (DRINKS[drinkIdx] === milkStores[idx]) {
      drinkIdx = (drinkIdx + 1) % DRINKS.length;
      answer++;
    }
  }

  console.log(answer);
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
  const milkStores = input[1].split(" ").map((el) => parseInt(el));

  return solution(milkStores);
});
