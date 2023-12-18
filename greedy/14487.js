function solution(list) {
  // list.sort().pop();
  // console.log("dd: ", list);
  // if (!list.length) return 0;
  let biggest = 0;
  const sum = list.reduce((acc, a) => {
    if (biggest < a) biggest = a;
    return (acc += a);
  }, 0);

  console.log(sum - biggest);
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
