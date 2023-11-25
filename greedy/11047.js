const input = [];
const strToNumArr = (str) =>
  str.split(" ").map((numString) => Number(numString));

function solution(payed, balances) {
  let count = 0;
  let payment = parseInt(payed, 10);

  for (const balance of balances) {
    const quo = Math.floor(payment / balance);
    if (quo) {
      payment -= quo * balance;
      count += quo;
    }

    if (!payment) break;
  }
  console.log(count);
}

require("readline")
  .createInterface(process.stdin, process.stdout)
  .on("line", function (line) {
    input.push(line.trim());
  })
  .on("close", function () {
    const [N, K] = strToNumArr(input.shift());
    const balances = input.map((v) => Number(v)).sort((a, b) => b - a);

    solution(K, balances);
  });
