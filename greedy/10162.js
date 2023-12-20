const buttons = [300, 60, 10];
const answer = [];

function deductTime(time, buttonIdx) {
  const quo = parseInt(time / buttons[buttonIdx]);

  if (quo) {
    answer.push(quo);
    time -= buttons[buttonIdx] * quo;
    return time;
  }

  answer.push(0);
  return time;
}

function solution(totalTime) {
  if (!(totalTime % 10 === 0)) {
    // 백준에서는 console.log로 정답을 메기나 보다,,
    console.log(-1);
    return -1;
  }

  let time = totalTime;

  time = deductTime(time, 0);
  time = deductTime(time, 1);
  time = deductTime(time, 2);

  console.log(answer.join(" "));
  return answer.join(" ");
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
  const totalTime = input[0];

  return solution(Number(totalTime));
});
