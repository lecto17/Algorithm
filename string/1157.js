function solution(text) {
  const answerMap = new Map();

  text.forEach((el) => {
    const value = answerMap.get(el);
    if (value) {
      answerMap.set(el, value + 1);
    } else {
      answerMap.set(el, 1);
    }
  });

  const array = Array.from(answerMap, ([key, value]) => ({ [key]: value }));
  array.sort((a, b) => Object.values(b)[0] - Object.values(a)[0]);

  if (array.length === 1) {
    console.log(Object.keys(array[0])[0]);
    return;
  }

  const [key, val] = Object.entries(array[0])[0];
  const [_, val2] = Object.entries(array[1])[0];

  if (val === val2) {
    console.log("?");
  } else {
    console.log(key);
  }
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
  solution(input[0].split("").map((el) => el.toUpperCase()));
  process.exit();
});
