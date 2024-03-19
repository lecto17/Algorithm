function solution(texts) {
  let answer = "";
  for (let i = 0; i < texts.length; i++) {
    const [count, text] = texts[i].split(" ");

    answer = text
      .split("")
      .map((el) => Array.from({ length: count }, () => el))
      .flat(Infinity)
      .join("");

    console.log(answer);
    answer = "";
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
  input.shift();
  solution(input);
  process.exit();
});
