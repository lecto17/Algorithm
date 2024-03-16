function solution(text) {
  const alphabetMap = new Map();
  const alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
  alphabet.forEach((el) => {
    alphabetMap.set(el, -1);
  });

  const splitedText = text.split("");

  for (let i = 0; i < splitedText.length; i++) {
    const splited = splitedText[i];

    if (alphabetMap.get(splited) === -1) {
      alphabetMap.set(splited, i);
    }
  }

  let answer = [];
  for (const item of alphabetMap.values()) {
    answer.push(item.toString());
  }

  console.log(answer.join(" ").trim());
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
