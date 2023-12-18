function solution(list) {
  list.sort().pop();

  if (!list.length) {
    console.log(0);
    return 0;
  }

  const answer = list.reduce((acc, a) => (acc += a), 0);
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
  // let n = parseInt(input[0]);
  //띄어쓰기 기준으로 배열에 넣기
  let list = input[1].split(" ").map((el) => parseInt(el));
  solution(list);
  process.exit();
});
