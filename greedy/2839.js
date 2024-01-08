const POCKETS = [5, 3];

function solution(n) {
  let answer = -1;
  let candidate = 9999;

  answer = getRecursive(n, POCKETS[0], POCKETS[1]);
  if (answer) {
    candidate = answer;
  }

  answer = getRecursive(n, POCKETS[1], POCKETS[0]);
  if (answer) {
    if (candidate > answer) {
      console.log(answer);
      return;
    }
    console.log(candidate);
    return;
  }

  if (
    (!answer && candidate === 9999) ||
    (answer === -1 && candidate === 9999)
  ) {
    console.log("-1");
    return;
  }

  console.log(candidate);
}

function getRecursive(weight, pocket1, pocket2) {
  let quo = Math.floor(weight / pocket1);
  let cnt = 0;

  while (quo > 0) {
    if ((weight - quo * pocket1) % pocket2 === 0) {
      cnt = quo + (weight - quo * pocket1) / pocket2;
      break;
    }

    quo--;
  }

  if (cnt === 0) return "";

  return cnt;
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
