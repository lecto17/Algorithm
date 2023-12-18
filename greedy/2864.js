function solution(list) {
  const maximum = list.reduce((acc, a) => (acc += a), 0);
  list = list.map((el) => parseInt(el.toString().replace(/6/g, 5)));
  const minimum = list.reduce((acc, a) => (acc += a), 0);

  const answer = minimum + " " + maximum;
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
  //띄어쓰기 기준으로 배열에 넣기
  // console.log("ddd: ", input[0].split(" "));
  let list = input[0].split(" ").map((el) => parseInt(el.replace(/5/g, "6")));
  solution(list);
  process.exit();
});
