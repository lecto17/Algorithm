const PAYMENT = 1000;
const balances = [500, 100, 50, 10, 5, 1];

function solution(n) {
  const totalRefund = PAYMENT - n;
  let refund = totalRefund;
  let count = 0,
    temp = 0;

  for (const balance of balances) {
    temp = Math.floor(refund / balance);
    console.log(Math.floor(refund / balance), parseInt(refund / balance));
    count += temp;
    refund -= balance * temp;

    // if (refund <= 0) break;
  }

  console.log(count);
  return count;
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
  let n = parseInt(input[0]);
  //띄어쓰기 기준으로 배열에 넣기
  solution(n);
  process.exit();
});
