function solution(input) {
  let count = parseInt(input[0].split(" ")[0]) - 1;
  let answer = getAnswer(count, input.slice(1));
  console.log(answer);
  return answer;
}

function getAnswer(count, input) {
  let aLongTimeAgo = false,
    noAnswer = false;
  let answers = [],
    timeToGo = 0,
    timeToPast = 0;

  const sortedInput = input
    .map((el) => el.split(" ").map((e) => parseInt(e)))
    .reduce((acc, cur) => {
      let key = cur[0],
        value = cur[1],
        time = cur[2];

      if (acc[key]) {
        if (acc[key] === value) {
          acc[key][value] = Math.min(
            time,
            acc[key][value] || Number.MAX_SAFE_INTEGER
          );
        }
        acc[key] = {
          ...acc[key],
          [value]: time,
        };
      } else {
        acc[key] = {
          [value]: time,
        };
      }
      return acc;
    }, {});

  for (let i = 1; i <= count; i++) {
    // 가는 방법이 없는 경우
    if (
      !sortedInput[i] ||
      !Object.keys(sortedInput[i]).some((el) => parseInt(el) === i + 1)
    ) {
      noAnswer = true;
      break;
    }

    if (sortedInput[i][i + 1] >= 0) {
      timeToGo += sortedInput[i][i + 1];
    } else {
      timeToPast += sortedInput[i][i + 1];
    }
  }

  // 무한정 되돌아 갈 수 있는 경우
  if (timeToGo + (timeToPast || 0) <= 0) {
    aLongTimeAgo = true;
  }
  if (aLongTimeAgo) return -1;

  if (answers.length || timeToGo) {
    answers.push(
      ...Array.from({ length: Math.abs(timeToPast || 0) + 1 }).map(
        (_, idx) => timeToGo - idx
      )
    );
    noAnswer && answers.push(-1);
  }
  return answers.join("\n");
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
  solution(input);
  process.exit();
});
