const SCORE = {};
const MAX = 10;

function getScoring(string) {
  for (let i = 0; i < string.length; i++) {
    const key = string.charAt(i);
    if (SCORE[key]) {
      SCORE[key] += Math.pow(10, string.length - (i + 1));
    } else {
      SCORE[key] = Math.pow(10, string.length - (i + 1));
    }
  }
}

function getAnswer(words) {
  // 제일 큰 수부터 9부터 0까지 할당
  const sorted = Object.entries(SCORE)
    .sort((a, b) => b[1] - a[1])
    .map(([key, _], idx) => [key, MAX - (idx + 1)]);

  // 문자 별 할당된 숫자 치환 및 합산
  return words.reduce((acc, cur) => {
    const number = Number(
      cur
        .split("")
        .map((char) => {
          return sorted.find(([key]) => key === char)[1];
        })
        .join("")
    );

    return acc + number;
  }, 0);
}

function solution(input) {
  const words = input.slice(1);

  words.forEach((string) => getScoring(string.trim()));

  const answer = getAnswer(words);
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
  return solution(input);
});
